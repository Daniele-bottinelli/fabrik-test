package it.omicron.service;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import it.omicron.dto.BalanceDto;
import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import it.omicron.dto.TransactionDto;
import it.omicron.entities.MoneyTransfer;
import it.omicron.repository.MoneyTransferRepository;
import it.omicron.rest.BalanceRestConnector;
import it.omicron.rest.MoneyTransferRestConnector;
import it.omicron.rest.TransactionRestConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankingServiceImpl implements BankingService {

    @Autowired
    MoneyTransferRepository moneyTransferRepository;
    @Autowired
    private TransactionRestConnector transactionRestConnector;

    @Autowired
    private BalanceRestConnector balanceRestConnector;

    @Autowired
    private MoneyTransferRestConnector moneyTransferRestConnector;

    @Override
    public BalanceDto getBalance(Long accountId) {
        return balanceRestConnector.getBalance(accountId);
    }

    @Override
    public TransactionDto getTransaction(Long accountId,String fromDate, String toDate){
        return transactionRestConnector.getTransaction(accountId,fromDate,toDate);
    }

    @Override
    public MoneyTransfer saveMoneyTransfer(Long accountId, String receiverName,
                                  String description, String currency,
                                  String executionDate, MoneyTransferRequest moneyTransferRequest) {
        MoneyTransferResponse moneyTransferResponse;
        MoneyTransfer moneyTransfer = new MoneyTransfer();
        moneyTransfer.setAccountId(accountId);
        moneyTransfer.setReceiverName(receiverName);
        try {
            moneyTransferResponse = moneyTransferRestConnector.getMoneytransfer(accountId,receiverName,description,currency,executionDate,moneyTransferRequest);

        }catch (FeignException.FeignClientException exception){
            ObjectMapper objectMapper = new ObjectMapper();
            String errorCode;
            String errorDescription;

            try {
                MoneyTransferResponse money = objectMapper.readValue(exception.contentUTF8(), MoneyTransferResponse.class);
                errorCode = money.getErrors().getCode();
                errorDescription = money.getErrors().getDescription();


            }catch (JacksonException e){
                errorCode = String.valueOf(exception.status());
                errorDescription = exception.contentUTF8();
            }
            if(exception.status() == 400){
                moneyTransfer.setErrorCode(errorCode);
                moneyTransfer.setErrorDescription(errorDescription);
            }

        }

       return moneyTransferRepository.save(moneyTransfer);
    }


}
