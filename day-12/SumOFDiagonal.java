import java.util.Scanner;

public class SumOFDiagonal {
    public static void summingup(int n,int m,int[][] array){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(i==j){
                sum+=array[i][j];
            }
        }
        }
         System.out.println("The sum of the daigonal elements is "+sum);
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = scanner.nextInt();
        System.out.print("Enter number of columns:");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        if(n!=m){
            System.out.println("The matrix is not a square matrix!");
            scanner.close();
            return;
        }
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        summingup(n,m,array);
        scanner.close();
}
}
