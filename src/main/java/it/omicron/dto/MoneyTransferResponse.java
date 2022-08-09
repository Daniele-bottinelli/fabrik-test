package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoneyTransferResponse {

    private String moneyTransferId;
    private String status;
    private String direction;
    private CreditorDto creditor;
    private DebtorDto debtor;
    private String cro;
    private String trn;
    private String uri;
    private String description;
    private LocalDateTime createDateTime;
    private LocalDateTime accountDateTime;
    private Date debtorValueDate;
    private Date creditorValueDate;
    private AmountDto amountDto;
    private Boolean isInstant;
    private String feeType;
    private String feeAccountID;
    private FeesListDto fees;
    private Boolean hasTaxRelief;
    private ErrorDto errors;
}
