package methodEmbedding.Magic_Trick.S.LYD365;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class CodeJam {

	/**
	 * @param args
	 */
	
	static File in=new File("C:/Users/SHANTANU/Documents/codejam/inp1.in");
	static File out=new File("C:/Users/SHANTANU/Documents/codejam/output.txt");
	
	static ArrayList<Integer> row1 = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter(out));
		Scanner sc=new Scanner(in);
		
		int count=sc.nextInt();
		int line = 0;
		
		for(int i=1; i<=count; i++){
			row1.clear();
			int hits = 0, result = 0;
			
			line = sc.nextInt();
			for(int x = 0; x < (line-1)*4; x++)
				sc.nextInt();
			
			for(int x = 0; x<4; x++)
				row1.add(sc.nextInt());
			
			for(int x = 0; x < (4-line)*4; x++)
				sc.nextInt();
			
			line = sc.nextInt();
			for(int x = 0; x < (line-1)*4; x++)
				sc.nextInt();
			
			for(int x = 0; x<4; x++){
				int num = sc.nextInt();
				if(row1.contains(num)){
					hits++;
					result = num;
				}
			}
			for(int x = 0; x < (4-line)*4; x++)
				sc.nextInt();
			
			if(hits == 0)
				bw.write("Case #"+i+": Volunteer cheated!");
			else if(hits == 1)
				bw.write("Case #"+i+": " + result);
			else
				bw.write("Case #"+i+": Bad magician!");
			
			
			if(i!=count)
				bw.newLine();
		}
		bw.close();
		sc.close();
	}

}
