import java.util.Scanner;

public class CHN15A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int count=0;
            for(int i=0; i<n; i++){
                if((a[i]+k)%7==0){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
