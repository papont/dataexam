package ru.sam.dataexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sam.dataexam.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
