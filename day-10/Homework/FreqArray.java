import java.util.Scanner;

public class FreqArray {
    public static void calfreq(int[] arr) {
        int maxi=arr[0];
        for(int i=1;i<arr.length;i++){
         if(maxi<arr[i]){
            maxi=arr[i];
         }
        }
        int[] freqarray = new int[maxi+1];

        for(int i=0;i<arr.length;i++){
                freqarray[arr[i]]++;
        }
        System.out.println("The frequency array is :");
        for(int i=0;i<=maxi;i++){
            System.out.print(freqarray[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        calfreq(arr);
        scanner.close();
    }
}
