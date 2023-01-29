import java.util.LinkedList;
import java.util.Queue;
// remember Queue is present in the linkedlist class
public class qUEUE {
    public static void main(String[] args) {
        // declaration of queue
        Queue<Integer> queue = new LinkedList<Integer>();

        // Adding Elements to the queue
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);

        // Printing the queue
        System.out.println(queue);

        // Printing the head element of the queue
        int head = queue.peek();
        System.out.println(head);

        // Removing the head element of the queue
        queue.remove();
        head = queue.peek();
        System.out.println(head);

        // size of the queue
        int sz = queue.size();
        System.out.println(sz);
    }    
}
