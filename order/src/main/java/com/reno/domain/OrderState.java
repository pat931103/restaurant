package com.reno.domain;

/**
 * <p>write your description here
 *
 * @since 2021/9/30 10:22 上午
 */
public enum OrderState {
    /**发出*/
    PLACED,
    /**拒绝*/
    REJECTED,
    /**接受*/
    ACCEPTED,
    /**就绪*/
    PREPARED,
    /**配送*/
    COLLECTED,
    /**过期*/
    EXPIRED,
    /**送达*/
    DELIVERED,
    /**支付*/
    PAID;
}
