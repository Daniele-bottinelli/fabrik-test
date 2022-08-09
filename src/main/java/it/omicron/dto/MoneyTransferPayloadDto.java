package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class MoneyTransferPayloadDto {

    private CreditorDto creditor;
    private Date executionDate;
    private String uri;
    private String description;
    private Number amount;
    private String currency;
    private Boolean isUrgent;
    private Boolean isInstant;
    private String feeType;
    private String feeAccountId;
    private TaxReliefDto taxRelief;
}
