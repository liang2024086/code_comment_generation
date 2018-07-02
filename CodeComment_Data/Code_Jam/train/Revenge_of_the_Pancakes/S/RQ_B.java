package methodEmbedding.Revenge_of_the_Pancakes.S.LYD707;

// @author:debverine | 09-Apr-2016 | 12:37:09 pm
import java.io.*;
import java.util.*;

class RQ_B {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter pw=new PrintWriter(new FileWriter("B.out"));
		int tc,t,i,count;
		String txt;
		t = Integer.parseInt(br.readLine().trim());
		for(tc=1;tc<=t;tc++) {
			txt=br.readLine().trim();
			count=0;
			for(i=1;i<txt.length();i++)
				if(txt.charAt(i)!=txt.charAt(i-1))
					count++;
			if(txt.charAt(txt.length()-1)=='-')
				count++;
			pw.println("Case #"+tc+": "+count);
		}
		pw.flush();
		pw.close();

	}

}
