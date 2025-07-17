import java.util.Scanner;

public class MissingNumber {
    public static void missing(int[] arr) {
        int sum=0;
        int n=arr.length;
        int totalsum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
          sum+=arr[i];
        }
        int missnum=totalsum-sum;
        System.out.println("The missing number is "+missnum);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the array elements from 0 to "+n);
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        missing(array);
        scanner.close();
    }
}
