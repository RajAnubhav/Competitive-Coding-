import java.util.Scanner;
public class AIANALYSE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if(c<=1000)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
