import java.util.Scanner;
import java.util.Arrays;

public class CountFreqOfCharInStr {
    public static void counting1(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");

        char[] chars = str.toCharArray();
        Arrays.sort(chars); 

        System.out.println("Frequencies are :");
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                System.out.println(chars[i - 1] + " : " + count);
                count = 1;
            }
        }
        
        if (chars.length > 0) {
            System.out.println(chars[chars.length - 1] + " : " + count);
        }
    }

    // public static void counting2(String str) {
    //     str = str.toLowerCase().replaceAll("\\s+", "");
    //     int len = str.length();
    //     boolean[] visited = new boolean[len];

    //     System.out.println("Frequencies are :");
    //     for (int i = 0; i < len; i++) {
    //         if (visited[i])
    //             continue;

    //         int count = 1;
    //         for (int j = i + 1; j < len; j++) {
    //             if (str.charAt(i) == str.charAt(j)) {
    //                 count++;
    //                 visited[j] = true;
    //             }
    //         }
    //         System.out.println(str.charAt(i) + " : " + count);
    //     }
    // }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        counting1(str);
       // counting2(str);
        scanner.close();
    }
}

