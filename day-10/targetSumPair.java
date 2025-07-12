import java.util.Scanner;

public class targetSumPair {

    public static void target(int tar,int[] arr){
        boolean pairfound=false;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+arr[i+1])==tar){
                System.out.println("Pair found");
                pairfound=true;
                break;
            }
        }
        if(!pairfound){
            System.out.println("Pair not found");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter target sum : ");
        int tar=scanner.nextInt();
        target(tar,arr);
        scanner.close();
    }
}
