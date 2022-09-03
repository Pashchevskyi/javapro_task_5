package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition;

public class Cat extends Participant {

    protected static final double runLimit = 12575.035;
    protected static final double jumpLimit = 1.543;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(Obstacle obstacle, double dst) {
        if (dst <= runLimit) {
            System.out.println("Кіт " + this.name + " пробіг " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Кіт не зможе стільки пробігти");
        }
        return (dst <= runLimit) && (dst >= obstacle.getDistance());
    }

    @Override
    public boolean jump(Obstacle obstacle, double dst) {
        if (dst <= jumpLimit) {
            System.out.println("Кіт " + this.name + " стрибнув на " + dst + " м.");
            if (dst >= obstacle.getDistance()) {
                System.out.println("Перешкода пройдена");
            } else {
                System.out.println("Перешкода не пройдена");
            }
        } else {
            System.out.println("Кіт не зможе стрибнути на таку висоту");
        }
        return (dst <= jumpLimit) && (dst >= obstacle.getDistance());
    }
}
