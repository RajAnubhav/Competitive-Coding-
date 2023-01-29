import java.util.Scanner;
public class MY1STCONTEST {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt(); 
        a = sc.nextInt(); 
        b = sc.nextInt(); 
        int get500 = n-a;
        int get1000 = get500-b;
        System.out.println(get500+" "+get1000);
        sc.close();
    }
}
