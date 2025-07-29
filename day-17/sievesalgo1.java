import java.util.*;
public class sievesalgo1
{
    public static int prime(int num){
        if (num <= 1){
            return 1;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return 1;
            }
        }
        return 0;
    }
public static int  find(ArrayList<Integer> list,int num){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==num){
                return 1;
            }
        }
        return 0;
    }
public static void main(String[] args) {
		ArrayList<Integer> circle_nums=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to find prime numbers until that range:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
		    //checking whether it is in the arraylist
		    int re=find(circle_nums,i);
		    if(re==0){
		       //checking if it is prime
		       int result=prime(i);
		       if(result==0){
		        System.out.print(i + " ");
               //adding all multiples of the prime numbers to a arraylist
		        for(int j=i+1;j<=num;j++){
		            if(j%i==0){
		                circle_nums.add(j);
		            }
		        }
		      }
		    }
		}
        sc.close();
	}
}