package it.omicron.rest;

import it.omicron.dto.TransactionDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TransactionRestConnectorImpl implements TransactionRestConnector {

    private final TransactionRest transactionRest;
    private final String apikey;
    private final String auth;


    public TransactionRestConnectorImpl(TransactionRest transactionRest,
                                        @Value("${rest.service.apikey}") String apikey,
                                        @Value("${rest.service.auth}") String auth) {
        this.transactionRest = transactionRest;
        this.apikey = apikey;
        this.auth = auth;

    }

    @Override
    public TransactionDto getTransaction(Long accountId, String fromDate, String toDate) {
        return transactionRest.getTransaction(accountId,fromDate,toDate, apikey, auth);
    }
}
