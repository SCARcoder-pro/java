import java.util.Scanner;
class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');
        System.out.println("Maximum number entered: " + max);
        System.out.println("Minimum number entered: " + min);
    }
}