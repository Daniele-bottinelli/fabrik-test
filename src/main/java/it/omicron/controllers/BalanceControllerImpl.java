package it.omicron.controllers;

import it.omicron.dto.BalanceDto;
import it.omicron.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceControllerImpl implements BalanceController {

    @Autowired
    BalanceService balanceService;


    @Override
    public ResponseEntity<BalanceDto> getBalance(Long accountId) {
        BalanceDto balanceDto = balanceService.getBalance(accountId);
        return new ResponseEntity<>(balanceDto, HttpStatus.OK);
    }
}
