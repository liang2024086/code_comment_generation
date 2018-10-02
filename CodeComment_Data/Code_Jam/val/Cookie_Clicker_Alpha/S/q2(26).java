package methodEmbedding.Cookie_Clicker_Alpha.S.LYD524;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(new File("B-small-attempt8.in"));
			int a=scan.nextInt();
			
			
			for(int i=0;i<a;i++){
				double c=scan.nextDouble();
				double f=scan.nextDouble();
				double x=scan.nextDouble();
				
				double cf=2.0;
				double secounds=0;
				double prev=x/(cf);
				while(true){
					secounds+=c/cf;
					cf+=f;
					
					if(prev<secounds+(x/cf)){
						break;
					}
					prev=secounds+(x/cf);
					
				}
				/**/
				DecimalFormat df = new DecimalFormat();
				df.setMinimumFractionDigits(7);
				String previ=df.format(prev);
				String str=previ;
				str = str.replaceAll("\\.0*$|(?<=\\.[0-9]{0,2147483646})0*$", "");
				
				System.out.println("Case #"+(i+1)+": "+str);
				//System.out.println("Case #"+(i+1)+": "+str);
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
