
public class reverseOrder {

    public static void reversing(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void reversing1(int[] arr,int[] reverseArray){
       for(int i=0;i<arr.length;i++){
        reverseArray[i]=arr[arr.length-i-1];
        System.out.print(reverseArray[i]+" ");
       }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=87;
        arr[1]=45;
        arr[2]=23;
        arr[3]=21;
        arr[4]=97;
        //reversing(arr);
        
        // for(int num:arr){
        //     System.out.print(num+" ");
        // }

        // int[] reverseArray = new int[arr.length];
        // reversing1(arr,reverseArray);
    }
}
