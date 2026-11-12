class Scientists {
    String name = "Albert Einstein";
    int experience = 20;
    void showScientistinfo() {
        System.out.println("Name of Scientist: " + name);
        System.out.println("Experience of Scientist: " + experience);
    }
    void research() {
        System.out.println("Scientist is conducting research.");
    }
}

class Biologist extends Scientists {
    String field = "Molecular Biology";
    void studyCells () {
        System.out.println("Studying human cells.");
    }
    void showBiologyfield() {
        System.out.println("Field of Biology: " + field);
    }
}

class GeneticResearcher extends Biologist {
    String gene = "BRCA1";
    void analyzeGene() {
        System.out.println("Analyzing gene: " + gene);
    }
}

public class inh3 {
    public static void main(String[] args) {
        GeneticResearcher obj = new GeneticResearcher();
        obj.showScientistinfo();
        obj.research();
        obj.showBiologyfield();
        obj.studyCells();
        obj.analyzeGene();
    }
}