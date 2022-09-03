package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.api.AreaCountable;

public class Circle implements AreaCountable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
