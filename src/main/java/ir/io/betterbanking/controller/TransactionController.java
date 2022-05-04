package ir.io.betterbanking.controller;

import ir.io.betterbanking.service.TransactionService;
import ir.io.betterbanking.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping(value = "/{acc-number}", produces = APPLICATION_JSON_VALUE)
    List<Transaction> findTransactionsByAccountNumber(@PathVariable("acc-number") String accountNumber){
        return transactionService.findAllByAccountNumber(accountNumber);
    }
}
