package it.omicron.rest;

import it.omicron.dto.MoneyTransferRequest;
import it.omicron.dto.MoneyTransferResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@FeignClient(name="${rest.service.money.transfer.name}",url="${rest.service.base.url}")
public interface MoneyTransferRest {

    @PostMapping(value="/api/gbs/banking/v4.0/accounts/{accountId}/payments/money-transfers",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    MoneyTransferResponse postMoneyTransfer (@PathVariable("accountId") Long accountId,
                                             @RequestParam("receiverName") String receiverName,
                                             @RequestParam("description") String description,
                                             @RequestParam("currency") String currency,
                                             @RequestParam("executionDate") String executionDate,
                                             @RequestHeader("Api-key") String apiKey,
                                             @RequestHeader("Auth-Schema") String auth,
                                             @RequestBody MoneyTransferRequest moneyTransferRequest);


}
