package model.entities.services;

import model.entities.services.interfaces.OperationDouble;

public class CalcDouble implements OperationDouble {

    public double applyAdd(double a, double b) { return a + b; }

    public double applySub(double a, double b) {
        return a - b;
    }

    public double applyDiv(double a, double b) {
        return a / b;
    }

    public double applyMulti(double a, double b) {
        return a * b;
    }
}
