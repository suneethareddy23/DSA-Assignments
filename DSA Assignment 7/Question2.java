package in.ineuron.main;
import java.util.HashMap;
import java.util.Map;

public class Question2 {
	
	 public static boolean findstrobogrammaticPairs(String s) {
		 Map<Character, Character> map = new HashMap<>();
		 map.put('1', '1');
		 map.put('0', '0');
		 map.put('8', '8'); 
		 map.put('6', '9');
		 map.put('9', '6');
		 
		 int left=0;
		 int right=s.length()-1; 
			 while(left<=right) {
				 char cLeft=s.charAt(left);
				 char cRight=s.charAt(right);
				 if(!map.containsKey(cLeft) || map.get(cLeft)!=cRight) {
					 return false;
				 }
				 
				 left++;
				 right--;
			 }
		 
		 return true;  
	 }
	 
	 public static void main(String[] args) {
		String s="101";
		System.out.println(findstrobogrammaticPairs(s));
	 }
}

