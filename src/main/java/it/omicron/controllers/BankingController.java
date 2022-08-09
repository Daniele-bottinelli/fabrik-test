package it.omicron.controllers;

import it.omicron.dto.BalanceDto;
import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import it.omicron.dto.TransactionDto;
import it.omicron.entities.MoneyTransfer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;


@RestController
@RequestMapping("omicron/api")
public interface BankingController {

    @GetMapping("/transactions")
    ResponseEntity<TransactionDto> getTransactions(@Valid @RequestParam Long accountId,
                                                   @RequestParam("fromAccountingDate")String fromDate,
                                                   @RequestParam("toAccountingDate") String toDate);

    @GetMapping("/balance")
    ResponseEntity<BalanceDto> getBalance(@Valid @RequestParam Long accountId);

    @PostMapping("/moneyTransfer")
    ResponseEntity<MoneyTransfer> save(@Valid @RequestParam("accountId") Long accountId,
                                               @RequestParam("receiverName") String receiverName,
                                               @RequestParam("description") String description,
                                               @RequestParam("currency") String currency,
                                               @RequestParam("executionDate") String executionDate,
                                               @RequestBody MoneyTransferRequest moneyTransferRequest);
}
