import java.util.Scanner;
class lop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int div = 2; div * div <= n; div++) {
            while(n % div == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        if (n!=1) {
            System.out.print(n);
        }
    }
}