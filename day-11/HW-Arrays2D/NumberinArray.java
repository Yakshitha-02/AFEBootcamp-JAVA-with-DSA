import java.util.Scanner;

public class NumberinArray {
    public static void isNumberThere(int tar,int[][] arr) {
        boolean isfound=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==tar){
                    System.out.print("Element found");
                    isfound=true;
                    break;
                }
            }
        }
        if(!isfound){
            System.out.print("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns:");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the target :");
        int target=scanner.nextInt();
        isNumberThere(target,array);
        scanner.close();
    }

}
