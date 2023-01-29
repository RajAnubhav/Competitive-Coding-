import java.util.*;

public class aRRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>(100); // this is a capacity 100
        ArrayList<Integer> list3 = new ArrayList<>(Collections.nCopies(10,0 )); // this is a capacity 10 and all intialized to 0


        // Add in ArrayList
        list1.add(100);
        list1.add(700);
        list1.add(200);

        System.out.println(list1.get(0));

        // Get in ArrayList
        System.out.println(list1);

        // Adding an element in between ArrayList
        list1.add(1, 2);
        System.out.println(list1);

        // Modify in ArrayList
        list1.remove(0);
        System.out.println(list1);

        // size of ArrayList
        int sz = list1.size();
        System.out.println(sz);

        // Contains in ArrayList
        System.out.println(list1.contains(200));
        System.out.println(list1.contains(100));

        // Sort ArrayList
        Collections.sort(list1);
        System.out.println(list1);
    }   
}
