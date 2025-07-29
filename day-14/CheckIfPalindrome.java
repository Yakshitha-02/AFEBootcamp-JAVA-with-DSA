import java.util.Scanner;

public class CheckIfPalindrome {
    public static void checking(String str){
        str = str.toLowerCase();

        StringBuilder cleaned = new StringBuilder(str);
        for (int i = 0; i < cleaned.length(); i++) {
            if (Character.isDigit(cleaned.charAt(i))) {
                cleaned.deleteCharAt(i);
                i--;
            }
        }

        String cleanedStr = cleaned.toString();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();

        checking(str);
        scanner.close();
    }
}
