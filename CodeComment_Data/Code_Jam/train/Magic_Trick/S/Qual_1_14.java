package methodEmbedding.Magic_Trick.S.LYD1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Qual_1_14 {
	
	
	public static void main(String[] args) throws IOException{
		
		// the reading routine
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int iteration = Integer.parseInt(bf.readLine());
		
		for(int z = 0; z < iteration; z++ ){
			int rowNum = Integer.parseInt(bf.readLine().trim()) - 1;
			HashSet<Integer> before = new HashSet<Integer>();
			for(int i = 0; i < 4; i++){
				if(i == rowNum){
					String[] arr = bf.readLine().trim().split(" ");
					for(String s:arr){
						before.add(Integer.parseInt(s));
					}
				}
				else bf.readLine();
					
			}
			
			// now after the permutation
			int dupCnt = 0;
			int dupNum = Integer.MIN_VALUE;
			
			rowNum = Integer.parseInt(bf.readLine().trim()) - 1;
			for(int i = 0; i < 4; i++){
				if(i == rowNum){
					String[] arr = bf.readLine().trim().split(" ");
					for(String s: arr){
						// try to find duplicates
						int cur = Integer.parseInt(s);
						if(before.contains(cur)){
							dupCnt++;
							dupNum = cur;
						}
					}
				}
				else bf.readLine();
			}
			
			
			// prepare for output
			if(dupCnt == 0)
				System.out.println("Case #" + new Integer(z+1).toString() + ": Volunteer cheated!");
			else if(dupCnt == 1)
				System.out.println("Case #" + new Integer(z+1).toString() + ": " + new Integer(dupNum).toString());
			else
				System.out.println("Case #" + new Integer(z+1).toString() + ": " + "Bad magician!");
		}
	}
}
