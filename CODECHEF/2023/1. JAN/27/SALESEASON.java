import java.util.Scanner;
public class SALESEASON {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            if(x<=100){
                    System.out.println(x);
            }else if(x>100 && x<=1000){
                    System.out.println(x-25);
            }else if(x>1000 && x<=5000){
                    System.out.println(x-100);
            }else if(x>5000){
                    System.out.println(x-500);
            }
        }
        sc.close();
    }
}