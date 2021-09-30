package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * <p>标识订单为配送状态command
 *
 * @since 2021/9/30 11:22 上午
 */
@Getter
@RequiredArgsConstructor
public final class MarkOrderAsCollectedCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
}
