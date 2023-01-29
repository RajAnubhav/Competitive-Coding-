import java.util.Scanner;

public class FLOW014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, c;
            float b;
            a = sc.nextInt();
            b = sc.nextFloat();
            c = sc.nextInt();
            if(a>50 && b<0.7 && c>5600)
                System.out.println(10);
            else if(a>50 && b<0.7)
                System.out.println(9);
            else if(b<0.7 && c>5600)
                System.out.println(8);
            else if(a>50 && c>5600)
                System.out.println(7);
            else if(a>50 || b<0.7 || c>5600)
                System.out.println(6);
            else 
                System.out.println(5);
        }
        sc.close();
    }
}
