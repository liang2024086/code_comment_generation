package methodEmbedding.Speaking_in_Tongues.S.LYD1622;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;


public class pbA {	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("test.in"));
		PrintWriter out= new PrintWriter("output.out");
		
		String key="fgdebcanolmjkhiwvutsrqpzyx ",values="wlicnfysemxuobktgjrdpzvqah ",s,r;
		int k=Integer.parseInt(sc.nextLine());		
		for(int i=1;i<=k;i++){
			s=sc.nextLine();r="";			
			for(int j=0;j<s.length();j++) r+=key.charAt(values.indexOf(s.charAt(j)));
		   out.print("Case #"+i+": "+r);
		   if (i!=k) out.println();
		}		
	out.close();
	}
}
