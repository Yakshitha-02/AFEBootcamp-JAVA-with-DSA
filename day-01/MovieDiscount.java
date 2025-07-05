import java.util.Scanner;
public class MovieDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if(isStudent || (age>60) ){
            System.out.println("Eligible for a discount.");
        } else {
            System.out.println("No discount.");
        }

        scanner.close();
    }
}
// This program checks if a person is eligible for a movie discount based on age and student status.