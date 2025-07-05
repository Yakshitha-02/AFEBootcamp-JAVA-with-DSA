import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random randomNumber = new Random();

    int num = randomNumber.nextInt(11);
    
    boolean res = false ;

    while(res == false){
      System.out.print("Enter your guess: ");
      int in = scanner.nextInt();

      if(num == in){
        System.out.println("u guessed correct!");
        res = true;
      }else if(num < in){
        System.out.println("u guessed high");
      }else {
        System.out.println("u guessed low");
      }
    }
   
    scanner.close();
  }    
}
