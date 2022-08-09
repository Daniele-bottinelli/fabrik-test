package it.omicron.controllers;

import it.omicron.dto.TransactionDto;
import it.omicron.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController
public class TransactionControlleImpl implements TransactionController{
    @Autowired
    TransactionService transactionService;

    @Override
    public ResponseEntity<TransactionDto> getTransactions(Long accountId, String fromDate, String toDate) throws ParseException {
        TransactionDto transactionDto = transactionService.getTransaction(accountId,fromDate,toDate);

        return new ResponseEntity<>(transactionDto, HttpStatus.OK);
    }
}
