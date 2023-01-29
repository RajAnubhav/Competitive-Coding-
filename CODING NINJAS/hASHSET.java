import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hASHSET {
    public static void main(String[] args) {
        /*
         * Java HashSet class is used to create a collection that uses a hash table for storage.
         * It inherits the AbstractSet class and implements Set interface.
         * HashSet contains unique elements only. HashSet allows null value.
         * Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
         * It inherits the HashSet class and implements the Set interface.
         * Java LinkedHashSet class maintains insertion order.
        */

        // Declaring HashSet
        HashSet<String> hset = new HashSet<String>();
        LinkedHashSet<String> lset = new LinkedHashSet<String>();

        // Insert in HashSet
        hset.add("One");
        hset.add("Two");
        hset.add("Three");
        hset.add("One");

        System.out.println(hset);

        // Iterate over HashSet
        Iterator<String> i = hset.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }

        // Remove specific element from HashSet
        hset.remove("Two");
        System.out.println(hset);

        // Size of HashSet
        int sz =  hset.size();
        System.out.println(sz);

    }    
    // same thing goes with the lset
}
