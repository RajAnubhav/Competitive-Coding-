import java.util.*;
public class PREFONES{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            while(i<n && s.charAt(i)=='1')
                i++;
            int r = i+1;
            int mx=0, cur=0;
            while(r<n){
                if(s.charAt(r)=='0'){
                    mx = Math.max(mx, cur);
                    cur=0;
                }else
                    cur++;
                
                r++;
            }
            mx = Math.max(mx, cur);
            System.out.println(mx+i);
        }
        sc.close();
    }
}