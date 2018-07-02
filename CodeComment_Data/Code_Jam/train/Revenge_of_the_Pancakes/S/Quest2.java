package methodEmbedding.Revenge_of_the_Pancakes.S.LYD297;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Quest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String path="C:\\workspace\\GCJ\\B-small-attempt0.txt";
		String output="C:\\workspace\\GCJ\\output21.txt";
		BufferedReader br=new BufferedReader(new FileReader(path));
		PrintWriter pw=new PrintWriter(output);
		int testCases=Integer.parseInt(br.readLine());
		int t=1;
		
		while(t<=testCases){
			int cnt=0;
			String s=br.readLine();
			if(s.length()==1&&s.charAt(0)=='+')cnt=0;
			else if(s.length()==1&&s.charAt(0)=='-')cnt=1;
			else {
				int i=0;
				while(i+1<s.length()){
					if(s.charAt(i)!=s.charAt(i+1))cnt++;
					i++;
				}
				if(s.charAt(i)=='-')cnt++;
			}
			pw.println("Case #"+t+": "+cnt);
		t++;
		}
		br.close();
		pw.close();
	}

}
