import java.util.Scanner;

public class SearchingDomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email :");
        String email = scanner.nextLine();

        int a = email.indexOf('@');
        

        if(a != -1){
            System.out.println("your domain is : " + email.substring(a + 1));
        }else{
            System.out.println("No domain found");
        }
        scanner.close();
    }
}
