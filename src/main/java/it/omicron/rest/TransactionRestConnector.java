package it.omicron.rest;

import it.omicron.dto.TransactionDto;
import org.springframework.stereotype.Service;


@Service
public interface TransactionRestConnector {
    TransactionDto getTransaction(Long accountId, String fromDate, String toDate);

}
