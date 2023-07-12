package in.ineuron.main;



public class Question6 {

	public static boolean canShift(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;  
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShift(s, goal));  // Output: true
    }
}