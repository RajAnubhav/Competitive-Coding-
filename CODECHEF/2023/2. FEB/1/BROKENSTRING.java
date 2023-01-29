import java.util.Scanner;

public class BROKENSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int []freq = new int[26];
            for(int i=0; i<n; i++){
                freq[s.charAt(i)-'a']++;
            }
            int flag=0;
            for(int i=0; i<26; i++){
                if(freq[i]%2 !=0){
                    flag=0;
                    break;
                }else{
                    flag++;
                }
            }
            if(flag!=0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
