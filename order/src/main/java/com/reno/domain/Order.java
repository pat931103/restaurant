package com.reno.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.List;

/**
 * <p>write your description here
 *
 * @since 2021/9/30 10:31 上午
 */
@Aggregate
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {
    @AggregateIdentifier
    private OrderId orderId;
    private OrderState orderState;
    private RestaurantId restaurantId;
    private List<OrderLineItem> orderLineItems;
    private String deliveryAddress;
}
