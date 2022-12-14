package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.api.AreaCountable;

public class Triangle implements AreaCountable {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
