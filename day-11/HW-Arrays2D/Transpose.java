import java.util.Scanner;

public class Transpose {
    public static void transposing(int n,int m,int[][] arr) {
       int[][] transpose = new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            transpose[j][i]=arr[i][j];
        }
       }
       for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
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
        transposing(n,m,array);
        scanner.close();
    }
}
