import java.util.*;
public class Q6300{

    static int bSearch(int a[], int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (a[mid] == x)
                return mid;
            if (a[mid] > x)
                return bSearch(a, l, mid - 1, x);
 
            return bSearch(a, mid + 1, r, x);
        }
        return -1;
    }

    static int intersection(int []a, int []b){
        int m = a.length;
        int n = b.length;
        if(m>n){
            int temp[]=a;
            a=b;
            b=temp;

            int t=m;
            m=n;
            n=t;
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            if(bSearch(a, 0, m-1, b[i])!=-1){
                return b[0];
            }
        }
        return -1;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int []a = new int [n];
        int []b = new int [m];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        intersection(a, b);
        sc.close();
    }
}