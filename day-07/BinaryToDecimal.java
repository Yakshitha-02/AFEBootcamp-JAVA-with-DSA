import java.util.Scanner;

public class BinaryToDecimal {
    public static int toDec(String num){
        int dec = 0;
        int len = num.length();
        int power = 0;
        int index = len - 1;
        while (index >= 0) {
            if (num.charAt(index) == '1') {
                dec += (int)Math.pow(2, power);
            }
            power++;
            index--;
        }
        return dec;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = scanner.nextLine();

        int ans = toDec(num);
        System.out.println("The decimal number is " + ans);
        scanner.close();

    }
}