package com.zara.priceservice.repository;

import com.zara.priceservice.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    Optional<PriceEntity> findFirstByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
            Long brandId, Long productId, LocalDateTime startDate, LocalDateTime dateEnd
    );
}