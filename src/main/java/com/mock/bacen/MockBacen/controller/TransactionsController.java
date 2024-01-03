package com.mock.bacen.MockBacen.controller;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping(value = "/transaction")
public class TransactionsController {

    @RateLimiter(name = "bacenEndpoint")
    @PostMapping("/informed")
    public ResponseEntity<String> transactionRegistered(
            @RequestHeader(value = "issuerTo") String issuerTo,
            @RequestHeader(value = "numberTo") String numberTo,
            @RequestHeader(value = "issuerFrom") String issuerFrom,
            @RequestHeader(value = "numberFrom") String numberFrom) throws Exception {

        return ResponseEntity.ok().body("Transaction between these to accounts were registered with success!");
    }
}
