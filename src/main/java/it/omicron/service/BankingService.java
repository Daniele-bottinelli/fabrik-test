package it.omicron.service;
import it.omicron.dto.BalanceDto;
import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import it.omicron.dto.TransactionDto;
import it.omicron.entities.MoneyTransfer;


public interface BankingService {
    BalanceDto getBalance(Long accountId);
    TransactionDto getTransaction(Long accountId, String fromDate, String toDate);
    MoneyTransfer saveMoneyTransfer(Long accountId, String receiverName,
                                    String description, String currency,
                                    String executionDate, MoneyTransferRequest moneyTransferRequest);

}
