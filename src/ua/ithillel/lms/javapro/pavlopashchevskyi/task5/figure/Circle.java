package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure;

public class Circle implements Figure {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
