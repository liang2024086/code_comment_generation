package methodEmbedding.Counting_Sheep.S.LYD1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class sheep {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new FileReader("sheep.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("sheep.out")));
		int t = Integer.parseInt(buf.readLine());
		for(int i = 0; i < t; i++){
			out.print("Case #"+(i+1)+": ");
			int num = Integer.parseInt(buf.readLine());
			if (num == 0){
				out.println("INSOMNIA");
				continue;
			}
			boolean[] seen = new boolean[10];
			int count = 0;
			while(true){
				count++;
				String s = Integer.toString(count*num);
				for(int j = 0; j < s.length(); j++){
					seen[Integer.parseInt(s.substring(j, j+1))] = true;
				}
				boolean cont = false;
				for(int j = 0; j < 10; j++){
					//System.out.println(seen[j]);
					if (!seen[j]) cont = true;
				}
				
				//System.out.println(seen[3]);
				if (!cont) break;
			}
			out.println(count*num);
		}
		out.close();
	}
}
