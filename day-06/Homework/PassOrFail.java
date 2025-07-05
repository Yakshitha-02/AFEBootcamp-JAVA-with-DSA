import java.util.Scanner;

public class PassOrFail {
    public static void checkPassFail(int marks){
     if(marks >= 40){
        System.out.println("Pass");
     }else{
        System.out.println("Fail");
     }
    }
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter marks: ");
    int marks = scanner.nextInt();

    checkPassFail(marks);
    }
}
