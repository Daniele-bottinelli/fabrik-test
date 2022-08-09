package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LegalPersonBenificiaryDto {
    private String fiscalCode;
    private String legalRepresentativeFiscalCode;
}
