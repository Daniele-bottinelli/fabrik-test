package it.omicron.rest;

import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MoneyTransferRestConnectorImpl implements MoneyTransferRestConnector {

    private final MoneyTransferRest moneyTransferRest;
    private final String apikey;
    private final String auth;

    public MoneyTransferRestConnectorImpl(MoneyTransferRest moneyTransferRest,
                                          @Value("${rest.service.apikey}") String apikey,
                                          @Value("${rest.service.auth}") String auth) {
        this.moneyTransferRest = moneyTransferRest;
        this.apikey = apikey;
        this.auth = auth;
    }

    @Override
    public MoneyTransferResponse getMoneytransfer(Long acccountId, String receiverName, String description,
                                                  String currency, String executionDate,
                                                  MoneyTransferRequest moneyTransferRequest) {
        return moneyTransferRest.postMoneyTransfer(acccountId, receiverName, description,
                currency, executionDate, apikey, auth, moneyTransferRequest);
    }
}
