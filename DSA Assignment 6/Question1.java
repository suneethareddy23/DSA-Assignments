package in.ineuron.main;

import java.util.Arrays;

public class Question1 {

	 public int[] findPermutation(String s) {
	        int[] perm = new int[s.length() + 1];
	        int low = 0;
	        int high = s.length();

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'I') {
	                perm[i] = low;
	                low++;
	            } else if (s.charAt(i) == 'D') {
	                perm[i] = high;
	                high--;
	            }
	        }

	        perm[s.length()] = low;

	        return perm;
	    }

	    public static void main(String[] args) {
	       Question1 que=new Question1();
	       String s = "IDID";
	       int[] result = que.findPermutation(s);
	       System.out.println(Arrays.toString(result));
	    }
}
