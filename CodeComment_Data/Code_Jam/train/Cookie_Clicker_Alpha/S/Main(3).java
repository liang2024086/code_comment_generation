package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1319;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main{

	private static final double def=2;
	
	public static void main(String args[]){
		try{
			FileReader fr=new FileReader("input.txt");
			BufferedReader br=new BufferedReader(fr);
			PrintWriter pr=new PrintWriter("out.txt");
			String str=br.readLine();
			int T=Integer.parseInt(str);
			for(int t=1;t<=T;t++){
				str=br.readLine();
				int blank=str.indexOf(' ');
				double c=Double.parseDouble(str.substring(0,blank));
				str=str.substring(blank+1);
				blank=str.indexOf(' ');
				double f=Double.parseDouble(str.substring(0,blank));
				double x=Double.parseDouble(str.substring(blank+1));
				double ans=0,tmp;
				if(x>c){
					double div=def;
					while(true){
						tmp=c/div;
						double tmp1=x/div;
						double cmp=tmp+(x/(div+f));
						if(cmp>tmp1){
							ans+=tmp1;
							break;
						}
						ans+=tmp;
						div+=f;
					}
				}else ans=x/def;
				str="Case #"+t+": ";
				pr.print(str);
				pr.printf("%.7f\n",ans);
				System.out.print(str);
				System.out.printf("%.7f\n",ans);
			}
			pr.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
}
