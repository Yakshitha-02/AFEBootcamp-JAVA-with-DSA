public class StringBasics {
    public static void main(String[] args) {
        String str = "I really love attending Java class";
        System.out.println(str);
        System.out.println("The length of the string is : "+str.length());
        int index = str.indexOf("java");
        if(index>0){
        System.out.println("The index is : "+index);
        }else {
        System.out.println("The index is not found");
        }
        str = str.replace('e', '3');
        System.out.println("The new string is : "+str);
        if(str.startsWith("Hello")){
            System.out.println("Yes the sentence starts with Hello");
        }else{
            System.out.println("No the sentence doesnt starts with Hello");
        }
    }
}
