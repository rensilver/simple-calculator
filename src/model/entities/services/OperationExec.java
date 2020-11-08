package model.entities.services;

public class OperationExec {

    public OperationExec() {
    }

    CalcDouble cd = new CalcDouble();
    CalcInt ci = new CalcInt();

    public double doubleOperation(double convOne, double convTwo, String operator) {

        switch (operator) {
            case "+":
                return cd.applyAdd(convOne, convTwo);
            case "-":
                return cd.applySub(convOne, convTwo);
            case "/":
                return cd.applyDiv(convOne, convTwo);
            case "*":
                return cd.applyMulti(convOne, convTwo);
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
    
    public int intOperation(int convOne, int convTwo, String operator) {

        switch (operator) {
            case "+":
                return ci.applyAdd(convOne, convTwo);
            case "-":
                return ci.applySub(convOne, convTwo);
            case "/":
                return ci.applyDiv(convOne, convTwo);
            case "*":
                return ci.applyMulti(convOne, convTwo);
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }
    
}
