package methodEmbedding.Magic_Trick.S.LYD536;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class Magician {
	public static void main(String[] args) throws IOException{
		BufferedReader buf =  new BufferedReader(new FileReader("Magic.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("MagicOut.txt"));
		int t = Integer.parseInt(buf.readLine());
		for(int i = 0; i < t; i++){
			boolean[] works = new boolean[16];
			int r = Integer.parseInt(buf.readLine()) - 1;
			for(int j = 0; j < 4; j++){
				String[] s = buf.readLine().split(" ");
				if (j != r){
					for(int k = 0; k < 4; k++){
						works[Integer.parseInt(s[k]) - 1] = true;
					}
				}
			}
			//System.out.println(r + " " + Arrays.toString(works));
			r = Integer.parseInt(buf.readLine()) - 1;
			for(int j = 0; j < 4; j++){
				String[] s = buf.readLine().split(" ");
				if (j != r){
					for(int k = 0; k < 4; k++){
						//System.out.println(i + " " + j + " " + k);
						works[Integer.parseInt(s[k]) - 1] = true;
					}
				}
			}
			int count = 0;
			int val = -1;
			for(int j = 0; j < 16; j++){
				if(!works[j]){
					count++;
					val = j;
				}
			}
			//System.out.println(Arrays.toString(works));
			if(count == 0){
				out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			} else if (count > 1){
				out.println("Case #" + (i + 1) + ": Bad magician!");
			} else {
				out.println("Case #" + (i + 1) + ": " + (val + 1));
			}
		}
		out.close();
	}
}
