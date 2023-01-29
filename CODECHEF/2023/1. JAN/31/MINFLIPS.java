import java.util.Scanner;

public class MINFLIPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int []a = new int [n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            if((n%2)==0){
                int sum=0;
                for(int i=0; i<n; i++){
                    sum+=a[i];
                }
                System.out.println(sum/2);
            }else
                System.out.println(-1);
        }
        sc.close();
    }
}
