package in.ineuron.main;
import java.util.LinkedList;
import java.util.Queue;

public class Question4 {
    private Queue<Integer> requests;
    
    public Question4() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        
        // Remove outdated requests from the front of the queue
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll();
        }
        
        return requests.size();
    }
    
    public static void main(String[] args) {
       Question4 counter = new Question4();
        
        System.out.println(counter.ping(1));  // Output: 1
        System.out.println(counter.ping(100));  // Output: 2
        System.out.println(counter.ping(3001));  // Output: 3
        System.out.println(counter.ping(3002));  // Output: 3
    }
}