package it.omicron.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.Enumeration;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TypeDto{
    String enumeration;
    String value;


}
