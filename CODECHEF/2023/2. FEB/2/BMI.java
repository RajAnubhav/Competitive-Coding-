import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int m, h;
            m = sc.nextInt();
            h = sc.nextInt();
            int bmi = (int)(m/(Math.pow(h, 2)));
            if(bmi<=18)
                System.out.println("1");
            else if(bmi<=24)
                System.out.println("2");
            else if(bmi<=29)
                System.out.println("3");
            else 
                System.out.println("4");
        }
        sc.close();
    }
}
