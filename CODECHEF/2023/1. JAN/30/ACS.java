import java.util.Scanner;
public class ACS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int p = sc.nextInt();
            if(p%100==0 && p/100>0)
                System.out.println(p/100);
            else if(p%100<10 && p/100==0)
                System.out.println(p%100);
            else if(p%100<10 && p/100>0)
                System.out.println(p%100 + 1);
            else 
                System.out.println(-1);
        }
        sc.close();
    }
}