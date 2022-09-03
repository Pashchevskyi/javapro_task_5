package ua.ithillel.lms;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api.Obstacle;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api.Participable;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.client.*;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.service.Compitition;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.api.AreaCountable;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client.Circle;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client.Square;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.client.Triangle;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.service.AreaCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>(){
            {
                add(new Wall(6.15));
                add(new Racetrack(200));
            }
        };
        ArrayList<Participable> participants = new ArrayList<Participable>() {
            {
                add(new Human("Василь"));
                add(new Cat("Том"));
                add(new Robot("Вертер"));
                add(new Cat("Леопольд"));
                add(new Robot("Аліса"));
                add(new Robot("Сірі"));
                add(new Human("Петро"));
            }
        };
        Compitition c = new Compitition(participants, obstacles);
        c.hold();

        AreaCountable circle = new Circle(2.0);
        AreaCountable triangle = new Triangle(3, 4, 5);
        AreaCountable sqare = new Square(3);
        AreaCountable[] figures = {triangle, circle, sqare};

        AreaCalculator ac = new AreaCalculator(figures);
        double sumArea = ac.calcSumArea();
        System.out.println("Сумарна площа всіх фігур = " + sumArea);
    }
}
