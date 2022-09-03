package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition;

public class Human extends Participant {

    protected static final double runLimit = 42195.000;
    protected static final double jumpLimit = 6.15;

    public Human(String name) {
        super(name);
    }

    @Override
    public boolean run(Obstacle obstacle, double dst) {
        if (dst <= runLimit) {
            System.out.println("Людина " + this.name + " пробігла " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Людина не зможе стільки пробігти");
        }
        return (dst <= runLimit) && (dst >= obstacle.getDistance());
    }

    @Override
    public boolean jump(Obstacle obstacle, double dst) {
        if (dst <= jumpLimit) {
            System.out.println("Людина " + this.name + " стрибнула на " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Людина не зможе стрибнути на таку висоту");
        }
        return (dst <= jumpLimit) && (dst >= obstacle.getDistance());
    }
}
