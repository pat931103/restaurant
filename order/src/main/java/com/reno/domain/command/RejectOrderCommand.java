package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * <p>拒绝订单command
 *
 * @since 2021/9/30 11:18 上午
 */
@Getter
@RequiredArgsConstructor
public final class RejectOrderCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
}
