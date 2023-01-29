import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer>pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<n; i++)
            pq.add(sc.nextInt());
        
        while(k>0){
            System.out.println(pq.peek());
            pq.remove();
            k--;
        }

        sc.close();
    }    
}
