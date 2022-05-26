package com.hi.crypto.controller;

import com.hi.crypto.model.CurrencySymbol;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crypto")
public class CryptoInfoController {

    @GetMapping("/latest")
    public ResponseEntity getLatestData() {
        return ResponseEntity.ok().body("Response from live data API");
    }

    @GetMapping("/historical/{currency}")
    public ResponseEntity getHistoricalData(@RequestBody CurrencySymbol currency,
        @RequestParam String startDate, @RequestParam String endDate) {
        return ResponseEntity.ok().body("Response from historical API");
    }
}
