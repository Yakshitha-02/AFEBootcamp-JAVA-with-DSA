import java.util.Scanner;

public class countNum {
    public static void countingNumber(int num,int[] arr){
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            count++;
        }
       }
       if(count==0){
        System.out.println("Number not found!");
       }else{
        System.out.println("The number "+num+ " has appeared for "+count+" times");
       }
    }


    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      int[] arr = new int[5];
      arr[0]=4;
      arr[1]=23;
      arr[2]=45;
      arr[3]=12;
      arr[4]=45;
      System.out.print("enter a number to find: ");
      int num = scanner.nextInt();
      
      countingNumber(num,arr);
      scanner.close();
    }
}

