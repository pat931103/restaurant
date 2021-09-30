package com.reno.domain.command;

import com.reno.domain.OrderId;
import com.reno.domain.OrderLineItem;
import com.reno.domain.RestaurantId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.List;

/**
 * <p>用户创建订单command
 *
 * @since 2021/9/30 10:45 上午
 */
@Getter
@RequiredArgsConstructor
public final class PlaceOrderCommand {

    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
    private final RestaurantId restaurantId;
    private final List<OrderLineItem> orderLineItems;
    private final String deliveryAddress;
}
