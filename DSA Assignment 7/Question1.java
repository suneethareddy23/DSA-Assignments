package in.ineuron.main;


import java.util.HashMap;

public class Question1 {

	 public static boolean findIsomorphic(String s,String t) {
	    
		 if(s.length()!=t.length())
			 return false;
		 
		 HashMap<Character,Character> map=new HashMap<Character,Character>();
		 for(int i=0;i<s.length();i++) {
			 char sChar=s.charAt(i);
			 char tChar=t.charAt(i);
			 if(map.containsKey(sChar)){
				 if(map.get(sChar)!=tChar) 
					 return false;

			 }else
				 map.put(sChar, tChar);
		 }
		 
		 return true;
	 }

	 public static void main(String[] args) {
	      String s="egg";
	      String t="add";
	      boolean res = findIsomorphic(s, t);
	      System.out.println(res);
	 }
}

