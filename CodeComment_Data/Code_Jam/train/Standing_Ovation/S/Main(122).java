package methodEmbedding.Standing_Ovation.S.LYD644;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("in.in");
		File out = new File("out.out");
		BufferedReader reader = new BufferedReader(in);
		PrintWriter writer = new PrintWriter(out);
		
		int n = Integer.parseInt(reader.readLine());
		
		for(int i=1; i<=n; i++){
			int count = 0;
			int people = 0;
			
			String[] data = reader.readLine().split("\\s");
			int s = Integer.parseInt(data[0]); 
			
			for(int j=0; j<s+1; j++){
				if(people >= j)
					people += Integer.parseInt(data[1].substring(j, j+1));
				else{
					count++;
					people++;
					j--;
				}
			}
			
			writer.print("Case #");
			writer.print(i);
			writer.print(": ");
			writer.println(count);
		}
		
		reader.close();
		writer.close();
	}

}
