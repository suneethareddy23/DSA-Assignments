package in.ineuron.main;
public class Question4 {
    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        } else {
            return 1 + calculateLength(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        System.out.println(calculateLength(str1));  

        String str2 = "Recursion";
        System.out.println(calculateLength(str2)); 
        String str3 = "";
        System.out.println(calculateLength(str3));  
    }
}