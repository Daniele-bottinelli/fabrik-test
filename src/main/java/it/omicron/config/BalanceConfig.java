package it.omicron.config;

import it.omicron.rest.BalanceRest;
import it.omicron.rest.MoneyTransferRest;
import it.omicron.rest.TransactionRest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = {BalanceRest.class, TransactionRest.class, MoneyTransferRest.class})
public class BalanceConfig {
}
