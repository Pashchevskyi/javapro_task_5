package ua.ithillel.lms;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.*;
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

    }
}
