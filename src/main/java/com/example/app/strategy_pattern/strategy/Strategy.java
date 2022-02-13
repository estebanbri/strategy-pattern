package com.example.app.strategy_pattern.strategy;

public interface Strategy {
    boolean isSelected(int value);
    Object execute();
}
