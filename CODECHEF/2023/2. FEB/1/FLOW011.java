import java.util.Scanner;

public class FLOW011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gross, DA, HRA;
        int t = sc.nextInt();
        while(t-->0){
            double basic=sc.nextDouble();
		    if(basic<1500){
		        HRA=0.1*basic;
		        DA=0.9*basic;
		    }
		    else{
		        HRA=500;
		        DA=0.98*basic;
		    }
		    gross=basic+HRA+DA;
            System.out.println(gross);
        }
        sc.close();
    }
}
