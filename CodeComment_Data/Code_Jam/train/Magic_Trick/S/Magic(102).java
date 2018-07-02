package methodEmbedding.Magic_Trick.S.LYD702;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;


public class Magic {

	public static void main(String[] args) {
		
		String inFile = "inFiles/A-small-attempt0.in";
		String outFile = "inFiles/out.out";
		
		try {
			
			
			BufferedReader fin = new BufferedReader(new InputStreamReader(
						new FileInputStream(inFile)));
			
			PrintWriter fout = new PrintWriter(outFile);
			String line;
			int N = Integer.parseInt(fin.readLine());
			int r1, r2;
			int i,j,k, sz;
			String[] splt;
			HashSet<String> hashSet1 = new HashSet<String>();
			HashSet<String> hashSet2 = new HashSet<String>();
			for (int test = 1; test <= N; test++) {
				
				
				r1 = Integer.parseInt(fin.readLine())-1;
				for(i = 0; i < r1; i++ )fin.readLine();
				
				splt = fin.readLine().split(" ");
				hashSet1.clear();
				hashSet1.addAll(Arrays.asList(splt));
				
				for(i++; i < 4; i++)fin.readLine();
				
				
				
				r2 = Integer.parseInt(fin.readLine())-1;
				for(i = 0; i < r2; i++ )fin.readLine();
				
				splt = fin.readLine().split(" ");
				hashSet2.clear();
				hashSet2.addAll(Arrays.asList(splt));
				
				for(i++; i < 4; i++)fin.readLine();
				
				hashSet1.retainAll(hashSet2);
				
				sz = hashSet1.size();
				
				if(sz == 1){
					fout.println("Case #"+test+": "+hashSet1.iterator().next());
				}else if(sz == 0){
					fout.println("Case #"+test+": Volunteer cheated!");
				}else{
					fout.println("Case #"+test+": Bad magician!");
				}

			}
			
			
			fin.close();
			fout.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
