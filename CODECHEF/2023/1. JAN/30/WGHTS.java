import java.util.Scanner;
public class WGHTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w, x, y, z;
            w = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(w==(x+y)||w==(y+z)||w==(x+z)||w==(x+y+z)||w==x||w==y||w==z)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
