package methodEmbedding.Cookie_Clicker_Alpha.S.LYD619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<= s ; i++)
		{
			String a[] = br.readLine().split("\\s");
			BigDecimal bg1 = new BigDecimal(a[0]);
			BigDecimal bg2 = new BigDecimal(a[1]);
			BigDecimal bg3 = new BigDecimal(a[2]);
			
			BigDecimal dos = new BigDecimal("2.0");
			BigDecimal uno = new BigDecimal("1.0");
			BigDecimal ans = new BigDecimal("0.0");
			
			BigDecimal tem1 = new BigDecimal("0.0");
			BigDecimal tem2 = new BigDecimal("0.0");
			BigDecimal tem3 = new BigDecimal("0.0");
			BigDecimal tem4 = new BigDecimal(a[1]);
			
			ans = bg1.divide(dos);
			bg2 = bg2.add(dos);
			
			for(int j = 0; ; j++)
			{
				//System.out.println(ans+"aaaa");
				
				tem1 = ans.add(bg3.divide(bg2,7,RoundingMode.HALF_UP));
				tem2 = ans.add(bg1.divide(bg2,7,RoundingMode.HALF_UP));
				tem2 = tem2.add(bg3.divide(bg2.add(tem4),7,RoundingMode.HALF_UP));
				
				tem3 = bg3.divide(dos);
				
				//System.out.println("ans+bg"+bg1.divide(bg2,6,RoundingMode.HALF_UP));
				
				ans = ans.add(bg1.divide(bg2, 7,RoundingMode.HALF_UP ));
				bg2 = bg2.add(tem4);
				
				//System.out.println("bg2 ======"+bg2);
				//System.out.println(ans);
				//System.out.println(tem1);
				//System.out.println(tem2);
				//System.out.println(tem3);
				//System.out.println();
				if(tem1.compareTo(tem3)>0)
				{
					RoundingMode RM = RoundingMode.HALF_UP;
					System.out.println("Case #"+i+": "+tem3.setScale(7, RM));
					break;
				}
				if(tem1.compareTo(tem2)<0)
				{
					System.out.println("Case #"+i+": "+tem1);
					break;
				}
			}
		}
		
	}
}
