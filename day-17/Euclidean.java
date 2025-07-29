import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        while(b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("GCD/HCF is : " + a);
        scanner.close();
    }
}
