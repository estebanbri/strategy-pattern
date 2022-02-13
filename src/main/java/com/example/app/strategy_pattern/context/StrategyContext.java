package com.example.app.strategy_pattern.context;

import com.example.app.strategy_pattern.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyContext {

    List<Strategy> strategies = new ArrayList<>();

    public Strategy getStrategy (int value) {
        return strategies.stream()
                .filter(strategy -> strategy.isSelected(value))
                .peek((strategy) ->System.out.println("Strategy selected: " + strategy.getClass().getSimpleName().concat("")))
                .findFirst().orElse(null);
    }

    public void addStrategy(Strategy strategy) {
        strategies.add(strategy);
    }

}
