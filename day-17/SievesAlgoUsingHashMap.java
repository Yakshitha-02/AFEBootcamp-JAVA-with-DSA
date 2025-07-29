import java.util.*;

public class SievesAlgoUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find prime numbers until that range: ");
        int num = sc.nextInt();

        HashSet<Integer> marked = new HashSet<>(); // For fast lookup

        for (int i = 2; i <= num; i++) {
            if (!marked.contains(i)) {
                System.out.print(i + " ");
                for (int j = i * 2; j <= num; j += i) {
                    marked.add(j);
                }
            }
        }
        sc.close();
    }
}
