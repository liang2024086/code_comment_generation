package methodEmbedding.Standing_Ovation.S.LYD2087;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		
		Scanner in = null;
		PrintWriter pw = null;
		
		try {
			in = new Scanner(new File("D:\\in.txt"));
			pw = new PrintWriter(new File("D:\\out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int T = in.nextInt();
		for(int t=1; t<=T; t++) {
			
			
			int n = in.nextInt();
			
			int cnt = 0;
			int ext = 0;
			String line = in.nextLine().trim();
			
			
			for(int i=0; i<=n; i++)
			{
					
				int v =  Integer.parseInt(line.charAt(i)+"");
				
				if(v != 0)
				{
					if(cnt < i)
					{
						int req = (i-cnt);
						cnt = cnt + req;
						ext+=req;
					}
					
					cnt = cnt + v; 
					
					
				}
			}
			
			pw.println("Case #"+t+": "+ext);
			
			System.out.println("Case #"+t+": "+ext);
			
		}
		
		pw.flush();
		pw.close();
	}
}
