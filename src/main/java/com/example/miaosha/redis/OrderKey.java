package com.example.miaosha.redis;

public class OrderKey extends BasePrefix {
    private OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
