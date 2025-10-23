package shapePack;

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }

    public double calculateArea(double side) {
        return side * side;
    }
}