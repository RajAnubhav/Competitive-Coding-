import java.util.Scanner;
public class AUDIBLE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
            // 67 to 45000 Hz
            int t = sc.nextInt();
            while(t-->0){
                int x = sc.nextInt();
                if(x>=67 && x<=45000)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        sc.close();
    }
}
