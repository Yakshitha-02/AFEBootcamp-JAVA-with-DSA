import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void calfactorial(int num) {
        int i=2;
        BigInteger factorial = BigInteger.ONE;
        while(i<=num){
          factorial = factorial.multiply(BigInteger.valueOf(i));
          i++;
        }
        System.out.print("The factorial is : "+ factorial);
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number to check factorial : ");
        int num = scanner.nextInt();
        calfactorial(num);
        scanner.close();
    }
}
