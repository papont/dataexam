package ru.sam.dataexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sam.dataexam.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
}
