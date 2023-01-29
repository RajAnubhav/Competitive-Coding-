import java.util.Scanner;

public class SUNDAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            int holiday = 0;
            for(int i=1; i<n; i++){
                if(a[i]!=6||a[i]!=13||a[i]!=20||a[i]!=27)
                    holiday++;
            }
            System.out.println(holiday+8);
        }
        sc.close();
    }
}
