package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxReliefDto {
    private String taxReliefId;
    private Boolean isCondoUpgrade;
    private String creditorFiscalCode;
    private String beneficiaryType;
    private NaturalPersonBeneficiaryDto naturalPersonBeneficiaryDto;
    private LegalPersonBenificiaryDto legalPersonBenificiaryDto;
}
