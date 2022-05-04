package ir.io.betterbanking.repository;

import ir.io.betterbanking.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, String> {

    List<Transaction> findTransactionsByAccountNumber(String accountNumber);
}
