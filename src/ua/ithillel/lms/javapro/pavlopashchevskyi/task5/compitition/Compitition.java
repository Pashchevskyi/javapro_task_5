package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.compitition;

import java.util.ArrayList;

public class Compitition {

    private ArrayList<Participable> participants;
    private ArrayList<Obstacle> obstacles;

    public Compitition(ArrayList<Participable> participants, ArrayList<Obstacle> obstacles) {
        this.participants = participants;
        this.obstacles = obstacles;
    }

    public void hold() {
        ArrayList<Participable> deletingParticipants = new ArrayList<Participable>();
        for (Participable participant : participants) {
            for (Obstacle obstacle : obstacles) {
                double dst = 300 * Math.random() + 100;
                boolean passed = obstacle.overcome(participant, dst);
                if (!passed) {
                    deletingParticipants.add(participant);
                }
            }
        }
        for (Participable deletingParticipant : deletingParticipants) {
            participants.remove(deletingParticipant);
        }
    }
}
