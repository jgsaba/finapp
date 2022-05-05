package ir.io.betterbanking;

import ir.io.betterbanking.model.Transaction;
import ir.io.betterbanking.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TransactionServiceTest extends TestContainersConfiguration {

    @Autowired
    private TransactionService transactionService;

    @Test
    void testFindTransactionsByAccountNumber(){
        List<Transaction> transactions = transactionService.findAllByAccountNumber("659882");
        assertEquals(1, transactions.size());
    }

}