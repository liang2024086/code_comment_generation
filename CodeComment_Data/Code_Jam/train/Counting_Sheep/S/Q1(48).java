package methodEmbedding.Counting_Sheep.S.LYD461;

import java.util.*;
import java.io.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		int t = s.nextInt(),n=t;
		while(t-->0){
			int num =s.nextInt();
			HashSet<Character> count = new HashSet<Character>();
			long k = num,a = num;
			if(num==0)
				out.println("Case #"+(n-t)+": INSOMNIA");
			else{
				while(count.size()!=10){
					String inp = ""+k;
					int y = inp.length();
					for(int j=0;j<y;j++)
						count.add(inp.charAt(j));
					if(count.size()!=10)
						k = num + k;
					else
						a = k;
				}
				out.println("Case #"+(n-t)+": "+a);
			}
		}
		//Ends here
		out.close();
	}
}
