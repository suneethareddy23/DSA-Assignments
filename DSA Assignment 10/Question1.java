package in.ineuron.main;
public class Question1{
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        
        double logarithm = Math.log10(n) / Math.log10(3);
        return Math.round(logarithm) == logarithm;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));  
        System.out.println(isPowerOfThree(9));  
        System.out.println(isPowerOfThree(45)); 
        System.out.println(isPowerOfThree(0));   
    }
}