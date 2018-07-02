package methodEmbedding.Revenge_of_the_Pancakes.S.LYD208;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class PanCake {
	public static void main(String args[]){
		if(args.length > 0){
			try {
				long lineIndex = 0;
				long testCases = 0;
				ArrayList<String> inputs = new ArrayList<String>();
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				BufferedWriter bw = null;
				String line = br.readLine();
				long lineVal = 0;
				SheepCount sc = null;
				while(line != null){
					if(lineIndex == 0){
						testCases = Long.parseLong(line);
					}
					else{
						//for(long i = 0 ; i < testCases ; i++){
							inputs.add(line);
							lineIndex++;
						//}
					}
					lineIndex++;
					line = br.readLine();
				}
				br.close();
				
				for(int i = 0 ; i < inputs.size() ; i++){
					DoubleLL dl= new DoubleLL();
					dl.createLLFromString(inputs.get(i));
					inputs.set(i,dl.getStringFromLL());
					//inputs.set(i, )
				}
				
				bw = new BufferedWriter(new FileWriter(args[1]));
				for(int i = 0 ; i < inputs.size() ; i++){
					bw.write("Case #" + (i+1) + ": " +  inputs.get(i));
					bw.newLine();
				}
				bw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
