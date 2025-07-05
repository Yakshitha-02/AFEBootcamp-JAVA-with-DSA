import java.util.Scanner;

public class DailySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter daily earnings :");
        int dailyearnings = scanner.nextInt();

        int savings;
        if(dailyearnings<0){
            System.out.println("Please earn something..");
        }
        else{
            savings = (dailyearnings*6)-(dailyearnings*2);
            System.out.println(savings);

        }
        
        scanner.close();
    }
}
