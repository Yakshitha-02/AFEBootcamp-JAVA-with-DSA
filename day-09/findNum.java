import java.util.Scanner;

public class findNum {
    public static void findingNumber(int num,int[] arr){
       boolean found=false;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            System.out.println("Number found in the index: "+i);
            found=true;
            break;
        }
       }
       if(!found){
        System.out.println("Number is not found!!");
       }
    }


    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      int[] arr = new int[5];
      arr[0]=4;
      arr[1]=23;
      arr[2]=45;
      arr[3]=12;
      arr[4]=76;
      System.out.print("enter a number to find: ");
      int num = scanner.nextInt();
      
      findingNumber(num,arr);
      scanner.close();
    }
}
