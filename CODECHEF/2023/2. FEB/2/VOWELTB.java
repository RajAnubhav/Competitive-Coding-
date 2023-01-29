import java.util.Scanner;

public class VOWELTB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            System.out.println("VOWEL");
        else
            System.out.println("CONSONANT");
        sc.close();
    }
}
