package methodEmbedding.Revenge_of_the_Pancakes.S.LYD518;

import java.io.*;

public class revenge {	
	public static void main(String[] args)throws FileNotFoundException{
	int T, N;
	String bw_line;
	String line;
	
	try{
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		File file = new File("output.txt");
		 
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		T = Integer.parseInt(br.readLine());
		
		for(int j = 1; j <= T; j++){
			int count = 0;
			line = br.readLine();

			for(int i=0; i<line.length(); i++){
				if(i+1 < line.length()){
					if (line.charAt(i) != line.charAt(i+1)){
						count++;
					}
				}

				if(i + 1 == line.length()){
					if (line.charAt(i) == '-')
						count++;
				}
			}

			bw_line = "Case #" + j + ": " + count;					
			bw.write(bw_line);
			bw.newLine();			
		}
		br.close();
		bw.close();
	}catch(Exception ex){}
	finally {		
	}		
}
}
