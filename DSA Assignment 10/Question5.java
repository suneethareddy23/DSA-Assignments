package in.ineuron.main;
public class Question5 {
    public static int countContiguousSubstrings(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = i + 1;

            while (j < str.length()) {
                if (str.charAt(j) == c) {
                    count++;
                }
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str1 = "abcab";
        System.out.println(countContiguousSubstrings(str1));  

        String str2 = "aba";
        System.out.println(countContiguousSubstrings(str2));  

        String str3 = "aaaa";
        System.out.println(countContiguousSubstrings(str3));  
    }
}


