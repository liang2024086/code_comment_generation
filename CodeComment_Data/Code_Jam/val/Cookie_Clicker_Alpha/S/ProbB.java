package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1545;


import java.util.Scanner;

public class ProbB {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int curcase =1;curcase <=n;curcase++ )
	{
	double C = sc.nextDouble();
	double F = sc.nextDouble();
	double X = sc.nextDouble();
	double cheapestsofar = Double.MAX_VALUE;
	double infrastructurecost = 0;
	for(int i=0;i<X*1000;i++)
	{
		if(infrastructurecost + X/(2+F*i)<cheapestsofar)
			{
			cheapestsofar = infrastructurecost+ X/(2+F*i);
			//System.out.println(i);
			}
	infrastructurecost =  infrastructurecost + C/(2+F*i);
	}
	System.out.println("Case #"+curcase+": "+cheapestsofar);
	
	}
	}
}
