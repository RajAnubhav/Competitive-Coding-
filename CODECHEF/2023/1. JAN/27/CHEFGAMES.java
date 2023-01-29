import java.util.Scanner;
public class CHEFGAMES {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int []a = new int [4];
            for(int i=0; i<4; i++){
                a[i] = sc.nextInt();
            }
            int flag = 0;
            for(int i=0; i<4; i++){
                if(a[i]==1){
                    flag++;
                }
            }
            if(flag>0){
                System.out.println("OUT");
            }else
                System.out.println("IN");

        }
        sc.close();
    }
}
