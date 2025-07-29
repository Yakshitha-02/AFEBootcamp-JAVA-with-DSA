import java.util.ArrayList;
import java.util.Scanner;
// time complexity : O(nloglogn)
public class sievesalgo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i <= num; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= num; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        System.out.println("Prime numbers up to " + num + ": " + primes);
        scanner.close();
    }
}
