import java.util.Scanner;

public class ALTERADD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a<b){
                if(a%2 !=0 && (Math.abs(a-b)%2 !=0))
                    System.out.println("YES");
                else if(a%2==0 && (Math.abs(a-b)%2==0))
                    System.out.println("YES");
                else 
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
