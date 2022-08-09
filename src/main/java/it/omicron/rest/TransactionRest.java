package it.omicron.rest;

import it.omicron.dto.TransactionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@FeignClient(name="${rest.service.transaction.name}",url="${rest.service.base.url}")
public interface TransactionRest {

    @GetMapping(value="/api/gbs/banking/v4.0/accounts/{accountId}/transactions",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    TransactionDto getTransaction (@PathVariable("accountId") Long accountId,
                                   @RequestParam("fromAccountingDate") String fromDate,
                                   @RequestParam("toAccountingDate") String toDate,
                                   @RequestHeader("Api-key") String apiKey,
                                   @RequestHeader("Auth-Schema") String auth);


}
