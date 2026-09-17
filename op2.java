class Galaxy {
    String name;
    static int galaxyCount = 0;
    Galaxy(String name){
        this.name = name;
        galaxyCount++;
    }
    void display(){
        System.out.println("Galaxy: " + name);
    }
}
public class op2 {
    public static void main(String[] args) {
        Galaxy a1 = new Galaxy("Andromeda");
        a1.display();
        Galaxy a2 = new Galaxy("Milky Way");
        a2.display();
        System.out.println("Total Galaxy Created " + Galaxy.galaxyCount);
    }
}