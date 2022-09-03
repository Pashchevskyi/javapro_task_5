package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.service;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure.api.AreaCountable;

public class AreaCalculator {

    private AreaCountable[] figures;

    public AreaCalculator(AreaCountable[] figures) {
            this.figures = figures;
    }

    public double calcSumArea() {
        double S = 0.0;
        for (int i = 0; i < figures.length; i++) {
            S += figures[i].area();
        }
        return  S;
    }
}
