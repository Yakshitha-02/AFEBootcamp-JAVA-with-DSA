import java.util.Scanner;

public class Ifcondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This program checks if a student has passed or failed based on their marks and the pass marks.

        System.out.print("Enter your marks:");
        int marks = scanner.nextInt();

        System.out.print("Enter the pass marks:");
        int passMarks = scanner.nextInt();

        if(marks >= passMarks) {
            System.out.println("Passed the exam.");
        } else {
            System.out.println("Failed the exam.");
        }
        scanner.close();

    }
}
