package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferDto {
    private String status;
    private MoneyTransferPayloadDto payload;
    private ErrorDto errors;
}
