import java.util.Scanner;
public class CHEFPAGES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==0)
            System.out.println("https://www.codechef.com/practice");
        else if(b==0)
            System.out.println("https://www.codechef.com/contests");
        else 
            System.out.println("https://discuss.codechef.com");
        sc.close();
    }   
}