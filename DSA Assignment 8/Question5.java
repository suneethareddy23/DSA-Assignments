package in.ineuron.main;

class  Solution4 {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 1;

            while (read + 1 < chars.length && chars[read + 1] == currentChar) {
                read++;
                count++;
            }

            chars[write] = currentChar;
            write++;

            if (count > 1) {
                String countString = String.valueOf(count);
                for (char c : countString.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }

            read++;
        }

        return write;
    }
}
public class Question5 {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        Solution solution = new Solution();
        int newLength = solution.compress(chars);
        System.out.println(newLength);  
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " "); 
        }
    }
}

