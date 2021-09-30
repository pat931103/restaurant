package com.reno.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

/**
 *
 * @since 2021/9/30 10:28 上午
 */
@Getter
@RequiredArgsConstructor
public class OrderLineItem {
    private final String menuItemId;
    private final String name;
    private final BigDecimal price;
    /**
     * 数量
     */
    private final Integer quantity;

}
