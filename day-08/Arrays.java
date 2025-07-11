import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[10];
        int sum=0;
        System.out.println("Enter marks of "+ marks.length + " students");
        for(int i = 0 ; i < marks.length ; i++){
            marks[i]=scanner.nextInt();
            sum += marks[i];
        }
        int avg = sum/marks.length;
        System.out.print("Average marks are "+ avg);
        scanner.close();
    }
}
