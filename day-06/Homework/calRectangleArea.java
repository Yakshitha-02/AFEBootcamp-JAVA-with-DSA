import java.util.Scanner;

public class calRectangleArea {
    public static int area(int length,int breadth){
        return length * breadth;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and breadth: ");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        int ar = area(length, breadth);
        System.out.println("Area is "+ar);
        scanner.close();
    }
}