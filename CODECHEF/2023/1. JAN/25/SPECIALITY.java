import java.util.Scanner;
public class SPECIALITY {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, z;
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(x>y && x>z)
                System.out.println("SETTER");
            else if(y>z)
                System.out.println("TESTER");
            else
                System.out.println("EDITORIALIST");
        }
        sc.close();
    }
}
