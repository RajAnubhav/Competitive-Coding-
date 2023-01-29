import java.util.Scanner;
public class ACCURACY {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x%3==0)
                System.out.println(0);
            else
                System.out.println(((x/3)+1)*3-x);
        }
        sc.close();
    }
}
