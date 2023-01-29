import java.util.*;

class cmp implements Comparator<String>{
    public int compare(String str1, String str2){
        return str2.compareTo(str1);
    }
}

public class tREESET {
    public static void main(String[] args) {
        /*
         * These elements are stored in Lexographically ascending order.
         * TreeSet is one of the most important implementations of the SortedSet interface in Java that uses a Tree for storage.
         * TreeSet implements the SortedSet interface. So, udplicate values are not allowed.
         * TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree.
         * Therefor operations like add, remove, and search takes O(log(N)) time.
        */

        // declaration of TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        // Inserting elements in TreeSet
        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Four");
        ts.add("One");

        System.out.println(ts);
        // check if an element is present in TreeSet
        if(ts.contains("Five")) System.out.println("YES");
        else System.out.println("NO");

        // prints first and last element in TreeSet (Sorted according to the comparater function default is ascending)
        System.out.println("First Element : "+ts.first());
        System.out.println("Last Element : "+ts.last());

        // values just greater and smaller than the given string
        System.out.println("Higher Element : "+ts.higher("One"));
        System.out.println("Lower Element : "+ts.lower("One"));

        // deleting any specific element in TreeSet and also first and last element from the TreeSet
        ts.remove("Three");
        ts.pollFirst();
        ts.pollLast();
        System.out.println(ts);

        // Using comparator in TreeSet
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("One");
        ts1.add("Two");
        ts1.add("Three");
        ts1.add("Four");

        TreeSet<String> ts2 = new TreeSet<String>(new cmp());
        ts2.add("One");
        ts2.add("Two");
        ts2.add("Three");
        ts2.add("Four");

        System.out.println(ts1); 
        System.out.println(ts2); // This is in decreasing order
    }    
}
