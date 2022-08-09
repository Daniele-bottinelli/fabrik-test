package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeesDto {
    private String feeCode;
    private String description;
    private Number amount;
    private String currency;
}
