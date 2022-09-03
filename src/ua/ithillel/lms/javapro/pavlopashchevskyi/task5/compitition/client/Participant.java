package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.client;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api.Obstacle;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api.Participable;

public abstract class Participant implements Participable {

    protected static double runLimit;
    protected static double jumpLimit;

    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean run(Obstacle obstacle, double dst);
    public abstract boolean jump(Obstacle obstacle, double height);
}
