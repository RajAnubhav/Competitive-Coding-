import java.util.Scanner;
public class INTEST {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int count=0;
        for(int i=0; i<n; i++){
            if(a[i]%k==0)
                count++;
        }
        System.out.println(count);
    }
}
