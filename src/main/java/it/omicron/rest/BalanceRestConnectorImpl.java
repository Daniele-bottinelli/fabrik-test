package it.omicron.rest;

import it.omicron.dto.BalanceDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BalanceRestConnectorImpl implements BalanceRestConnector {
    private final BalanceRest balanceRest;
    private final String apikey;
    private final String auth;

    public BalanceRestConnectorImpl(BalanceRest balanceRest, @Value("${rest.service.apikey}")String apikey, @Value("${rest.service.auth}")String auth) {
        this.balanceRest = balanceRest;
        this.apikey = apikey;
        this.auth = auth;
    }

    @Override
    public BalanceDto getBalance(Long accountId) {
       return balanceRest.getBalance(accountId,apikey,auth);
    }
}
