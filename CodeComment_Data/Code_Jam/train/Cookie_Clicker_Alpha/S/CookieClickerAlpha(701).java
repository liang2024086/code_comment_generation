package methodEmbedding.Cookie_Clicker_Alpha.S.LYD738;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;


public class CookieClickerAlpha {
	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new FileReader("inputs2/B-small-attempt0.in"));
		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("inputs2/sol.out")));
		 DecimalFormat df = new DecimalFormat("###.0000000");
		 String str = in.readLine();
		 int cases = Integer.valueOf(str);
		 for(int i=1; i<=cases;i++){
			 //1st iteration
			 str= in.readLine();
			 double C=0,F=0,X=0;
			 String[] input=str.split("\\s");
			 C=Double.parseDouble(input[0]);
			 F=Double.parseDouble(input[1]);
			 X=Double.parseDouble(input[2]);
			 
			 System.out.println(C+" "+F+" "+X);
			 int farms=1;
			 double preAns=X/2.0;
			 double ans=preAns;
			 do{
				 preAns=ans;
				 ans=0;
				 for(int j=0;j<farms;j++){
					 ans+=C/(2+F*j);
				 }
				 ans+=X/(2+F*farms);
				 farms++;
			 }while(preAns>ans);
			 if(i<cases){
				out.print("Case #"+i+": ");
			 	out.println(df.format(preAns));
			 }
			 else{
				 out.print("Case #"+i+": ");
				 out.print(df.format(preAns));
			 }
			 
		 }
		 out.close();
	}
}
