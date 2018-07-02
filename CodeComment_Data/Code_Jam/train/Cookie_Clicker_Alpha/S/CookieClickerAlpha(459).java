package methodEmbedding.Cookie_Clicker_Alpha.S.LYD4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;


public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader(new File("in")));
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("out")));
		StringTokenizer st;
				
		int T=Integer.parseInt(br.readLine());
		for(int cn=1;cn<=T;cn++){
			st=new StringTokenizer(br.readLine());
			double C=Double.parseDouble(st.nextToken());//price per farm
			double F=Double.parseDouble(st.nextToken());//farm production
			double X=Double.parseDouble(st.nextToken());//target
			
			double ans=X/2;
			double prod=2, time=0;
			while(true){
				double next=time+C/prod;
//				System.out.println((next+X/(prod+F))+" vs "+(time+X/prod));
				if(next+X/(prod+F)<time+X/prod){
					time=next;
					prod+=F;
					ans=time+X/(prod);
				}
				else
					break;
			}
			
			bw.append("Case #"+cn+": "+ans+"\n");
			System.out.println(cn+" "+ans);
		}
		bw.flush();

	}
}
