package methodEmbedding.Cookie_Clicker_Alpha.S.LYD398;

import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class Cookie_Source{
public static void main(String[] args){
	try{
		FileReader fr = new FileReader("B-small-attempt0.in");			//
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw =new FileWriter("Cookie_Output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int T = Integer.parseInt(br.readLine());
		for(int x=0;x<T;x++){
			StringTokenizer st = new StringTokenizer(String.valueOf(br.readLine()));
			double C = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			double X = Double.parseDouble(st.nextToken());
			double oldtime,newtime,rate,convtime;
			rate=2;
			convtime=C/rate;
			oldtime=X/rate;
			rate+=F;
			newtime=convtime+ X/rate;
			while(oldtime>newtime){
				oldtime=newtime;
				convtime+=C/rate;
				rate+=F;
				newtime=convtime+X/rate;			
			}
			String str="Case #"+(x+1)+": ";
			bw.write(str);
			bw.write(String.valueOf(oldtime));
			bw.newLine();			
		}
		bw.flush();
		bw.close();
		}catch(Exception e){e.printStackTrace();}
	}
}	
