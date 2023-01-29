import java.util.Scanner;
public class INCRIQ {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x+7 > 170)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
