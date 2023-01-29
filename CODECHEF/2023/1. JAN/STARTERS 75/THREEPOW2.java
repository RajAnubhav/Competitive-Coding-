import java.util.*;
public class THREEPOW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            if(s.equals("1") || s.equals("10")){
                System.out.println("NO");
                continue;
            }
            int count=0;
            for(int i=0; i<n; i++)
                if(s.charAt(i)=='1')
                    count++;

            if(count<=3)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }    
}
