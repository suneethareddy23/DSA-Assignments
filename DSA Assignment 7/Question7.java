package in.ineuron.main;

import java.util.Stack;

public class Question7 {
	
	    public static String buildString(String str)
	    {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : str.toCharArray()) {
	            if (ch != '#') {
	                stack.push(ch);
	            } else if (!stack.isEmpty()) {
	                stack.pop();
	            }
	        }

	        StringBuilder result = new StringBuilder();
	        for (char ch : stack) {
	            result.append(ch);
	        }

	        return result.toString();
	    }
	    public static void main(String[] args) {
		
	    	String s1="ab#c";
	    	String s2="ad#c";
	    	
	    	if(buildString(s2).equals(buildString(s1)))
	    		System.out.println(true);
	    	else
	    		System.out.println(false);
	    }

}