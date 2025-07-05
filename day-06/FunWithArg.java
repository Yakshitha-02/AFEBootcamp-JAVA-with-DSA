import java.util.Scanner;

public class FunWithArg {
    public static void greeting(String name,String clgname){
        System.out.println("Hello "+name + " from "+ clgname);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name :");
        String name = scanner.nextLine();

        System.out.println("Enter college name: ");
        String clgname = scanner.nextLine();

        greeting(name,clgname);

        scanner.close();
    }
}
