package ua.ithillel.lms.javapro.pavlopashchevskyi.task5.figure;

public class AreaCalculator {

    private Figure[] figures;

    AreaCalculator(Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            this.figures[i] = figures[i];
        }
    }

    double calcSumArea() {
        double S = 0.0;
        for (int i = 0; i < figures.length; i++) {
            S += figures[i].area();
        }
        return  S;
    }
}
