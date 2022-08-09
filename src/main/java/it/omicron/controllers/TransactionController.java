package it.omicron.controllers;

import it.omicron.dto.TransactionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.ParseException;
import java.util.Date;

@RestController
@RequestMapping("omicron/api")
public interface TransactionController {

    @GetMapping("/transactions")
    ResponseEntity<TransactionDto> getTransactions(@Valid @RequestParam Long accountId,
                                                   @RequestParam("fromAccountingDate")String fromDate,
                                                   @RequestParam("toAccountingDate") String toDate) throws ParseException;
}
