package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure;

public class Square implements Figure {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
