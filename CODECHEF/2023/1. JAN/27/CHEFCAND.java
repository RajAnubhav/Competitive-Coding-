import java.util.Scanner;
public class CHEFCAND {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();
            if(n>x){
                if((n-x)%4==0){
                    System.out.println((n-x)/4);
                }else{
                    System.out.println((((n-x)/4)+1));
                }
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
