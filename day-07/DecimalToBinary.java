import java.util.Scanner;

public class DecimalToBinary {
    public static String dectobin(int num){
       String decNum=" ";
       while(num>0){
        int remainder = num % 2;
        decNum = remainder + decNum;
        num = num/2;
       }
       return decNum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String ans = dectobin(num);
        System.out.println("The binary number is " + ans);
        scanner.close();

    }
}
