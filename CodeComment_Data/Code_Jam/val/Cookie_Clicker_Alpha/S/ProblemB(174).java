package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1174;



import java.util.Locale;
import java.util.Scanner;

public class ProblemB {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		double C = 0;
		double F = 0;
		double X = 0;
		double farms = 0;
		double prod = 2;
		double MIN = 0, MINf = 0;
		int n = 0;
		n = scan.nextInt();
		for (int i = 0; i < n; i++){
			farms = 0;
			prod = 2;
			MIN = 0; MINf = 0;
			C = scan.nextDouble();
			F = scan.nextDouble();
			X = scan.nextDouble();
			do{
				if (MIN>0){MIN = MINf;}
				else{
				MIN = X / prod;}
				farms += C / prod;
				prod += F;
				MINf = farms + (X/prod);
			}while(MINf < MIN);
			System.out.printf("Case #%d: %.7f\n",i+1, MIN);
		}
	}
}
