package com.mock.bacen.MockBacen.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping(value = "/transaction")
public class TransactionsController {

    @PostMapping("/informed")
    public ResponseEntity<String> transactionRegistered(
            @RequestHeader(value = "issuerTo") String issuerTo,
            @RequestHeader(value = "numberTo") String numberTo,
            @RequestHeader(value = "issuerFrom") String issuerFrom,
            @RequestHeader(value = "numberFrom") String numberFrom) throws Exception {

        return ResponseEntity.ok().body("Transaction received with success!");
    }
}
