import java.util.Scanner;

public class Factors {
    public static void calFactors(int num) {
        int i=1;
        System.out.println("The factors are");
        while(i<=num){
          if(num%i == 0){
             System.out.print(i+" ");
          }
          i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number to check factors : ");
        int num = scanner.nextInt();
        calFactors(num);
        scanner.close();
    }
}

