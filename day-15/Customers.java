import java.util.ArrayList;

public class Customers {
    public static void main(String[] args) {
        ArrayList<String> cust = new ArrayList<>();
        cust.add("renu");
        cust.add("yakshi");
        cust.add("dhruv");
        cust.add("parni");
        System.out.println("The first customer is : " + cust.get(0));
        cust.remove(0);
        System.out.println("The total no.of customers after removing first customer is : " + cust.size());
        System.out.println("The last customer is : " + cust.get(cust.size()-1));
       
    }
}
