import java.util.*;
public class POLYBAGS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%10>0)
                System.out.println(n/10 + 1);
            else
                System.out.println(n/10);
        }
        sc.close();
    }
}