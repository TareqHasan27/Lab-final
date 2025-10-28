package simplejavacalculator.Strategy;

import simplejavacalculator.Calculator;

import static java.lang.Double.NaN;
import static java.lang.Math.log;
import static java.lang.Math.log10;

public class MonoCalcultionStrategy extends CalculateStrategy {

    MonoCalcultionStrategy(Calculator calulator) {
        super(calulator);
    }

    public Double calculateMono() {
        Calculator.BiOperatorModes newMode = calulator.mode;
        Double num = calulator.num1;
        if (newMode.equals(Calculator.MonoOperatorModes.square)) {
            return num * num;
        }
        if (newMode.equals(Calculator.MonoOperatorModes.squareRoot)) {
            return Math.sqrt(num);
        }
        if (newMode.equals(Calculator.MonoOperatorModes.oneDividedBy)) {
            return 1 / num;
        }
        if (newMode.equals(Calculator.MonoOperatorModes.cos)) {
            return Math.cos(Math.toRadians(num));
        }
        if (newMode.equals(Calculator.MonoOperatorModes.sin)) {
            return Math.sin(Math.toRadians(num));
        }
        if (newMode.equals(Calculator.MonoOperatorModes.tan)) {
            if (num == 0 || num % 180 == 0 ) {
                return 0.0;
            }
            if (num % 90 == 0.0 && num % 180 != 0.0) {
                return NaN;
            }

            return Math.tan(Math.toRadians(num));
        }
        if (newMode.equals(Calculator.MonoOperatorModes.log)) {
            return log10(num);
        }
        if (newMode.equals(Calculator.MonoOperatorModes.ln)) {
            return log(num);
        }
        if (newMode.equals(Calculator.MonoOperatorModes.rate) ) {
            return num / 100;
        }
        if (newMode.equals(Calculator.MonoOperatorModes.abs)){
            return Math.abs(num);
        }

        // never reach
        throw new Error();
    }
    @Override
    public double calculationProcess() {
        double ans = calculateMono();
                return ans;
    }


}
