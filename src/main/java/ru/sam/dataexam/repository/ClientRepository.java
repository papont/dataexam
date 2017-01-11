package ru.sam.dataexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sam.dataexam.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
