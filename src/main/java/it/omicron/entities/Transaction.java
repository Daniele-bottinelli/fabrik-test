package it.omicron.entities;

import it.omicron.dto.TypeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Enumeration;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    private @Id @GeneratedValue Long id;
    private String status;
    private String transactionId;
    private String operationId;
    private Date accountingDate;
    private Date valueDate;
    private String typeEnumeration;
    private String typeValue;
    private Number amount;
    private String currency;
    private String description;
    private String code;
    private String errorDescription;
}
