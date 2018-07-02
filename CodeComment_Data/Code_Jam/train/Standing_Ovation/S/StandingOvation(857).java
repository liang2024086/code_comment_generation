package methodEmbedding.Standing_Ovation.S.LYD2036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine());
		for(int cn=1;cn<=T;cn++){
			st=new StringTokenizer(br.readLine());
			int Sl=Integer.parseInt(st.nextToken());
			int S[]=new int[Sl+1];
			String SS=st.nextToken();
			for(int i=0;i<=Sl;i++){
				S[i]=Integer.parseInt(SS.charAt(i)+"");
			}
			int ans=0;
			int cur=0;
			for(int i=0;i<=Sl;i++){
				if(cur<i){
					cur++;
					ans++;
				}
				cur+=S[i];
			}
			bw.append("Case #"+cn+": "+ans+"\n");
		}
		bw.flush();
	}

}
