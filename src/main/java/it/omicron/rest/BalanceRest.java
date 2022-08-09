package it.omicron.rest;

import it.omicron.dto.BalanceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@FeignClient(name="${rest.service.name}",url="${rest.service.base.url}")
public interface BalanceRest {

    @GetMapping(value="/api/gbs/banking/v4.0/accounts/{accountId}/balance",
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    BalanceDto getBalance (@PathVariable("accountId") Long accountId,
                         @RequestHeader("Api-key") String apiKey,
                         @RequestHeader("Auth-Schema") String auth);

}
