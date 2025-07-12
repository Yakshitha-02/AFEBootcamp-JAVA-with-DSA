
public class countTemp {
    public static void countingTemp(double arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>29){
                count++;
            }
        }
        System.out.println("The tempertaure is "+count+ " days higher than 29.");
    }

    public static void main(String[] args) {
        double[] arr = new double[5];
        arr[0]=34;
        arr[1]=24;
        arr[2]=34;
        arr[3]=21;
        arr[4]=23;
        countingTemp(arr);
    }
}
