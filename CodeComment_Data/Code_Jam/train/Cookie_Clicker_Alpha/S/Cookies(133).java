package methodEmbedding.Cookie_Clicker_Alpha.S.LYD139;


import java.io.File;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Cookies {
	public static final DecimalFormat df = new DecimalFormat("#.#######"); 
	public static final String  Volunteer_cheated = "Volunteer cheated!";
	public static void main(String[] args) throws Exception { 
		String gcjProblem="testCookies";
		File fin =new File ("C:/Users/youness/Downloads/"+gcjProblem+".in"  ); 
		File fow =new File ("C:/Users/youness/Downloads/"+gcjProblem+".out"  );
		Scanner sc = new Scanner(fin);
		PrintWriter pw = new PrintWriter(fow); 
		 int caseCnt = sc.nextInt();
	        for (int caseNum=0; caseNum<caseCnt; caseNum++) {
	            pw.print("Case #" + (caseNum+1) + ": ");
	            double C = sc.nextDouble();
	            double F =  sc.nextDouble();
	            double X =  sc.nextDouble();
	           
	            
	            //general case;
	            double bestNthredshold = X/C -2.0/F -1.0;
	         
	            Double t=0.0;
	            int i=0;
	            while( i<bestNthredshold) {
	            	t+=C/(2+i*F);
	            	i++;
	            }
	            t+=X/(2+i*F);
	            
	            	pw.println(df.format(t));
	           
	            pw.flush();
	            
	        } 
	        pw.close();
	        sc.close();
	}
	
}
