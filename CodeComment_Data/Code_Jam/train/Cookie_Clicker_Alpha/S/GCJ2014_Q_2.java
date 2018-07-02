package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class GCJ2014_Q_2 {
	public static void main (String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		StringTokenizer s;
		String line="";
		int num=Integer.parseInt(in.readLine());
		double f,c,x;
		double speed;
		double time,totaltime;
		double besttime;
		
		for (int i=0;i<num;i++){
			time=0;
			totaltime=0;
			speed=2.0;
			besttime=9999999;
			line=in.readLine();
			s=new StringTokenizer(line," ");
			c=Double.parseDouble(s.nextToken());
			f=Double.parseDouble(s.nextToken());
			x=Double.parseDouble(s.nextToken());
			
			while (true){
				besttime=x/speed;
				time=c/speed;
				speed+=f;
				if (x/speed+time>besttime){
					totaltime+=besttime;
					break;
				}
				totaltime+=time;
				//besttime=time+x/speed;
			}
			//System.out.println(totaltime);
			out.write("Case #"+(i+1)+": "+totaltime);			
			out.newLine();
			
		}
		in.close();
		out.close();
		
	}
}
