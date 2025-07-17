import java.util.Scanner;

public class particularRowSum {
    public static void sumofrow(int row,int[][] arr) {
        int sum=0;
        for(int j=0;j<arr[row].length;j++){
            sum+=arr[row][j];
        }
        System.out.println("The sum of elements in the row is "+sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr2d={{1,2,3},{10,5,6},{7,8,9}};
        System.out.print("enter row number: ");
        int row = scanner.nextInt();
        sumofrow(row,arr2d);
        scanner.close();
    }
}
