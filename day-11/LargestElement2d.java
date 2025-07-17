public class LargestElement2d {
    public static void large(int[][] arr2d) {
        int large=arr2d[0][0];
        for(int i=0;i<arr2d.length;i++){
            for(int j=0;j<arr2d[i].length;j++){
               if(arr2d[i][j]>large){
                large=arr2d[i][j];
               }
            }
        }
        System.out.println("The largest element is "+large);
    }
    public static void main(String[] args) {
        int[][] arr2d={{1,2,3},{10,5,6},{7,8,9}};
        large(arr2d);
    }

}
