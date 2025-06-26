
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void addAtMiddle(int index, int data) {
        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        size--;
        head = head.next;
        return val;
    }

    public static int removeLast() {
        if (head == null) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;
        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = null;
        return val;
    }

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public static int RecSearch(int key) {
        return helper(head, key);
    }

    // delete from End --> Nth node

    public static void nThRemoveFromEnd(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        // int count = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // count++;
        }
        return slow;
    }

    public static boolean isPalindrom() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse second half
        Node prev = null;
        Node currNode = midNode;
        Node next;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step3 - check left half & right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void deleteNnodeAfterMnode(int m, int n) {
        Node temp = head, t;
        int count;
        while (temp != null) {
           for ( count = 1; count <=m && temp != null; count++) {
                temp = temp.next;

                if (temp == null) {
                    return;
                }

                t
           }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        // ll.addFirst(0);
        // ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        // ll.addAtMiddle(4, 4);
        // printll();
        // System.out.println("size of LL:" + size);
        // removeFirst();
        // printll();
        // System.out.println("size of LL:" + size);
        // removeLast();
        printll();
        // System.out.println("size of LL:" + size);
        // System.out.println(RecSearch(0));
        // nThRemoveFromEnd(1);
        // printll();
        // System.out.println(findMid(head));
        // System.out.println(isPalindrom());

        // head = new Node(1);

        deleteNnodeAfterMnode(2, 2);
        printll();
    }
}
