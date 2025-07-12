public class isSorted {
    public static void sortedornot(int[] arr) {
        boolean issorted=true;
       for(int i=0;i<arr.length-1;i++){ 
       if (arr[i] > arr[i + 1]) {
                issorted=false;
                break;
            }
        }
        if(issorted){
           System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        sortedornot(arr);
    }
}
