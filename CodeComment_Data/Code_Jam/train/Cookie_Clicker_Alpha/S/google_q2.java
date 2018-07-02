package methodEmbedding.Cookie_Clicker_Alpha.S.LYD555;

import java.util.*;
public class google_q2 {

	public static void main(String args[])
	{
		int Case;

		double cok=2,time=0;
		Scanner sn=new Scanner(System.in);
		Case=sn.nextInt();
		double far,win,no_win;
		double arr[][]=new double[Case][3];
		for(int i=0;i<Case;i++)
		{
		arr[i][0]=sn.nextDouble();
		arr[i][1]=sn.nextDouble();
		arr[i][2]=sn.nextDouble();
		}
		for(int i=0;i<Case;i++)
		{
		cok=2;
		time=0;
		do{
		far=arr[i][0]/cok;
		no_win=arr[i][2]/cok;
		win=arr[i][2]/(cok+arr[i][1]);
		
			time=time+far;
			cok=cok+arr[i][1];
		}while(no_win >(far+win));
		time=time+no_win-far;
		System.out.println("Case #"+(i+1)+": "+time);
		}
	}
}
