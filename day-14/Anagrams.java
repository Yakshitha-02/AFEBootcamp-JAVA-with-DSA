import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void checkingifanagrams(String str1, String str2) {

        // Normalize input: lowercase and remove all whitespace
        str1 = str1.toLowerCase().replaceAll("\\s+", "");
        str2 = str2.toLowerCase().replaceAll("\\s+", "");
        
        if (str1.length() == str2.length()) {
            char[] chars = str1.toCharArray();
            char[] chars1 = str2.toCharArray();

            Arrays.sort(chars); 
            Arrays.sort(chars1); 

            if (Arrays.equals(chars, chars1)) {
                System.out.println("Yes! They are anagrams.");
            } else {
                System.out.println("No! They are not anagrams.");
            }
        } else {
            System.out.println("No! They are not anagrams.");           
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string 1:");
        String str1 = scanner.nextLine();

        System.out.println("Enter string 2:");
        String str2 = scanner.nextLine();

        checkingifanagrams(str1, str2);
        scanner.close();
    }
}
