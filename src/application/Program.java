package application;

import model.entities.services.OperationExec;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        OperationExec oe = new OperationExec();

        System.out.print("Enter first number: ");
        String valueOne = sc.nextLine();
        System.out.print("Enter operation: ");
        String operation = sc.nextLine();
        System.out.print("Enter second number: ");
        String valueTwo = sc.nextLine();

        if (valueOne.contains(Character.toString('.')) || valueTwo.contains(Character.toString('.'))) {
            double convDoubleOne = Double.parseDouble(valueOne);
            double convDoubleTwo = Double.parseDouble(valueTwo);
            System.out.println("Result: " + oe.doubleOperation(convDoubleOne, convDoubleTwo, operation));
        }
        else {
            int convIntOne = Integer.parseInt(valueOne);
            int convIntTwo = Integer.parseInt(valueTwo);
            System.out.println("Result: " + oe.intOperation(convIntOne, convIntTwo, operation));
        }
        sc.close();
    }
}
