package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.client;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition.api.Obstacle;

public class Robot extends Participant {

    protected static final double runLimit = 40185.000;
    protected static final double jumpLimit = 5.875;

    public Robot(String name) {
        super(name);
    }

    @Override
    public boolean run(Obstacle obstacle, double dst) {
        if (dst <= runLimit) {
            System.out.println("Робот " + this.name + " побіг " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Робот не зможе стільки пробігти");
        }
        return (dst <= runLimit) && (dst >= obstacle.getDistance());
    }

    @Override
    public boolean jump(Obstacle obstacle, double dst) {
        if (dst <= jumpLimit) {
            System.out.println("Робот " + this.name + " стрибнув на " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Робот не зможе стрибнути на таку висоту");
        }
        return (dst <= jumpLimit) && (dst >= obstacle.getDistance());
    }
}
