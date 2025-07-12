public class SecondLargest {
    public static void secondlarge(int[] arr){
        int largest = 0;
        int secondLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
            System.out.println("Second largest element is: " + secondLargest);
        }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=87;
        arr[1]=45;
        arr[2]=23;
        arr[3]=21;
        arr[4]=97;
        secondlarge(arr);
    }
}
