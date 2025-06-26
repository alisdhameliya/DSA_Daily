public class _q1_detectLoop {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node next;

    // check loop is exsits in ll or not.
    public static boolean isLoopExist() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // loop is exists
            }
        }
        return false;
    }

    // remove cycle from linked list
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle != true) {
            System.out.println("cycle not exist");
            return;
        }

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast; // last node to breck loop
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }

    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // _q1_detectLoop ll = new _q1_detectLoop();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // printll();
        System.out.println(isLoopExist());
        removeCycle();
        printll();
    }
}
