package methodEmbedding.Cookie_Clicker_Alpha.S.LYD311;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


public class Main {


	public static void main(String[] args) throws Exception {


		Scanner sc = new Scanner(new File("in.txt"));
		FileWriter out = new FileWriter(new File("out.txt"));
		int T = new Integer(sc.nextLine());
		for(int i = 1 ; i < T+1 ; i++)
		{
	
			int res = 0;
			double c = Double.valueOf(sc.next());
			double f = Double.valueOf(sc.next());
			double x = Double.valueOf(sc.next());
			double now = 0.0;
			double ihave = 0.0;
			double endwithrate = x/c;
			double farms = 0.0;
			double rate = 2.0;
			while(ihave<x)
			{
				boolean ihaveforfarm = ihave>=c;
				if(ihaveforfarm)
				{
					System.out.println("ihave for farm");
					boolean buyfarm = false;
					double newihave = ihave-c;
					double newrate = rate+f;
					double needmore = x-ihave;
					double timetoend = (needmore+c)/newrate;
					double farmgain = timetoend*f;
					boolean shouldbuy = farmgain > c;
					if(shouldbuy)
					{
						System.out.println("shouldbuy");
						System.out.println(needmore);
						System.out.println(ihave);
						System.out.println(rate);
						System.out.println(newrate);
						System.out.println(timetoend);
						System.out.println(farmgain);
						farms++;
						ihave-=c;
						rate+=f;
						System.out.println(ihave);
						continue;
					}
					else
					{
						ihave = x;
						now  +=needmore/rate;
						break;
					}
				}
				else
				{
					System.out.println("idont have for farm");
					double timetofarm = (c-ihave)/rate;
					double timetoend = (x-ihave)/rate;
					if(timetoend<timetofarm){
						ihave = x;
						now += timetoend;
						break;
					}
					else
					{
						now +=timetofarm;
						ihave+=timetofarm*rate;
					}
				}
				
				
			}
			String resp = "";
	
			System.out.println("Case #"+i+": "+now);
			out.write("Case #"+i+": "+now+"\n");
			try{ sc.nextLine();}
			catch(Exception e){}

		}
		out.flush();
		sc.close();
		out.close();
	}

}
