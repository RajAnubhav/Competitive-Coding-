import java.util.Scanner;
public class MINCARS {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n<=4){
                System.out.println(1);
            }else if(n%4==0 && n>4){
                System.out.println(n/4);
            }else 
                System.out.println(n/4 + 1);
        }
        sc.close();
    }
}
