import java.util.Scanner;

public class REACHFAST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, k;
            x = sc.nextInt();
            y = sc.nextInt();
            k = sc.nextInt();
            if(Math.abs(x-y)%k>0)
                System.out.println((Math.abs(x-y)/k)+1);
            else
                System.out.println(Math.abs(x-y)/k);
        }
        sc.close();
    }
}
