import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to create a square : ");
    int num = scanner.nextInt();

    for(int i=1;i<=num;i++){
        for(int j=1;j<=num; j++){
            System.out.print(j);
        }
        System.out.println(" ");
    }
    scanner.close();
    }
}
