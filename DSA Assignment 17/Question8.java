package in.ineuron.main;

class DataStream {
    private int value;
    private int k;
    private int[] buffer;
    private int index;
    private int count;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.buffer = new int[k];
        this.index = 0;
        this.count = 0;
    }

    public boolean consec(int num) {
        if (count < k) {
            buffer[index] = num;
            index = (index + 1) % k;
            count++;
            return false;
        } else {
            for (int i = 0; i < k; i++) {
                if (buffer[i] != value) {
                    buffer[index] = num;
                    index = (index + 1) % k;
                    return false;
                }
            }
            buffer[index] = num;
            index = (index + 1) % k;
            return true;
        }
    }
}

public class Question8 {
    public static void main(String[] args) {
        // Create a DataStream object with value = 3 and k = 4
        DataStream stream = new DataStream(3, 4);

        // Add integers to the stream and check if the last 4 integers are equal to 3
        System.out.println(stream.consec(1));  // false
        System.out.println(stream.consec(2));  // false
        System.out.println(stream.consec(3));  // false
        System.out.println(stream.consec(3));  // false
        System.out.println(stream.consec(3));  // true
    }
}