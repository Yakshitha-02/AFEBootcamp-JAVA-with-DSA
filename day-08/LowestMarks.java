import java.util.Scanner;
import java.util.Arrays;

public class LowestMarks {
    public static void lowestMarks(int marks[]){
        int minimumVal=marks[0];
         for(int i = 1 ; i < marks.length ; i++){
            if(minimumVal >= marks[i]){
                minimumVal = marks[i];
            }
        }
        System.out.println("Minimum marks are "+ minimumVal);
    }
    public static void thirdLowestMarks(int marks[]){
         int[] sortedArray = marks.clone();
         Arrays.sort(sortedArray);
         System.out.print("The third lowest marks are "+ sortedArray[2]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] marks = new int[10];
        System.out.println("Enter marks of "+ marks.length + " students");
        for(int i = 0 ; i < marks.length ; i++){
            marks[i]=scanner.nextInt();
        }
     lowestMarks(marks);
     scanner.close();
    }
}
