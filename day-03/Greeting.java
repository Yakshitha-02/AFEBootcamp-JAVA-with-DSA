import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your city name: ");
        String city = scanner.nextLine();
         
        System.out.println("hello! " + name + " from " + city);
        
        scanner.close();
        
    }
}
