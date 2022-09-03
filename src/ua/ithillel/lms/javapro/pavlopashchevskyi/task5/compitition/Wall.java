package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition;

public class Wall implements Obstacle {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participable participable, double dst) {
        return participable.jump(this, dst);
    }

    public double getDistance() {
        return this.height;
    }
}
