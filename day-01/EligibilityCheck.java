import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * This program checks if a student is eligible for a scholarship based on their marks and family income.
         */
        System.out.print("Enter your marks:");
        int marks = input.nextInt();
        
        System.out.print("Enter your family income:");
        int income = input.nextInt();
        
        if (marks > 80 && income < 200000) {
            System.out.println("You are eligible for the scholarship.");
        } else {
            System.out.println("You are not eligible for the scholarship.");
        }
        input.close(); //closing the scanner to prevent resource leaks
}
}
