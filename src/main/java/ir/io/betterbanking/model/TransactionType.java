package ir.io.betterbanking.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum TransactionType {
    CASH, NON_CASH, CREDIT
}
