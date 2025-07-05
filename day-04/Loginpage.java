import java.util.Scanner;

public class Loginpage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        String username = "yakshitha_02";
        String password = "yakshi@0212";
        
        System.out.print("Enter your username:");
        String username1 = scanner.nextLine();

        System.out.print("Enter your password:");
        String password1 = scanner.nextLine();

        if(username.equalsIgnoreCase(username1) && password.equals(password1)) {
            System.out.println("Login Successfull");
        }else if(username.equalsIgnoreCase(username1)) {
            System.out.println("Incorrect password. Please try again.");
        } else if(password.equals(password1)) {
            System.out.println("Incorrect username. Please try again.");
        } else {
            System.out.println("Invalid credentials. Please check your username and password.");
        }

        // if (password1.length()>=8){
        //     System.out.println("Strong password");
        // }else{
        //     System.out.println("Weak Password");
        // }
        scanner.close();
    }
}
