import java.util.Scanner;

public class DupArray {
    public static void noduparray(int[] arr){
        int uniqueCount=0;
        int[] duparr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean isdup=false;
           for(int j=0;j<uniqueCount;j++){
            if(arr[i]==duparr[j]){
                isdup=true;
                break;
            }
           }
           if(!isdup){
            duparr[uniqueCount]=arr[i];
            uniqueCount++;
           }
        }
        for(int i=0;i<uniqueCount;i++){
            System.out.print(duparr[i]+" ");
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
        noduparray(testarr);
        scanner.close();
    }
}
