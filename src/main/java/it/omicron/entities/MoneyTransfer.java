package it.omicron.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFormat
@Entity
public class MoneyTransfer {
    @Id @GeneratedValue
    private int id;
    private Long accountId;
    private String receiverName;
    private String errorCode;
    private String errorDescription;
}
