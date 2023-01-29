import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class CONN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%2==0 || n%7==0)
                System.out.println("YES");
            else if(n>7)
                if(((n/2)+(n/7))>=(n/11))
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            else 
                System.out.println("NO");
        }
        sc.close();
    }
}
