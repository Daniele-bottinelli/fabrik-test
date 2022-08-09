package it.omicron.service;
import it.omicron.dto.TransactionDto;


public interface TransactionService {
    TransactionDto getTransaction(Long accountId, String fromDate, String toDate);
}
