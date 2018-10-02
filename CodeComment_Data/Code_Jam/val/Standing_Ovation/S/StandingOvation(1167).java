package methodEmbedding.Standing_Ovation.S.LYD732;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StandingOvation {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int T=Integer.parseInt(in.readLine());
		for(int t=0;t<T;++t){
			String line=in.readLine();
			int end=line.indexOf(' ');
			int n=Integer.parseInt(line.substring(0,end));
			char[] numshy=line.substring(end+1).toCharArray();
			int numstanding=0;
			int friends=0;
			for(int s=0;s<=n;++s){
				int num=numshy[s]-'0';
				if(num!=0&&numstanding<s){
					friends+=s-numstanding;
					numstanding=s;
				}
				numstanding+=num;
			}
			sb.append("Case #");
			sb.append(t+1);
			sb.append(": ");
			sb.append(friends);
			sb.append("\n");
		}
			
		System.out.print(sb);	
	}
}
