import java.util.Scanner;

public class RATING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            if(s==0)
                System.out.println(-1);
            else
                System.out.println("-"+(s+1));
        }
        sc.close();
    }
}
