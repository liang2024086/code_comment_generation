package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1113;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class codejam3 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStream is = new FileInputStream("C:/Users/hiraditya/Desktop/inp.txt"); 
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		PrintWriter pt = new PrintWriter("C:/Users/hiraditya/Desktop/out.txt");
		int t = Integer.parseInt(br.readLine());
		
		int test = 0;
		while(t!=0){
			t--;
			test++;
			String s[] = new String[3];
			s = br.readLine().split(" ");
			double c = Double.parseDouble(s[0]);
			double f = Double.parseDouble(s[1]);
			double x = Double.parseDouble(s[2]);
			double m = 0.0;
			double p_rate = 2.0;//rate of prod initially
			double t_prev = 0.0;
			double t_next = 0.0;
			t_prev = x/p_rate;
			double last_time = 0.0;
			for(;;){
				
				t_next = last_time + (c/p_rate) + (x/(p_rate+f));
				if(t_prev < t_next){
					
//					pt.println("Case #"+test+": "+t_prev);
					pt.println("Case #"+test+": "+String.format("%.7f", t_prev));
					break;
				}
				else{
					last_time += (c/p_rate);  
					t_prev = t_next;
					p_rate = p_rate+f;
				}
			}
		}
		
		pt.close();
	}

}
