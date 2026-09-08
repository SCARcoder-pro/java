public class d {
    public static void main(String[] args) {
        int points = 15;
        int goalDifference=8;
        if (points >=10)
        {
            System.out.println("Team Qualified");
            if (goalDifference >= 5)
            {
                System.out.println("Strong Difference");
            } else {
                System.out.println("Weak Goal Difference");
            }
        }
        else {
            System.out.println("Team didnt Qualified");
        }
    }
}