package it.omicron.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Balance {
    private @Id @GeneratedValue Long id;
    private Date date;
    private Double balance;
    private Double availableBalance;
    private String currency;
}
