package methodEmbedding.Counting_Sheep.S.LYD298;

import java.util.*;
import java.io.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		//Main code starts from here
		int t = s.nextInt(),num=t;
		while(t-->0){
			int n =s.nextInt();
			HashSet<Character> set = new HashSet<Character>();
			long k = n,ans = n,check = 1;
			if(n==0)
				out.println("Case #"+(num-t)+": INSOMNIA");
			else{
				while(set.size()!=10){
					String st = ""+k;
					int y = st.length();
					for(int i=0;i<y;i++)
						set.add(st.charAt(i));
					check++;
					if(set.size()!=10)
						k = n * check;
					else
						ans = k;
				}
				out.println("Case #"+(num-t)+": "+ans);
			}
		}
		//Ends here
		out.close();
	}
}
