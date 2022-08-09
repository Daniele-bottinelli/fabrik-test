package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BalanceDto {
    private String status;
    private BalancePayloadDto payload;
    private ErrorDto errors;


}
