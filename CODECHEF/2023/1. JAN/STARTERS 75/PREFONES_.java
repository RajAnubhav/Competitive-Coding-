import java.util.*;
public class PREFONES_ {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            while(t-->0){
                int n = scn.nextInt();
                String s = scn.next();
                int o=0,p=0,mxVal = 0,k=0;
                while(k<n && s.charAt(k) == '1'){k++;p++;}
                for(int i=k;i<n;i++){
                    if(s.charAt(i)=='1') o++;
                    else{
                       mxVal = (int)Math.max(mxVal,o);
                       o = 0;
                    }
                }
                mxVal = (int)Math.max(mxVal,o);
                System.out.println(mxVal+p);
            }
        scn.close();
    }
}
