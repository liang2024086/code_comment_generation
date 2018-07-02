package methodEmbedding.Counting_Sheep.S.LYD901;

import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class countingSheep{
	public static void main(String args[]) throws IOException{
		int[] fl = {0,0,0,0,0,0,0,0,0,0};
		Scanner in = new Scanner(new FileReader("A-small-attempt4.in"));
		File file = new File ("out.txt");
    PrintWriter out = new PrintWriter ("out.txt");
		int tc = Integer.parseInt(in.nextLine());
		for(int t=0;t<tc;t++){
		int b=0;
		int st = Integer.parseInt(in.nextLine());
		for(int i=1;i<=(Integer.MAX_VALUE/8);i++){
			int nn = st*i;
			String s = nn+"";
			for(int j=0;j<=9;j++){
				if(s.contains(j+"")){
					fl[j] = 1;
				}
			}
			int ans =0;
			for(int k=0;k<=9;k++){
				ans += fl[k];
			}

			if(ans == 10){
				b=1;
				out.println("Case #"+(t+1)+": "+nn);
				break;
			}
		}
		if(b == 0){
			out.println("Case #"+(t+1)+": "+"INSOMNIA");
		}
	} in.close(); out.close();
	}		
}
