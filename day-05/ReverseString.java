import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter a string: ");
    String str = scanner.nextLine();
    String revStr = "";
    int len = str.length();
    while(len>0){
      revStr += str.charAt(len-1);
      len = len-1;
    }
    System.out.println("Reversed string is " + revStr);
    scanner.close();
  }    
}
