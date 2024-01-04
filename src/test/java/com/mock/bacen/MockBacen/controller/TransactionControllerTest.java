package com.mock.bacen.MockBacen.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TransactionControllerTest {

    @InjectMocks
    private TransactionsController controller;
    @Test
    void testTransactionController() {

        Assertions.assertDoesNotThrow(
                () -> controller.transactionRegistered("issuerTo", "numberTo", "issuerFrom", "NumberFrom", "transferAmount"));
    }
}
