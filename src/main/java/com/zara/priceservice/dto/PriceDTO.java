package com.zara.priceservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceDTO {

    private Long productId;
    private Long brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal price;

}
