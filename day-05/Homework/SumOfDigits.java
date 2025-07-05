import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter a number : ");
    int num = scanner.nextInt();
    int a=0;

    while(num > 0){
        a += (num%10);
        num = num/10; 
    }
    System.out.println("Sum of digits are "+ a);
    scanner.close();
  }    
}
