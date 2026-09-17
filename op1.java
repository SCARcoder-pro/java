class Team {
    String name;
    String country;
    int titles;
    Team(String name, String country, int titles){
        this.name = name;
        this.country = country;
        this.titles = titles;
    }

    void display(){
        System.out.println("Team: " + name);
        System.out.println("Country: " + country);
        System.out.println("Titles: " + titles);
    }
}
public class op1 {
    public static void main(String[] args) {
        Team team1 = new Team("Real Madrid", "Spain", 15);
        team1.display();
    }
}