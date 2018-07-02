package methodEmbedding.Cookie_Clicker_Alpha.S.LYD763;


import java.util.Scanner;


public class g {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		for(int i=0;i<no;i++)
		{
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();
			double r=2;
			double a[][] = new double[(int) ((x/c)+1)][2];
			
			a[0][0]=0;
			a[0][1]=x/2;
			
			for(int i1=1;i1<(int)(x/c+1);i1++)
			{
				
				{
					a[i1][0]=a[i1-1][0]+c/r;
				
				r=r+f;
				a[i1][1]=a[i1][0]+x/r;
				}
			}
			double min=a[0][1];
			for(int j=1;j<a.length;j++)
			{
				if(min>a[j][1])
				{
					min=a[j][1];
				}
			}
			
			System.out.println("Case #"+(i+1)+": "+min);
		}
    }

}
