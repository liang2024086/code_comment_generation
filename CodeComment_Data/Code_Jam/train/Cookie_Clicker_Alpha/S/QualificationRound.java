package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1248;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class QualificationRound {

	/**
	 * @param args
	 */
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
		FileWriter fout=new FileWriter("B-small-attempt0.out");
		int t=Integer.parseInt(br.readLine());
		int i=1;
		while(t>0)
		{
			double c,f=0,fa,m;
			double s=0,ma,sa=0,prev;
			String ar[]=br.readLine().split(" ");
			c=Double.parseDouble(ar[0]);
			fa=Double.parseDouble(ar[1]);
			m=Double.parseDouble(ar[2]);
			prev=m;
			while(true)
			{
				
			s=c/((f*fa)+2);
			ma=m/((f*fa)+2);
			sa+=s;
			if(prev<(sa+ma-s))
			{
				BigDecimal number = new BigDecimal(prev);
				number = number.setScale(7, RoundingMode.HALF_EVEN);
				//System.out.println("Case #"+i+": "+number.toPlainString());
				fout.write("Case #"+i+": "+number.toPlainString()+"\n");
				break;
			}
			else
				prev=sa+ma-s;
			f++;
			}
			i++;
			t--;
		}
		fout.flush();
		fout.close();
		
		
	}

}
