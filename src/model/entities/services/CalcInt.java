package model.entities.services;

import model.entities.services.interfaces.OperationInt;

public class CalcInt implements OperationInt {

    public int applyAdd(int a, int b) {
        return a + b;
    }

    public int applySub(int a, int b) {
        return a - b;
    }

    public int applyDiv(int a, int b) {
        return a / b;
    }

    public int applyMulti(int a, int b) {
        return a * b;
    }
}
