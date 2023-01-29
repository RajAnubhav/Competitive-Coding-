import java.util.Scanner;

public class BULBLIFE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n-1; i++)
                a[i] = sc.nextInt();
            
            int sum=0;
            for(int i=0; i<n-1; i++)
                sum+=a[i];
            
            if(((n*x)-sum)>0)
                System.out.println((n*x)-sum);
            else 
                System.out.println(0);
        }
        sc.close();
    }
}
