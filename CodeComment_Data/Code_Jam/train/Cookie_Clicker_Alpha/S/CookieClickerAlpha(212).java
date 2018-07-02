package methodEmbedding.Cookie_Clicker_Alpha.S.LYD637;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;

public class CookieClickerAlpha {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean debug=false;
		if(args.length>=1)
			System.setIn(new FileInputStream(args[0]));
		if(args.length>1) {
			System.setOut(new PrintStream(new FileOutputStream(args[1])));
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.valueOf(br.readLine());
		
		for(int t=1;t<=T;++t) {
			
			String[] tok=br.readLine().split(" ");
			double C=Double.valueOf(tok[0]);
			double F=Double.valueOf(tok[1]);
			double X=Double.valueOf(tok[2]);
			
			double ret=X/2;
			
			int lim = 200002;
			
			double cookieFarmTime[] = new double[lim];
			cookieFarmTime[0]=0.0;
			for(int i=1;i<cookieFarmTime.length;++i)
				cookieFarmTime[i]=cookieFarmTime[i-1]+(C/(2.0+((i-1)*F)));
			
			double cookiePerSec = 2.0;
			if(debug)
				System.out.println("0 "+ret);
			for(int c=1;c<lim;++c) {
				cookiePerSec+=F;
				double t2=X/(cookiePerSec);
				double time = cookieFarmTime[c]+t2;
				ret=Math.min(ret, time);
				if(debug)
					System.out.println(c+" "+time);			
			}
			DecimalFormat df=new DecimalFormat("0.0000000");
			System.out.println("Case #"+t+": "+df.format(ret));
		}
	}
}
