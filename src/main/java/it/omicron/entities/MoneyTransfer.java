package it.omicron.entities;

import it.omicron.dto.CreditorDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MoneyTransfer {
    private CreditorDto creditor;
    private String description;
    private Number amount;
    private String currency;
}
