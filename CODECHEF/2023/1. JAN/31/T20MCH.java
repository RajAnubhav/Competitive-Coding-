import java.util.Scanner;

public class T20MCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, o, c;
        r = sc.nextInt(); // target
        o = sc.nextInt(); // overs played
        c = sc.nextInt(); // c runs made till now
        if((r-c)/((20-o)*6)<6)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
