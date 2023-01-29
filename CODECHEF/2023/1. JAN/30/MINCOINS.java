import java.util.Scanner;
public class MINCOINS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int c5=0, c10=0;
            if(x%10==0)
                c10 = x/10;
            else if(x%5==0)
                c5 = x/5;
            
            if((c5+c10)>0){
                c10 += c5/2;
                System.out.println((c5%2)+c10);
            }else
                System.out.println(-1);

        }
        sc.close();
    }
}
