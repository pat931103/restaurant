package com.reno.domain.command;

import com.reno.domain.OrderId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

/**
 *
 * @author reno
 * @since 2021/9/30 12:00 下午
 */
@Getter
@RequiredArgsConstructor
public class MarkOrderAsPreparedCommand {
    @TargetAggregateIdentifier
    private final OrderId targetAggregateIdentifier;
}
