package methodEmbedding.Cookie_Clicker_Alpha.S.LYD133;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class War {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("input.txt"));

			int T = Integer.valueOf(br.readLine());
			
			for(int t=0;t<T;t++){
				
				String A[]= br.readLine().split(" ");
				
				double C = Double.valueOf(A[0]);
				double F = Double.valueOf(A[1]);
				double X = Double.valueOf(A[2]);
				
				double rate = 2;
				double cookie = X;
				double total=0;
				

					while(cookie>0){
						if(cookie<C){
							total=total+cookie/rate;
							break;
						}
						total = total+(double)C/rate;
						double time1 = (double)(cookie-C)/rate;
						double time2 = (double)cookie/(rate+F);
						
						if(time2<time1){
							rate = rate+F;
						}
						else{
							cookie=cookie-C;
						}
					}
				
				System.out.println("Case #"+(t+1)+": "+total);
				
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}
