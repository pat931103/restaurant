package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * <p>write your description here
 *
 * @since 2021/9/30 11:20 上午
 */
@Getter
@RequiredArgsConstructor
public final class AcceptOrderCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
}
