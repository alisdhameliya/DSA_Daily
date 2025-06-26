import java.util.LinkedList;

public class _q2_mergeSortLL {

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

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node merge(Node left, Node right) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node midNode = findMid(head);

        Node rightNode = midNode.next;
        midNode.next = null;
        // mergesort for left part and right part
        Node left = mergeSort(head);
        Node right = mergeSort(rightNode);

        return merge(left, right);
    }

    public static void printll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node zigZag(Node head) {

        // step - 1 : find mid node
        Node mid = findMid(head);

        // step - : Revese second half of linked list
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        Node prev = null;
        Node curr = right;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        right = prev;

        Node nextLeft;
        Node nextRight;
        // step -3 // merge with left right
        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        }

        return left;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // printll(head);
        // mergeSort(head);
        printll(head);
        zigZag(head);
        printll(head);
    }
}
