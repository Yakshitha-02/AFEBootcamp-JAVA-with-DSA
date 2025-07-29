import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        scanner.close();
    }
}
