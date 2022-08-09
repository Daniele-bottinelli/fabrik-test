package it.omicron.rest;

import it.omicron.dto.BalanceDto;
import org.springframework.stereotype.Service;

@Service
public interface BalanceRestConnector {
    BalanceDto getBalance(Long accountId);
}
