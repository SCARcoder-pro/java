import java.util.Scanner;

class lop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Enter number "+ i + ": ");
            int n = scanner.nextInt();

            int count = 0;
            for (int div = 2; div * div <=n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (n <= 1) {
                System.out.println(n + " is not a prime number.");
            } else if (count == 0) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}