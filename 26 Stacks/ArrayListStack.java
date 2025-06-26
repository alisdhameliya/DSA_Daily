import java.util.ArrayList;

public class ArrayListStack {
    // public class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (list.size() == 0) {
            System.out.println("List is empty.");
            return 0;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        int top = list.get(list.size() - 1);
        return top;
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    // }

    public static void main(String[] args) {
        ArrayListStack s = new ArrayListStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
