import java.util.Scanner;
public class LUCKYN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int flag = 0;
            while(x!=0){
                int rem = x%10;
                if(rem==7){
                    flag++;
                    break;
                }
                x/=10;
            }
            if(flag!=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
