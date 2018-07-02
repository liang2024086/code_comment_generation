package methodEmbedding.Cookie_Clicker_Alpha.S.LYD455;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;


public class Cookie {

	public static void main(String []args)
	{
		try
		{
			int cases=0,i=1,j=0,k=0;
			double C=0,F=0,X = 0;
			double T=0,speed=0;
			double lasttime=0,presenttimetoC=0,nexttimetoX=0;

			FileInputStream fstream = new FileInputStream("C:/Users/Aravind/workspace/Codejam/src/B-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Aravind/workspace/Codejam/src/B-small-attempt0.out"));
			String[] str = null;
			String tempstr=null;

			cases=Integer.parseInt(br.readLine());

			while (i<=cases)  
			{

				bw.write("Case #"+(i)+": ");
				//System.out.println("Case #"+(i)+": ");
				i++;
				tempstr=br.readLine();
				for ( j=0;j<3;j++) {
					str = tempstr.split(" ");
					C=Double.parseDouble(str[0]);
					F=Double.parseDouble(str[1]);
					X=Double.parseDouble(str[2]);
				}
				speed=2;
				while(true) {
					lasttime=X/speed;
					presenttimetoC=C/speed;
					nexttimetoX=X/(speed+F);
					//System.out.println(String.valueOf(lasttime)+" "+String.valueOf(presenttimetoC)+" "+String.valueOf(nexttimetoX));
					if ( lasttime > presenttimetoC+nexttimetoX ) {
						speed+=F;
						T+=presenttimetoC;
					} else {
						T=T+lasttime;
						break;
					}
					
				}
				bw.write(String.valueOf(Double.parseDouble(new DecimalFormat("#.#######").format(T)))+'\n');
				//System.out.println(String.valueOf(C)+" "+String.valueOf(F)+" "+String.valueOf(X)+" "+String.valueOf(T));
				
				T=0;
				speed=0;
			}
			in.close();
			bw.close();
		}
		catch(Exception e)	 
		{
			System.out.println("Caught exception"+e);
		}
	}
}
