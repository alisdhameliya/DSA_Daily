import java.util.Stack;

public class StockSpanProblem {

    public static void stockSpanPrice(int[] price, int[] span) {

        // create a stack and push index of first element to it
        Stack<Integer> sc = new Stack<>();
        sc.push(0);

        // value of the first element is always 1
        span[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 1; i < span.length; i++) {
            // pop element from the stack while stack is not empty and top of stack is
            // smaller than price[i]
            while (!sc.isEmpty() && price[sc.peek()] <= price[i]) {
                sc.pop();

                // if stack becomes empty, than price[i] is greater than all elements on the
                // left of it.
                // i.e., price[0], price[1],...price[i-1].
                // Else price[i] is grater than elements after top of stack

                span[i] = (sc.isEmpty()) ? i + 1 : (i - sc.peek());

                sc.push(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] stockPrice = { 100, 80, 60, 70, 60, 85, 100 };
        int[] span = new int[stockPrice.length];
        stockSpanPrice(stockPrice, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
