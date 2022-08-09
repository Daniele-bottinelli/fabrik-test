package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AmountDto {
    private Number debtorAmount;
    private String debtorCurrency;
    private Number creditorAmount;
    private String creditorCurrency;
    private Date creditorCurrencyDate;
    private Number exchangeRate;

}
