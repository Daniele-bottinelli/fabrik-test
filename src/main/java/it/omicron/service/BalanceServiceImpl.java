package it.omicron.service;

import it.omicron.dto.BalanceDto;
import it.omicron.entities.Balance;
import it.omicron.repository.BalanceRepository;
import it.omicron.rest.BalanceRestConnector;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    BalanceRepository balanceRepository;

    @Autowired
    private BalanceRestConnector balanceRestConnector;

    @Override
    public BalanceDto getBalance(Long accountId) {
        return balanceRestConnector.getBalance(accountId);
    }




}
