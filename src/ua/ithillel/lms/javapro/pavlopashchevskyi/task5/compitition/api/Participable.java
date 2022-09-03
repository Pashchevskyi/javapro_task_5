package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api;

public interface Participable {
    boolean run(Obstacle racetrack, double dst);
    boolean jump(Obstacle obstacle, double height);
}
