package methodEmbedding.Revenge_of_the_Pancakes.S.LYD871;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class RevengeOfPancakes {

	public static final String PREFIX = "Case #";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		PrintWriter pout = new PrintWriter(new FileWriter("output.txt"));
		int t = Integer.parseInt(br.readLine());
		int T = 1;
		while(t-->0){
			String resultprefix = PREFIX+(T++)+":"+" ";
			String line = br.readLine();
			int len = line.length();
			int counter = 1;
			String s = "";
			for(int i=1;i<len;i++){
				if(line.charAt(i)!=line.charAt(i-1)){
					s=s+counter;
					counter =1;
				}else{
					counter++;
				}
			}
			s = s+counter;
			int ans = s.length();
			if(line.charAt(len-1)=='+'){
				ans--;
			}
			pout.println(resultprefix+ ans);
		}
		
		pout.close();
	}

}
