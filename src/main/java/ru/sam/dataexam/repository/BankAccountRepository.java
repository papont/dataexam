package ru.sam.dataexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sam.dataexam.model.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{
}
