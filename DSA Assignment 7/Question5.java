package in.ineuron.main;

public class Question5 {

	public static String reverseString(String s,int k) {
		char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int start = i;
            int end =i+1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
	}
	public static void main(String[] args) {
		String s = "abcdefg";
        int k = 2;
        System.out.println(reverseString(s, k)); 
	}
}

