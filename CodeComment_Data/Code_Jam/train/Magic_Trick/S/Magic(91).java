package methodEmbedding.Magic_Trick.S.LYD252;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Magic {
	private static BufferedReader br;

	public static void main(String[] args) throws IOException {
		if(args.length < 1) {
			System.out.println("Error, usage: java ClassName inputfile");
			System.exit(1);
		}

		br = new BufferedReader(new FileReader(args[0]));


		int numTestCase = Integer.parseInt(br.readLine());
		String[] valuesInTheRow = new String[4];
		HashMap<String, Integer> firstSelection = new HashMap<String, Integer>();
		for(int i=0;i<numTestCase;i++){
			int rowSel = Integer.parseInt(br.readLine());
			int count=0;
			int index=-1;
			for(int j=0;j<4;j++){
				 String lr = br.readLine();
				if(j+1 == rowSel){
					valuesInTheRow = lr.split(" ");
				}
			}
		
			for(int j=0;j<valuesInTheRow.length;j++){
				firstSelection.put(valuesInTheRow[j], 1);
			}
			rowSel = Integer.parseInt(br.readLine());
			for(int j=0;j<4;j++){
				String lr = br.readLine();
				if(j+1 == rowSel){
					valuesInTheRow = lr.split(" ");
				}
			}
			for(int j=0;j<valuesInTheRow.length;j++){
				if(firstSelection.containsKey(valuesInTheRow[j])){
					Integer a = firstSelection.get(valuesInTheRow[j]);
					firstSelection.put(valuesInTheRow[j],a+1);
				}else
					firstSelection.put(valuesInTheRow[j], 1);
			}
			for(Entry<String, Integer> entry : firstSelection.entrySet()){
				String key = entry.getKey();
				Integer value = entry.getValue();
				if(value>=2){
					count++;
					index=Integer.parseInt(key);
				}
				
			}
			if(count==1){
				System.out.println("Case #"+(i+1)+": "+index);
			}else if(count==0){
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			} else
				System.out.println("Case #"+(i+1)+": Bad magician!");
			firstSelection.clear();
		}
	}
}
