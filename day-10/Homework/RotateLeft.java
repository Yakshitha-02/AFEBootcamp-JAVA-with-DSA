import java.util.Scanner;

public class RotateLeft {

    public static void rotatingleft(int[] arr){
        //1,2,3,4,5    2,3,4,5,1
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] testarr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
          testarr[i]=scanner.nextInt();
        }
        rotatingleft(testarr);
        scanner.close();
    }
}
