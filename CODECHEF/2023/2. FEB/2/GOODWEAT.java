import java.util.Scanner;

public class GOODWEAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a[] = new int[7];
            int count=0;
            for(int i=0; i<7; i++)
                a[i] = sc.nextInt();
            
            for(int i=0; i<7; i++)
                if(a[i]==1)
                    count++;
            
            if(count>3)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
