package it.omicron.service;


import it.omicron.dto.BalanceDto;

public interface BalanceService {

    BalanceDto getBalance(Long accountId);
}
