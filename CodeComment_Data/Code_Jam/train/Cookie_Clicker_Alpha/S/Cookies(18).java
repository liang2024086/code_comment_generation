package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1506;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Cookies {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(new File("out.txt"));
		DecimalFormat df = new DecimalFormat("#.0000000");
		int T=sc.nextInt();
		
		for(int t=0;t<T;t++){
			double C=sc.nextDouble();
			double F=sc.nextDouble();
			double X=sc.nextDouble();
			
			
			double f=2;
			double fX=X/f;//total time without buying farm
			
			//if gets one farm
			
			double CX=0; ///constant
			double  cX=0;
			double lastmin=0;
			if(X <= C)
				out.println("Case #"+(t+1)+": "+df.format(X/f));
			else{
			while(X/f > C/f){
				CX=CX+C/f;
				
				cX=CX+ (X/(f+F));
				f=f+F;
				if(cX>lastmin && lastmin!=0){
					cX=lastmin;
					break;
				}else{
					lastmin=cX;
				}
					
			}
			if(cX<fX)
				out.println("Case #"+(t+1)+": "+df.format(cX));
			else
				out.println("Case #"+(t+1)+": "+df.format(fX));
			}
			
			
			
			
			
		}
		
		out.flush();

	}

}
