package methodEmbedding.Cookie_Clicker_Alpha.S.LYD964;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class CCA {
	public static void main(String args[]){
		File test;
		int testcases;
		PrintWriter pw;
		double c,f,x;
		double fout=2;
		double time;
		try {
			test=new File("B-small-attempt0.in");
			pw=new PrintWriter("B-small-attempt0.out","UTF-8");
			Scanner s=new Scanner(test);
			testcases=Integer.parseInt(s.nextLine().trim());
			
			for(int i=0;i<testcases;i++){
				String []line=s.nextLine().trim().split(" ");
				c=Double.parseDouble(line[0].trim());
				f=Double.parseDouble(line[1].trim());
				x=Double.parseDouble(line[2].trim());
				fout=2;
				double list[]=new double[(int)10000];
				double sumf[]=new double[(int)10000];
				list[0]=x/fout;
				sumf[0]=c/fout;
				int j;		
				for(j=1;;j++){
					fout=fout+f;
					sumf[j]=sumf[j-1]+c/fout;
					time=sumf[j-1]+(x/fout);
					list[j]=time;
					
					if(time>=list[j-1])break;
				}
				pw.printf("Case #%d: %.7f\n",(i+1),list[j-1]);
				
			}
			
			s.close();
			pw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
