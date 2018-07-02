package methodEmbedding.Cookie_Clicker_Alpha.S.LYD48;

import java.util.*;
import java.io.*;
public class Q2 {

	public static void main(String args[])
	{
		File f1=new File("test1.in");
		Scanner a=null;
		try{
		a=new Scanner(f1) ;
		}
		catch(Exception e){
			
		
		System.out.println(e);
		}
		int test=Integer.parseInt(a.nextLine().trim());
		int u=1;
		while(u<=test)
		{
			
			String parts[]=a.nextLine().trim().split(" ");
			double totalCookiesRequired=Double.parseDouble(parts[2]);
			double rateOfCooies=2.000;
			double costOfNewMachine=Double.parseDouble(parts[0]);
			double increaseInSecond=Double.parseDouble(parts[1]);
			double time[]=new double[1000000];
			double timeForInewMachines[]=new double[1000000];
			double RateAfterImachines[]=new double[1000000];
			boolean c=true;
			int i=1;
			timeForInewMachines[0]=0;time[0]=totalCookiesRequired/rateOfCooies;
			RateAfterImachines[0]=rateOfCooies;
			while(c)
			{
				
				timeForInewMachines[i]=timeForInewMachines[i-1]+costOfNewMachine/RateAfterImachines[i-1];
				RateAfterImachines[i]=RateAfterImachines[i-1]+increaseInSecond;
				
				
				time[i]=timeForInewMachines[i]+totalCookiesRequired/RateAfterImachines[i];
				
				if(time[i]>=time[i-1])
					{
					c=false;
					}
				else
				i++;
			}
		System.out.print("Case #"+u+": ");
		System.out.printf("%.7f\n",time[i-1]);
		u++;
		}
	}
}
