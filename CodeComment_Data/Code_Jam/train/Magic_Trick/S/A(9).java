package methodEmbedding.Magic_Trick.S.LYD1286;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class A {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("A-small.out"));
		
		String[] s;
		
		int[] firstRow = new int[4];
		int[] secondRow = new int[4];
		
		int T = Integer.parseInt(br.readLine());
		for(int c = 1; c<=T;c++){
			
			int first = Integer.parseInt(br.readLine());
			for(int i = 0; i<4; i++){
				s = br.readLine().trim().split(" ");
				if(i+1==first){
					for(int j = 0; j<4; j++){
						firstRow[j] = Integer.parseInt(s[j]);
					}
				}
			}
			int second = Integer.parseInt(br.readLine());
			for(int i = 0; i<4; i++){
				s = br.readLine().trim().split(" ");
				if(i+1==second){
					for(int j = 0; j<4; j++){
						secondRow[j] = Integer.parseInt(s[j]);
					}
				}
			}
			
			ArrayList<Integer> twice = new ArrayList<Integer>();
			
			for(int i : firstRow){
				for(int j:secondRow)
					if(i==j) twice.add(i);
			}
			
			bw.write("Case #"+c+": ");
			if(twice.size()==1)
				bw.write(twice.get(0)+"\r\n");
			else if(twice.size()>1)
				bw.write("Bad magician!\r\n");
			else
				bw.write("Volunteer cheated!\r\n");
			
		}
		bw.close();
		
	}
}
