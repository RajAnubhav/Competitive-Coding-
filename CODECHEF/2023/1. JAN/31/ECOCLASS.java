import java.util.Scanner;

public class ECOCLASS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int s[] = new int[n]; 
            int d[] = new int[n]; 
            for(int i=0; i<n; i++)
                s[i] = sc.nextInt();
            for(int i=0; i<n; i++)
                d[i] = sc.nextInt();
            int count=0;
            for(int i=0; i<n; i++){
                if(s[i]==d[i])
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
