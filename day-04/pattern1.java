import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = scanner.nextInt();

        for(int i=0 ; i < num ; i++){
            for(int j=0;j<=num-i;j++){
               System.out.print(" ");
            }

            for(int j=0 ; j < i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
