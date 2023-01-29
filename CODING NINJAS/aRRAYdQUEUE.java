import java.util.ArrayDeque;
import java.util.Iterator;

public class aRRAYdQUEUE {
    public static void main(String[] args) {
        // Declaration of Deque
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        // Adding element at the start of deque
        deque.addFirst(32);
        deque.addFirst(13);

        // Adding element at the end of deque
        deque.addLast(98);
        deque.addLast(12);

        // Printing element of the deque
        System.out.println(deque);

        // size of the deque
        int sz = deque.size();
        System.out.println(sz);

        // Printing elements inside the deque from start to end
        System.out.println("Start to end print");
        for(Iterator itr = deque.iterator(); itr.hasNext();){
            System.out.print(itr.next()+" ");
        }

        // Printing elements inside the deque from end to start
        System.out.println("\nEnd to Start print");
        for(Iterator itr = deque.descendingIterator(); itr.hasNext();){
            System.out.print(itr.next()+ " ");
        }

        // Printing first element in deque
        System.out.println("\nHead is : "+deque.getFirst());

        // Printing last element in deque
        System.out.println("Last element is : "+deque.getLast());

        // Deleting the first element in deque
        deque.remove();
        System.out.println("After removing the first element of the deque : \n"+deque);

        // Deleting the last element in deque
        deque.remove(98);
        System.out.println("After removing the last element of the deque : \n"+deque);
        
    }    
}
