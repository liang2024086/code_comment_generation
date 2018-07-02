package methodEmbedding.Magic_Trick.S.LYD2182;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CodeJam1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		 
			br = new BufferedReader(new FileReader("/home/bhargav/Downloads/A-small-attempt1.in"));
			Integer testCases = Integer.parseInt(br.readLine());
			int [] tester = new int[testCases];
			int [] matcher = new int[testCases];
			
			for(int test=0; test < testCases; test++){
				int [] first = new int[17];
				Integer firstRow = Integer.parseInt(br.readLine());
				for(int i=1; i< 5; i++){
					if(i==firstRow){
						StringTokenizer st = new StringTokenizer(br.readLine()," ");
						while(st.hasMoreElements()){
							int cur = Integer.parseInt(st.nextElement().toString());
							System.out.print(cur+" ");
							first[cur] = 1;
						}
					} else 
						br.readLine();
				}
				System.out.println("\n");
				Integer secondRow = Integer.parseInt(br.readLine());
				int match=0;
				int count=0;
				for(int i=1; i< 5; i++){
					if(i==secondRow){
						StringTokenizer st = new StringTokenizer(br.readLine()," ");
						while(st.hasMoreElements()){
							match = Integer.parseInt(st.nextElement().toString());
							System.out.print(match+" ");
							if(first[match]!=0){
								count++;
								matcher[test] = match;
								System.out.print("match" + match + " * ");
							}
						}
					} else 
						br.readLine();
				}
				System.out.println("\n");
				tester[test] = count;
		}
		br.close();
		
		File file = new File("/home/bhargav/Downloads/codejam1.out");
		BufferedWriter bo = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
		int i=1;
		for(int test: tester){
			if(test<=0){
				bo.write("Case #"+(i++)+": Volunteer cheated!");
				bo.write("\n");
			}else if(test==1){
				bo.write("Case #"+(i)+": "+ matcher[i-1]);
				i++;
				bo.write("\n");
			}else if(test > 1){
				bo.write("Case #"+(i++)+": Bad magician!");
				bo.write("\n");
			}
			
		}
		bo.close();
			
	}

}
