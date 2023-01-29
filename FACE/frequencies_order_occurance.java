import java.util.Scanner;

public class frequencies_order_occurance {
    static void printCharWithFreq(String str){
        int n = str.length();
        int []freq = new int[26];
        char s = 'A';
        for(int i=0; i<n; i++)
            freq[str.charAt(i)-'a']++;
        for(int i=0; i<26; i++)
            System.out.print(s++ + " ");
        System.out.println();
        for(int i=0; i<26; i++)
            System.out.print(freq[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printCharWithFreq(s);
        sc.close();
    }
}
