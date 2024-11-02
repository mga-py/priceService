package com.zara.priceservice.service;

import com.zara.priceservice.dto.PriceDTO;
import com.zara.priceservice.entity.PriceEntity;
import com.zara.priceservice.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PriceService {

    private final PriceRepository priceRepository;

    public PriceDTO findProductPriceByDateAndBrand(Long productId, Long brandId, LocalDateTime date) {

        PriceEntity price = priceRepository.findFirstByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(brandId, productId, date, date).orElse(null);

        if (price != null) {
            return PriceDTO.builder()
                    .productId(price.getId())
                    .brandId(price.getBrandId())
                    .startDate(price.getStartDate())
                    .endDate(price.getEndDate())
                    .price(price.getPrice())
                    .build();
        }
        return null;

    }
}
