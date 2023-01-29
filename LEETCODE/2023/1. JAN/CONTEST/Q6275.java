import java.util.*;
public class Q6275 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        int b[] = new int [n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int p = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i]+=k;
                a[j]-=k;
            }
            p++;
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(a[i]!=b[i]){
                count=0;
            }
            count++;
        }

        if(count!=0){
            System.out.println(p/2);
        }else{
            System.out.println(-1);
        }
        sc.close();
    }
}
