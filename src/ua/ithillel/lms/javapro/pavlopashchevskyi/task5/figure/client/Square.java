package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.api.AreaCountable;

public class Square implements AreaCountable {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
