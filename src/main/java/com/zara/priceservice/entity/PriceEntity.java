package com.zara.priceservice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "PRICES")
public class PriceEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "BRAND_ID")
    private Long brandId;
    @Column(name = "START_DATE")
    private LocalDateTime startDate;
    @Column(name = "END_DATE")
    private LocalDateTime endDate;
    @Column(name = "PRICE_LIST")
    private Integer priceList;
    @Column(name = "PRODUCT_ID")
    private Long productId;

    private Integer priority;
    private BigDecimal price;
    private String currency;
}
