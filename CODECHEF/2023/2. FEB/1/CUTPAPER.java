import java.util.Scanner;

public class CUTPAPER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n%k==0)
                System.out.println((n*n)/(k*k));
            else if((n/k)>1)
                System.out.println((n/k)*2);
            else
                System.out.println(1);
        }
        sc.close();
    }
}
