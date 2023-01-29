import java.util.*;

public class nEXTgREATEReLEMENT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        ArrayList<Integer> ans =  new ArrayList<Integer>(Collections.nCopies(n, 0));
        for(int i=0; i<n; i++)
            nums.add(sc.nextInt());

        Stack<Integer> stack = new Stack<Integer>();
        for(int i=n-1; i>=0; i--){
            if(stack.isEmpty()){
                ans.set(i, -1);
                stack.push(nums.get(i));
            }else{
                while(!stack.isEmpty() && stack.peek()<=nums.get(i)) stack.pop();
                if(!stack.isEmpty()){
                    ans.set(i, stack.peek());
                    stack.push(nums.get(i));
                }else{
                    ans.set(i, -1);
                    stack.push(nums.get(i));
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }    
}
