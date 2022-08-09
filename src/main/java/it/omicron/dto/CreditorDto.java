package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class CreditorDto {
    private String name;
    private AccountDto account;
    private AddressDto address;

}
