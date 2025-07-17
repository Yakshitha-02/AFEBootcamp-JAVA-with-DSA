import java.util.Scanner;

public class CountOddEven {
    public static void counting(int[] arr) {
        int c=0;
        int c1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
              c++;
            }else{
                c1++;
            }
        }
        System.out.println("No.of even elements are : "+c);
        System.out.println("No.of odd elements are : "+c1);       
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
        counting(testarr);
        scanner.close();
    }
}
