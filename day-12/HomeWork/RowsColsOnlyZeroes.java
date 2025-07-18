import java.util.Scanner;

public class RowsColsOnlyZeroes {
    public static void checkingrows(int n,int m,int[][] arr) {

        boolean isfound = false;
        for(int i=0;i<n&&isfound==false;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
            if(sum==0){
                System.out.println("The "+(i+1)+" row contains all zeroes");
                isfound = true;
                return;
            }
        }
        if(isfound==false){
            System.out.println("There is no row with all zeroes !");
        }
    }

    public static void checkingcols(int n,int m,int[][] arr) {

        boolean isfound = false;
        for(int j=0;j<m&&isfound==false;j++){
            int sum = 0;
            for(int i=0;i<n;i++){
                sum+=arr[i][j];
            }
            if(sum==0){
                System.out.println("The "+(j+1)+" column contains all zeroes");
                isfound = true;
                return;
            }
        }
        if(isfound==false){
            System.out.println("There is no column with all zeroes !");
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
        checkingrows(n, m, array);
        checkingcols(n, m, array);
        scanner.close();
    }
}                   
        
