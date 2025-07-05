import java.util.Scanner;

public class Palindrome {
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
    if(revStr.equals(str)) System.out.print(str + " is palindrome");
    else System.out.print(str + " is not a palindrome");
    scanner.close();
  }      
}
