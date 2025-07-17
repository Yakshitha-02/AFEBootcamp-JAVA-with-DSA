
public class SumOfElements2D {
    public static void summing(int[][] arr2d) {
        int sum=0;
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
               sum+=arr2d[i][j];
            }
        }
        System.out.println("The sum of elements is "+sum);
    }
    public static void main(String[] args) {
        int[][] arr2d={{1,2,3},{10,5,6},{7,8,9}};
        summing(arr2d);
    }
}
