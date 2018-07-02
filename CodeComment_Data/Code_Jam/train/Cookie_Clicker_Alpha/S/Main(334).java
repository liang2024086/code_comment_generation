package methodEmbedding.Cookie_Clicker_Alpha.S.LYD500;


import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
    
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double M=2;
		int x = 0;
		double c = 0,f=0,v=0;
		double Ans=0;
		double[][] A1=new double[n][3];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				A1[i][j]=in.nextDouble();
			}
		}
	for(int i=0;i<n;i++)
	{
		M=2;
		Ans=0;
		c=A1[i][0];
		f=A1[i][1];
		v=A1[i][2];
	    
         while((Ans+(c/M)+(v/(M+f)))<=(Ans+(v/M)))
         {
        	 Ans+=(c/M);
        	 M+=f;
	     }
         Ans+=(v/M);
         System.out.println("Case #"+(i+1)+": "+Ans);

		
	}
	in.close();
}
}

