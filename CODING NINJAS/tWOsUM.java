import java.util.*;
public class tWOsUM {
    public static void main(String[] args) {
        // in this problem we will use maps
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int []nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = sc.nextInt();
        sc.close();

        TreeMap<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(!mp.containsKey(target-nums[i])) mp.put(nums[i], i);
            else{
                System.out.println(mp.get(target-nums[i])+" "+i);
                return;
            }
        }
        System.out.println(-1+" "+-1);
    }    
}
