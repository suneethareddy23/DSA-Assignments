package in.ineuron.main;


public class Question4 {

	public static String reverseWord(String str) {
		String[] words = str.split(" ");  // Split the sentence into words
        String result ="";
        for(String word:words) {
        	for(int i=word.length()-1;i>=0;i--) {
        		result+=word.charAt(i);		
        	}
        	result+=" ";
        }
        
        return result;
    }

	public static void main(String[] args)
	{
		String  s = "Let's take LeetCode contest";
		System.out.println(reverseWord(s));
	}
}

