package methodEmbedding.Cookie_Clicker_Alpha.S.LYD769;

import java.io.*;
import java.util.StringTokenizer;

public class clicker{
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T;
		double c,x,f,time,ctime,start_time,slope;
		String s;
		StringTokenizer st;
		
		s=br.readLine();
		T=Integer.parseInt(s);
		for(int I=1;I<=T;I++){
			start_time=0;
			slope=2;
		
			s=br.readLine();
			st=new StringTokenizer(s," ");
			c=Double.parseDouble(st.nextToken());
			f=Double.parseDouble(st.nextToken());
			x=Double.parseDouble(st.nextToken());
			while(true){
				time=start_time+x/slope;
				ctime=start_time+(c/slope)+(x/(slope+f));
				if(ctime>=time){
					break;
				}else{
					start_time+=(c/slope);
					slope+=f;
				}
			}
			System.out.println("Case #"+I+": "+time);
		}
	}
}
