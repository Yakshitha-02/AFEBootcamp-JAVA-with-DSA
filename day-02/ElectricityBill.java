import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This program tells us the calculation of electricity bill

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <= 50) {
            bill = units * 3;
        } else if (units <= 150) {
            bill = 50 * 3 + (units - 50) * 4.50;
        } else if (units <= 250) {
            bill = 50 * 3 + 100 * 4.50 + (units - 150) * 6;
        } else {
            bill = 50 * 3 + 100 * 4.50 + 100 * 6 + (units - 250) * 8;
        }

        System.out.print("Total bill: " + bill);
        scanner.close();
    }
}
