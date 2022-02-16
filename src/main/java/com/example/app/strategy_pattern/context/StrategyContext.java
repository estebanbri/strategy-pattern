package com.example.app.strategy_pattern.context;

import com.example.app.strategy_pattern.strategy.Strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyContext {

    List<Strategy> strategies = new ArrayList<>();

    public void addStrategy(Strategy strategy) {
        strategies.add(strategy);
    }

    public void execute(int value) {
        final Strategy strategy = this.getStrategy(value);
        strategy.execute();
    }

    private Strategy getStrategy (int value) {
        return strategies.stream()
                .filter(strategy -> strategy.isSelected(value))
                .peek((strategy) ->System.out.println("Strategy selected: " + strategy.getClass().getSimpleName().concat("")))
                .findFirst().orElseThrow(RuntimeException::new);
    }

}
