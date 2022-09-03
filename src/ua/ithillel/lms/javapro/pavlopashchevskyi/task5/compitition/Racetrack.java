package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition;

public class Racetrack implements Obstacle {
    private double length;

    public Racetrack(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participable participable, double dst) {
        return participable.run(this, dst);
    }

    public double getDistance() {
        return this.length;
    }
}
