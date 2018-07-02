package methodEmbedding.Magic_Trick.S.LYD1215;

import java.util.*;
import java.io.*;
import java.text.*;

public class Magic {
	public static void main(String[] args) throws IOException{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(inp.readLine());
		for(int i = 1 ; i <= test ; i++){
			int row1 = Integer.parseInt(inp.readLine()) -1;
			Set<Integer> set1 = new HashSet<Integer>();
			Set<Integer> set2 = new HashSet<Integer>();
			for(int j = 0 ; j<4;j++){
				if(j==row1){
					String[] data = inp.readLine().split(" ");
					for(int k = 0 ; k < data.length ;k++) set1.add(Integer.parseInt(data[k]));
				}
				else inp.readLine();
			}
			int row2 = Integer.parseInt(inp.readLine())-1;
			for(int j = 0 ; j<4;j++){
				if(j==row2){
					String[] data = inp.readLine().split(" ");
					for(int k = 0 ; k < data.length ;k++) set2.add(Integer.parseInt(data[k]));
				}
				else inp.readLine();
			}

			set1.retainAll(set2);
			switch(set1.size()) {
				case 0 : System.out.println("Case #" + i + ": Volunteer cheated!"); break;
				case 1 : Iterator<Integer> it = set1.iterator(); System.out.println("Case #" + i + ": " + it.next()) ; break;
				default : System.out.println("Case #" + i + ": Bad magician!"); break;
			}
		}
	}
}
