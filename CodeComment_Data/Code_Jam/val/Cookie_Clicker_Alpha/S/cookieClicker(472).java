package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1390;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class cookieClicker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cookieClicker f = new cookieClicker();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("file/B-small-attempt0.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("file/b.txt")));
			
		
			int count = Integer.parseInt(br.readLine());
			
			int c=1;
			
			while(c<=count)
			{
				
				double C=0.0,F=0.0,X=0.0;
				double rate=2.0;
				
				String line = br.readLine();
				StringTokenizer st= new StringTokenizer(line," ");
				C=Double.parseDouble(st.nextToken());
				F=Double.parseDouble(st.nextToken());
				X=Double.parseDouble(st.nextToken());
				
				double prevRate=2;
				double newRate=0;
				double prevTime=0;
				double prevTotTime=0;
				double time=0;
				double totTime=0;
				double fullTime=0;
				double sumTime=0;
				if(C>X)
				{
					prevTotTime=(double)(X/2.0);
				}
				else
				{
					fullTime=(double)( X/2.0);
					newRate=prevRate;
					int d=0;
					while(true)
					{
						d++;
						totTime=sumTime+ (double)( X/newRate);
						if(d!=1)
						{
							if (totTime>prevTotTime)
								break;
						
						}
						
						time= (double)( C/newRate);
						sumTime=sumTime+time;
						prevRate=newRate;
						newRate=newRate+F;
						prevTotTime=totTime;
					}
				}
				
				
				String s=""+prevTotTime;
				if(s.indexOf(".")>0)
				{
					if(s.length()-s.indexOf(".")-1>7)
					{
						DecimalFormat df = new DecimalFormat("#.#######");
				        
						s=""+df.format(prevTotTime);
					}
					else if(s.indexOf(".")!=s.length()-1)
					{
						int j=s.length()-s.indexOf(".")-1;
						for(int h=1;h<=7-j;h++)
						{
							s=s+"0";
						}
					}
					else
					{
						s=s+".0000000";
					}
				}
				else
				{
					s=s+".0000000";
				}
			
				 
				bw.write("Case #"+c+": "+s);
			    bw.newLine();
				c++;
			}
			
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
	}

}
