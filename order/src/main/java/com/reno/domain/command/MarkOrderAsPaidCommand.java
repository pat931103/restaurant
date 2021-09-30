package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 *
 * @author reno
 * @since 2021/9/30 11:59 上午
 */
@Getter
@RequiredArgsConstructor
public class MarkOrderAsPaidCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
}
