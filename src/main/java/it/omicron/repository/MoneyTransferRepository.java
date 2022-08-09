package it.omicron.repository;

import it.omicron.entities.MoneyTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyTransferRepository extends JpaRepository<MoneyTransfer, Integer> {
}
