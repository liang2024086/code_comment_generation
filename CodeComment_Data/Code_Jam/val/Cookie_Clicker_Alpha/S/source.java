package methodEmbedding.Cookie_Clicker_Alpha.S.LYD715;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieClicker {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine()), tester=1;
		while(tester<=test) {
			String s=br.readLine();
			double c=Double.valueOf(s.split(" ")[0]),f=Double.valueOf(s.split(" ")[1]),x=Double.valueOf(s.split(" ")[2]);

			double time=0,rate=2, farms;
			boolean flag=true;
			while(flag) {
				//Check time taken to buy cookie and then reach goal
				double more1=c/rate+x/(rate+f);
				
				//Check time taken to reach goal without buying cookie
				double more2=x/rate;
				
				if(more1<more2) {
					time+=c/rate;
					rate+=f;
				} else {
					flag=false;
					time+=more2;
				}
			}
			System.out.println(time);
			tester++;
		}
	}
}
