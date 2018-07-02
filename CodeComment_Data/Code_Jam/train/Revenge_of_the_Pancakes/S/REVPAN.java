package methodEmbedding.Revenge_of_the_Pancakes.S.LYD965;

import java.io.*;

class REVPAN {
	static BufferedWriter writer;  
    static BufferedReader reader;
	public static void main(String args[]) throws IOException{
		File inFile = new File("D:\\B-small-attempt0.in");
        File outFile = new File("D:\\output.txt");
        FileWriter fwriter = new FileWriter(outFile);  
        writer = new BufferedWriter(fwriter);  
        FileReader freader = new FileReader(inFile);  
        reader = new BufferedReader(freader); 
		
		int T = Integer.parseInt(reader.readLine());
		for(int i=0;i<T;++i){
			char str[] = reader.readLine().toCharArray();
			char curr_sign;
			long count=0;
			
			curr_sign = str[0];
			for(int k=0;k<str.length;k++){
				if(str[k]!=curr_sign){
					count++;
					curr_sign = str[k];
				}
			}
			
			if(curr_sign=='-'){
				count++;
			}
			writer.write("Case #" + (i+1) + ": " + Long.toString(count));  
	        writer.newLine();
		}
		writer.close();
	}
}
