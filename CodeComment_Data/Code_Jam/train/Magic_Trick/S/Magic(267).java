package methodEmbedding.Magic_Trick.S.LYD1066;

import java.util.*;
import java.io.*;

public class Magic {

	public static void main(String[] args) throws Exception{
		File inFile = new File("A-small-attempt0.in");
		File outFile = new File("A-small.out");
		Scanner in = new Scanner(inFile);
		PrintWriter out = new PrintWriter(outFile);

		int t = in.nextInt();

		for(int k = 1; k <= t; k ++){
			//first round
			ArrayList<Integer> mark = new ArrayList<Integer>();
			int ans = in.nextInt() - 1;
			for(int i = 0; i < 4; i ++){
				for(int j = 0; j < 4; j ++){
					if(i == ans){
						mark.add(in.nextInt());
					}
					else{
						in.nextInt();
					}
				}
			}
			//second round
			ans = in.nextInt() - 1;
			int count = 0;				//target numbers
			int res = 0;
			for(int i = 0; i < 4; i ++){
				for(int j = 0; j < 4; j ++){
					if(i == ans){
						int tmp = in.nextInt();
						if(mark.contains(tmp)){
							count ++;
							res = tmp;
						}
					}
					else{
						in.nextInt();
					}
				}
			}
			//result
			out.print("Case #" + k + ": ");
			if(count > 1){
				out.println("Bad magician!");
			}
			else if(count == 1){
				out.println(res);
			}
			else{
				out.println("Volunteer cheated!");
			}
		}
		in.close();
		out.close();
	}
	
}
