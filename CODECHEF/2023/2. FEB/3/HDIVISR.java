import java.util.Scanner;

public class HDIVISR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div=1;
        for(int i=1; i<10; i++)
            if(n%i==0)
                div=i;
        System.out.println(div);
        sc.close();
    }
}
