package it.omicron.rest;

import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import org.springframework.stereotype.Service;

@Service
public interface MoneyTransferRestConnector {
    MoneyTransferResponse getMoneytransfer(Long acccountId, String receiverName, String description, String currency, String executionDate, MoneyTransferRequest moneyTransferRequest);
}
