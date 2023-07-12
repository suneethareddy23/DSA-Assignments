package in.ineuron.main;

 class QUestion8 {
    public static void main(String[] args) {
        String input = "Hello World";
        int consonantCount = countConsonants(input);
        System.out.println("Total number of consonants: " + consonantCount);
    }

    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}