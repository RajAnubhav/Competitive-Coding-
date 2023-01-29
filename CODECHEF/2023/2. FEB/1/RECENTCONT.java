import java.util.Scanner;

public class RECENTCONT{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int c1=0, c2=0;
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                String s = sc.next();
                if(s.equals("START38"))
                    c1++;
                else
                    c2++;
            }
            System.out.println(c1+" "+c2);
        }
        sc.close();
    }
}