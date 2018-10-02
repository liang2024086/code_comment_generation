package methodEmbedding.Counting_Sheep.S.LYD1489;

import java.io.*;

public class sheep{
	public static void main(String[]args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("sheepin.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("sheep.out"));
		int t = Integer.parseInt(in.readLine());
		for(int i = 1; i <= t; i++){
			out.print ("Case #" + i + ": ");
			int n = Integer.parseInt(in.readLine());
			boolean[] seen = new boolean[10];
			if(n == 0){
				out.println("INSOMNIA");
				continue;
			}
			int counter = 1;
			while(true){
				int num = counter * n;
				String s = Integer.toString(num);
				for(int j = 0;j < s.length();j++){
					seen[(s.charAt(j) - '0')] = true;
				}
				boolean all = true;
				for(int j = 0;j<10;j++){
					if(!seen[j]){
						all = false;
					}
				}
				if(all){
					break;
				}
				counter++;
			}
			out.println(counter * n);
		}
		out.close();
	}
}	
