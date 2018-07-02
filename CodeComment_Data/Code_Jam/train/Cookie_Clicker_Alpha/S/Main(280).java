package methodEmbedding.Cookie_Clicker_Alpha.S.LYD543;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Scanner in = new Scanner(System.in);
		
		File file = new File("B-small-attempt1.in");
		FileWriter out=new FileWriter("B-small-attempt1.out");
		Scanner in = new Scanner(file);
		
		int T=in.nextInt();
		for(int ca=1;ca<=T;++ca){
			double c=in.nextDouble();
			double f=in.nextDouble();
			double x=in.nextDouble();
			
			double per=2.0;
			double ans=x/per;
			double tmp=0.0;
			int k=1;
			while(true){
				++k;
				tmp+=c/per;
				per+=f;
				//System.out.println(per+" "+tmp);
				ans=Math.min(ans, x/per+tmp);
				if(k>1000000){
					break;
				}
			}
			String s="Case #"+ca+": "+ans+"\n";
			//System.out.println(s);
			out.write(s);
			out.flush();
			//System.out.println("Case #"+ca+": "+ans);
			
		}
	}

}
