import java.util.Scanner;

public class SumRowCol {
    public static void addingelementsinrows(int n,int m,int[][] arr) {
        int sum;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=0;j<m;j++){
              sum+=arr[i][j];
            }
            System.out.println("The sum of elements in the row "+(i+1)+ " is "+sum);
        }
    }

    public static void addingelementsincols(int n,int m,int[][] arr) {
        int sum;
        for(int i=0;i<m;i++){
            sum = 0;
            for(int j=0;j<n;j++){
              sum+=arr[j][i];
            }
            System.out.println("The sum of elements in the column "+(i+1)+ " is "+sum);
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
        addingelementsinrows(n,m,array);
        addingelementsincols(n,m,array);
        scanner.close();
    }
}
