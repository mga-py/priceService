package com.zara.priceservice.controller;

import com.zara.priceservice.dto.PriceDTO;
import com.zara.priceservice.service.PriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/prices")
@RequiredArgsConstructor
public class PriceController {

    private final PriceService priceService;

    @GetMapping("/product-date")
    public ResponseEntity<PriceDTO> getPriceDate(
            @RequestParam Long productId,
            @RequestParam Long brandId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date) {

        PriceDTO priceOpt = priceService.findProductPriceByDateAndBrand(productId, brandId, date);

        if (priceOpt != null) {
            return ResponseEntity.ok(priceOpt);
        } else {
            return ResponseEntity.notFound().build();

        }
    }


}
