package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class MoneyTransferPayloadDto {

    private CreditorDto creditor;
    private String description;
    private Number amount;
    private String currency;
}
