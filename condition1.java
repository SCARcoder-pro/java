import java.util.Scanner;
public class condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] players = {
            "Harry Kane",
            "Kyllian Mbappe",
            "Lamine Yamal"
        };

        double[] ratings = new double[3];
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer: " + players[i]);
            System.out.println("Goals Scored: ");
            int goals = sc.nextInt();

            System.out.println("Assists: ");
            int assists = sc.nextInt();

            System.out.println("Trophies Won: ");
            int trophies = sc.nextInt();

            System.out.println("Individual Awards: ");
            int awards = sc.nextInt();

            double goalRating = Math.min(goals / 50.0 * 100, 100);
            double assistRating = Math.min(assists / 20.0 * 100, 100);
            double trophyRating = Math.min(trophies / 3.0 * 100, 100);
            double awardRating = Math.min(awards / 3.0 * 100, 100);

            ratings[i] = goalRating * 0.40 + assistRating * 0.25 + trophyRating * 0.20 + awardRating * 0.15;

            System.out.printf("Goal Rating: %.1f/100%n", goalRating);
            System.out.printf("Assist Rating: %.1f/100%n", assistRating);
            System.out.printf("Trophy Rating: %.1f/100%n", trophyRating);
            System.out.printf("Award Rating: %.1f/100%n", awardRating);
            System.out.printf("Overall Rating: %.1f/100%n", ratings[i]);
        }

        int best = 0;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[best]) {
                best = i;
            }
        }
        System.out.println("\n==== PLAYER RANKING ====");
        for (int i = 0; i < players.length; i++) {
            System.out.printf("%s: %.1f/100%n", players[i], ratings[i]);
        }
        System.out.println("Top rated player: " + players[best]);
        sc.close();
    }
}