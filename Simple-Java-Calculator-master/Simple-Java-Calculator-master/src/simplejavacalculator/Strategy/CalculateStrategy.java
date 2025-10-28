package simplejavacalculator.Strategy;

import simplejavacalculator.Calculator;

public abstract class CalculateStrategy {
    Calculator calulator ;

    CalculateStrategy(Calculator calulator) {
        this.calulator = calulator;
    }

    abstract double calculationProcess() ;
}
