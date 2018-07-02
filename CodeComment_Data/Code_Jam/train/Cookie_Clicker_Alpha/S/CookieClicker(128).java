package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1494;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CookieClicker {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int t = Integer.parseInt(br.readLine());
			int cases = 0;
			while(t>0){
				String str[] = br.readLine().split(" ");
				double C = Double.parseDouble(str[0]);
				double F = Double.parseDouble(str[1]);
				double X = Double.parseDouble(str[2]);
				double farms = 0;
				double time = 0;
				while((X/(2+(farms*F)))>((C/(2+(farms*F)))+(X/(2+((farms+1)*F))))){
					time += C/(2+(farms*F));
					farms++;
				}
				time += X/(2+(farms*F));
				pw.println("Case #"+(cases+1)+": "+time);
				cases++;
				t--;
			}
			pw.flush();
		}
		catch(IOException e){
			e.getMessage();
		}
	}
}
