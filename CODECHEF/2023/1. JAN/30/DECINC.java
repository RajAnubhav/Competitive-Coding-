import java.util.*;
public class DECINC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0)
            System.out.println(n+1);
        else
            System.out.println(n-1);
        sc.close();
    }
}