package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 * <p>write your description here
 *
 * @since 2021/9/30 11:51 上午
 */
@Getter
@RequiredArgsConstructor
public class MarkOrderAsDeliveryCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentified;
}
