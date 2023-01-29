import java.util.Scanner;
public class TEA {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(x<y)
                System.out.println((x/y+1)*z);
            else{
                if(x%y==0)
                    System.out.println((x/y)*z);
                else
                    System.out.println(((x/y)+1)*z);
            }
        }
        sc.close();
    }
}
