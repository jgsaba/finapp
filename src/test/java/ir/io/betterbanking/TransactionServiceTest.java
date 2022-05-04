package ir.io.betterbanking;

import ir.io.betterbanking.model.Transaction;
import ir.io.betterbanking.service.TransactionService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

    @InjectMocks
    private TransactionService transactionService;

    @Test
    void testFindTransactionsByAccountNumber(){
        List<Transaction> transactions = transactionService.findAllByAccountNumber("223669");
        assertEquals(1, transactions.size());
    }

}