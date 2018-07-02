package methodEmbedding.Revenge_of_the_Pancakes.S.LYD659;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("small.in"));
		FileWriter fw = new FileWriter("small.out");
		
		// T is the number of test cases
		int T = new Integer(in.readLine());
		for(int i=0;i<T;i++){
			String input = new String(in.readLine());
			if(!input.contains("+")){
				//System.out.println("Case #"+(i+1)+": "+"1"+"\n");
				fw.write("Case #"+(i+1)+": "+"1"+"\n");
			}else if(!input.contains("-")){ // all happy are up
				///System.out.println("Case #"+(i+1)+": "+"0"+"\n");
				fw.write("Case #"+(i+1)+": "+"0"+"\n");
			}else{
				char[] inputArray = input.toCharArray();
				char head = inputArray[0];
				int count = 0;
				for(int j=0;j<inputArray.length;j++){
					if(head!=inputArray[j]){
						count++;
						head = inputArray[j];
					}
				}
				if(head=='-'){
					count++;
				}
				fw.write("Case #"+(i+1)+": "+count+"\n");
				//System.out.println("Case #"+(i+1)+": "+count+"\n");
			}
		}
		in.close();
		fw.flush();
		fw.close();
		
	}
}
