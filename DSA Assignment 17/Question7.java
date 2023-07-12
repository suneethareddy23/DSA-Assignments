package in.ineuron.main;
import java.util.ArrayDeque;
import java.util.Deque;

public class Question7 {
    private Deque<Integer> frontDeque;
    private Deque<Integer> backDeque;

    public Question7() {
        frontDeque = new ArrayDeque<>();
        backDeque = new ArrayDeque<>();
    }

    public void pushFront(int val) {
        if (frontDeque.size() > backDeque.size()) {
            backDeque.addFirst(frontDeque.removeLast());
        }
        frontDeque.addFirst(val);
    }

    public void pushMiddle(int val) {
        if (frontDeque.size() > backDeque.size()) {
            backDeque.addFirst(frontDeque.removeLast());
        }
        frontDeque.addLast(val);
    }

    public void pushBack(int val) {
        backDeque.addLast(val);
        if (backDeque.size() > frontDeque.size()) {
            frontDeque.addLast(backDeque.removeFirst());
        }
    }

    public int popFront() {
        if (!frontDeque.isEmpty()) {
            if (frontDeque.size() == backDeque.size()) {
                backDeque.addFirst(frontDeque.removeLast());
            }
            return frontDeque.removeFirst();
        }
        return 1;
    }

    public int popMiddle() {
        if (!frontDeque.isEmpty()) {
            if (frontDeque.size() == backDeque.size()) {
                backDeque.addFirst(frontDeque.removeLast());
            }
            return frontDeque.removeLast();
        }
        return 1;
    }
}