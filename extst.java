class FootballClubs {
    void location() {
        System.out.println("Location is: ");
    }
    void  famousfor() {
        System.out.println("Famous for: ");
    }
}

class RealMadrid extends FootballClubs {
    void location() {
        System.out.println("Real Madrid is in Madrid, Spain");
    }
    void famousfor() {
        System.out.println("Famous for: Winning the most UEFA Champions League titles");
    }
}

class Barcelona extends FootballClubs {
    void location() {
        System.out.println("Barcelona is in Barcelona, Spain");
    }
    void famousfor() {
        System.out.println("Famous for: Their tiki-taka style of play and La Masia academy");
    }
}

class ManCity extends FootballClubs {
    void location() {
        System.out.println("Manchester City is in Manchester, England");
    }
    void famousfor() {
        System.out.println("Famous for: Their recent dominance in the English Premier League");
    }
}

public class extst {
    public static void main(String[] args) {
        FootballClubs A = new FootballClubs();
        FootballClubs R = new RealMadrid();
        FootballClubs B = new Barcelona();
        FootballClubs MC = new ManCity();

        A.location();
        A.famousfor();

        R.location();
        R.famousfor();

        B.location();
        B.famousfor();

        MC.location();
        MC.famousfor();
    }
}