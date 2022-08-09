package it.omicron.controllers;

import it.omicron.dto.BalanceDto;
import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import it.omicron.dto.TransactionDto;
import it.omicron.entities.MoneyTransfer;
import it.omicron.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;


@RestController
public class BankingControllerImpl implements BankingController {
    @Autowired
    BankingService bankingService;

    @Override
    public ResponseEntity<TransactionDto> getTransactions(Long accountId, String fromDate, String toDate){
        TransactionDto transactionDto = bankingService.getTransaction(accountId,fromDate,toDate);

        return new ResponseEntity<>(transactionDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BalanceDto> getBalance(Long accountId) {
        BalanceDto balanceDto = bankingService.getBalance(accountId);
        return new ResponseEntity<>(balanceDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MoneyTransfer> save(Long accountId, String receiverName,
                                                      String description, String currency,
                                                      String executionDate, MoneyTransferRequest moneyTransferRequest) {
        MoneyTransfer moneyTransfer = bankingService.saveMoneyTransfer(accountId,receiverName,description,currency,executionDate,moneyTransferRequest);
        return new ResponseEntity<>(moneyTransfer, HttpStatus.OK);
    }


}
