import java.util.Scanner;

class range {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = scn.nextInt();

        System.out.print("Enter high: ");
        int high = scn.nextInt();

        for(int n = low; n<= high; n++) {
            if (n <= 1) continue;
            int count = 0;
            for (int div=2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);
            }
        }
    }
}