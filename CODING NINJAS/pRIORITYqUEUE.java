import java.util.Iterator;
import java.util.PriorityQueue;

public class pRIORITYqUEUE {
    public static void main(String[] args) {
        // A PriorityQueue is used when the objects are supposed to be processed based on the priority. PriorityQueue doesn't permit null.
        // It provides O(log(n)) time for add and poll methods.
        
        // Declaration of PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        // Adding elements in PriorityQueue
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(8);

        // Size of PriorityQueue
        int sz = pq.size();

        // Iterating over PriorityQueue
        Iterator itr = pq.iterator();
        while(itr.hasNext())System.out.print(itr.next()+" ");

        // Printing top element of PriorityQueue
        int top = pq.peek();
        System.out.println(top);

        // Deleting the top element of the PriorityQueue
        pq.remove();
        top = pq.peek(); // automatically it will stores the elements in the ascending order
        // but while printing it remains same as the elements entered 
        System.out.println(top);

        // Retrieves and removes the head of this queue
        top = pq.poll();
        System.out.println(top);
    }    
}
