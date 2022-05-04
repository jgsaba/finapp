package ir.io.betterbanking.service;

import ir.io.betterbanking.model.Transaction;
import ir.io.betterbanking.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository repository;

    public List<Transaction> findAllByAccountNumber(String accountNumber){
        return repository.findTransactionsByAccountNumber(accountNumber);
    }

}
