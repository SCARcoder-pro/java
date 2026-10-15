import java.util.Scanner;
public class dev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = sc.nextDouble();
        System.out.println("Enter b = ");
        double b = sc.nextDouble();
        System.out.println("Enter c = ");
        double c = sc.nextDouble();
        if (a==0) {
            System.out.println("Not a quadratic equation");
        }
        else {
            double D=b*b-4*a*c;
            if (D>0) {
                double root1=(-b+Math.sqrt(D))/(2*a);
                double root2=(-b-Math.sqrt(D))/(2*a);
                System.out.println("Root1" + root1);
                System.out.println("Root2" + root2);
            }
            else if (D==0) {
                double root=-b/(2*a);
                System.out.println("Root" + root);
            }
            else {
                System.out.println("Imaginary Value");
            }
        }
    }
}