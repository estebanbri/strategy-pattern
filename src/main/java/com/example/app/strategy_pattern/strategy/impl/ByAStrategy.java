package com.example.app.strategy_pattern.strategy.impl;

import com.example.app.strategy_pattern.strategy.Strategy;

public class ByAStrategy implements Strategy {

    @Override
    public boolean isSelected(int value) {
        return value < 6;
    }

    @Override
    public Object execute() {
        return "ByAStrategy execute()";
    }
}
