package simplejavacalculator.Strategy;

import simplejavacalculator.Calculator;

import static java.lang.Math.pow;

public class BicalculationStrategy extends CalculateStrategy {
    BicalculationStrategy(Calculator calulator) {
        super(calulator);
    }

    private Double calculateBiImpl() {
        double num2 = calulator.num2;
        double num1 = calulator.num1;
        if (calulator.mode.equals(Calculator.BiOperatorModes.normal)) {
            return num2;
        }
        if (calulator.mode.equals(Calculator.BiOperatorModes.add)) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (calulator.mode.equals(Calculator.BiOperatorModes.minus)) {
            return num1 - num2;
        }
        if (calulator.mode.equals(Calculator.BiOperatorModes.multiply)) {
            return num1 * num2;
        }
        if (calulator.mode.equals(Calculator.BiOperatorModes.divide)) {
            return num1 / num2;
        }
        if (calulator.mode.equals(Calculator.BiOperatorModes.xpowerofy)) {
            return pow(num1,num2);
        }

        // never reach
        throw new Error();
    }

    @Override
    public double calculationProcess() {

        double ans = calculateBiImpl();
        return ans;
    }


}
