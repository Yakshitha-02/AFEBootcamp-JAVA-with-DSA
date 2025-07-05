import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter a number:");
    int input = scanner.nextInt();
    System.out.println("it is running in for loop");
    for(int i=2;i<=input;i=i+2){
        System.out.println(i);
    }
    System.out.println("it is running in while loop");
    int i=2;
    while(i<=input){
        System.out.println(i);
        i=i+2;
    }
    scanner.close();
}
}
