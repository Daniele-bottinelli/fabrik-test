package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Enumeration;
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionPayloadDto {

    private String transactionId;
    private String operationId;
    private Date accountingDate;
    private Date valueDate;
    private TypeDto type;
    private Number amount;
    private String currency;
    private String description;
}
