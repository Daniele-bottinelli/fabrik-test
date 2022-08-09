package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalancePayloadDto {
    private Date date;
    private Number balance;
    private Number availableBalance;
    private String currency;
}
