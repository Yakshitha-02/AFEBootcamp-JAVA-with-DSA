import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter a string : ");
    String str = scanner.nextLine();
    int c = 0;

    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==('a')) c++;
        else if(str.charAt(i)==('e')) c++;
        else if(str.charAt(i)==('i')) c++;
        else if(str.charAt(i)==('o')) c++;
        else if(str.charAt(i)==('u')) c++;
    }
    System.out.println("Number of vowels are "+ c);
    scanner.close();
}
}
