import java.util.Scanner;

public class Targetsumpair {
    public static void tarpair(int tar,int[] arr){
        boolean isfound=false;
        for(int i=0;i<arr.length&&isfound==false;i++){
            for(int j=i+1;j<arr.length&&isfound==false;j++){
                if(arr[i]+arr[j]==tar){
                    isfound=true;
                    System.out.println("Yes ! The pair exists");
                    break;
                }
            }
        }
        if(!isfound){
            System.out.println("No ! The pair doesn't exists");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter target sum : ");
        int tar=scanner.nextInt();
        tarpair(tar,arr);
        scanner.close();
    }
}
