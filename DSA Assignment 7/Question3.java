package in.ineuron.main;


public class Question3 {

	public static String addtwoString(String s1,String s2){
		int i=s1.length()-1;
		int j= s2.length()-1;
		int temp=0;
		StringBuilder result=new StringBuilder();
		while(i>=0 || j>=0 || temp>0) {
			
			int digit1 = i >= 0 ? s1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? s2.charAt(j) - '0' : 0;
            
            int sum = digit1 + digit2 + temp;
            int digitSum = sum % 10;
            temp = sum / 10;

            result.insert(0, digitSum);

            
            i--;
            j--;
		}
		return result.toString();
    }
	
	public static void main(String[] args) {
		String s1="11";
		String s2="123";
		
		System.out.println(addtwoString(s1,s2));
	}
}