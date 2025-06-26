public class DoubleLL {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirt(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("double ll is empty.");
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }

        if (head.next == null) {
            int val = head.data;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        // dll.addFirt(4);
        // dll.addFirt(3);
        // dll.addFirt(2);
        // dll.addFirt(1);
        dll.addLast(32);
        dll.printll();
        System.out.println(dll.removeFirst());
        System.out.println(dll.removeLast());
        dll.printll();

    }
}