package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRectangle();
        square.printSquare();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nArea of Square");
        System.out.print("Enter the measurement of the side: ");
        double side = sc.nextDouble();
        double squareArea = square.calculateArea(side);
        System.out.println("RESULT: Area of Square = " + squareArea);

        System.out.println("\nArea of Rectangle:");
        System.out.print("Enter the measurement of the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the measurement of the width: ");
        double width = sc.nextDouble();
        // Using square object but calling Rectangle's method
        double rectangleArea = square.calculateArea(length, width);
        System.out.println("RESULT: Area of Rectangle = " + rectangleArea);

        System.out.println();

        SemiCircle semiCircle = new SemiCircle();
        semiCircle.printShape();
        semiCircle.printSemiCircle();
        semiCircle.printCircle();

        sc.close();
    }
}
