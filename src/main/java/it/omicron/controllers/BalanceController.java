package it.omicron.controllers;

import it.omicron.dto.BalanceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("omicron/api")
public interface BalanceController {

    @GetMapping("/balance")
    ResponseEntity<BalanceDto> getBalance(@Valid @RequestParam Long accountId);

}
