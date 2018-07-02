package methodEmbedding.Revenge_of_the_Pancakes.S.LYD330;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
public class trial{
	
	static public void main(String[] args)throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter("out.txt");
		int t = Integer.parseInt(br.readLine().trim());
		for(int z=1;z<=t;z++){
			String s = br.readLine().trim();
			boolean flag=false;
			int result=0;
			int index=0;
			while(index<s.length() && s.charAt(index)=='-'){
				flag=true;
				index++;
			}
			if(flag)result++;
			while(index<s.length()){
				if(s.charAt(index)=='+' && index<s.length()-1 && s.charAt(index+1)=='-'){
					result+=2;
					index++;
					while(index<s.length() && s.charAt(index)=='-'){
						index++;
					}
				}
				else
					index++;
			}
			out.println("Case #"+z+": "+result);
		}
		br.close();
		out.close();
	}
}
