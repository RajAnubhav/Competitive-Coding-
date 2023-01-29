import java.util.HashMap;
import java.util.TreeMap;
public class mAPS {
    public static void main(String[] args) {
        // Declaration
        HashMap<String, Integer>mp = new HashMap<String, Integer>();

        // Insert in map
        mp.put("coding", 1);
        mp.put("ninjas", 2);
        mp.put("course", 3);

        // print map content
        System.out.println(mp);

        // get value for the given key
        int val = mp.get("ninjas");
        System.out.println(val);

        // changing the value of a key
        mp.put("course", 4);
        System.out.println(mp);

        // size of map i.e., number of key value pair stored
        int sz = mp.size();
        System.out.println(sz);

        // check if a key is present in the map
        if(mp.containsKey("coding"))System.out.println("Key present");
        else System.out.println("Key not present");

        // remove key/value pair from the map
        mp.remove("coding");
        System.out.println(mp);


        // TreeMap
        TreeMap<Integer, String>mp2 = new TreeMap<Integer, String>();
        // all the methods used in hasmaps can be used in treemap
        mp2.put(1, "coding");
        mp2.put(2, "ninjas");
        mp2.put(3, "course");
        
        System.out.println("\nTreeMap without compare to");
        System.out.println(mp2);
        
        TreeMap<Integer, String>mp3 = new TreeMap<Integer, String>((a, b)->b-a);
        mp3.put(1, "coding");
        mp3.put(2, "ninjas");
        mp3.put(3, "course");

        System.out.println("Tree map with comparator");
        System.out.println(mp3); // it is arranged in the decreasing order.
    }    
}
