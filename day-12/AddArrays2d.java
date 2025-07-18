import java.util.Scanner;

public class AddArrays2d {
    public static void adding(int n,int m,int n1,int m1,int arr[][],int arr1[][]) {
           int[][] arr2= new int[n][m];
            System.out.println("The resulting array is : ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr2[i][j] = arr[i][j]+arr1[i][j];
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns for 1st array: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Enter elements for 1st array");
        int[][] array= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter number of rows and columns for 2nd array");
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        if(n1!=n||m1!=m){
            System.out.println("The arrays are not of same size adding is not possible");
            scanner.close();
            return;
        }
        System.out.println("Enter elements for 2nd array");
        int[][] array1= new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                array1[i][j]=scanner.nextInt();
            }
        }
        adding(n, m, n1, m1, array, array1);
        scanner.close();
    }
}
