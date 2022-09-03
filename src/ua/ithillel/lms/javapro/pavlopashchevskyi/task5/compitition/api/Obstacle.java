package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api;

public interface Obstacle {

    boolean overcome(Participable participable, double dst);
    double getDistance();
}
