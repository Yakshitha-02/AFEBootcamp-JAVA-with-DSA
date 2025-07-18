import java.util.Scanner;

public class EvenOdd {
    public static void count(int n, int m,int[][] arr) {
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]%2==0){
                    e++;
                }else{
                    o++;
                }
            }
        }
        System.out.println("Number of even numbers are : "+e);
        System.out.println("Number of odd numbers are : "+o);
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
       count(n,m,array);
       scanner.close();
    }

}
