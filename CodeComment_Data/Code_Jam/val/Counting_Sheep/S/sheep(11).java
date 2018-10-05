package methodEmbedding.Counting_Sheep.S.LYD972;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class sheep {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("sheep.out"));
		int T = scan.nextInt();
		for(int t = 1; t <=T;t++){
			long N = scan.nextLong();
			
			boolean[] seen = new boolean[10];
			
			int iter = 1;
			int count = 0;
			long z = N;
			while(true){
				String s = Long.toString(z);
				for(char c : s.toCharArray()){
					if(!seen[c-'0'])count++;
					seen[c-'0']=true;
				}
				if(count==10)break;
				if(z>(long)1e18)break;
				if(z==0)break;
				z=N*(++iter);
			}
			out.print("Case #"+t+": ");
			if(count!=10){
				out.println("INSOMNIA");
			}else{
				out.println(z);
			}
		}
		out.close();
		scan.close();
	}
}
