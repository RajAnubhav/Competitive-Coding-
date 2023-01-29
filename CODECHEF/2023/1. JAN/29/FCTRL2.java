import java.util.Scanner;
public class FCTRL2 {

    static int fact(int n){ // recursive approach
        if(n==0 || n==1)
            return 1;
        return (n*fact(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int fac = fact(n);
            System.out.println(fac);
        }
        sc.close();
    }
}
