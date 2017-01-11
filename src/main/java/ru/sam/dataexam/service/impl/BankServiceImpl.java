package ru.sam.dataexam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sam.dataexam.model.Bank;
import ru.sam.dataexam.repository.BankRepository;
import ru.sam.dataexam.service.BankService;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository repository;

    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = repository.saveAndFlush(bank);
        return savedBank;
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return repository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll() {
        return repository.findAll();
    }
}
