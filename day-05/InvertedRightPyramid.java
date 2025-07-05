import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rows = scanner.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
