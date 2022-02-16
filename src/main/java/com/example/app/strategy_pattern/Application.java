package com.example.app.strategy_pattern;

import com.example.app.strategy_pattern.context.StrategyContext;
import com.example.app.strategy_pattern.strategy.impl.ByAStrategy;
import com.example.app.strategy_pattern.strategy.impl.ByBStrategy;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        StrategyContext strategyContext = new StrategyContext();
        strategyContext.addStrategy(new ByAStrategy());
        strategyContext.addStrategy(new ByBStrategy());

        strategyContext.execute(getRandomInt());
    }

    static int getRandomInt() {
        Random random = new Random();
        int i = random.nextInt(10 - 1) + 1;
        System.out.println("Generated int = "+ i);
        return i;
    }

}
