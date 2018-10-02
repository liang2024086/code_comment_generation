package methodEmbedding.Counting_Sheep.S.LYD422;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class CountingSheep {

	public static void main(String args[]){
		try{
				String inputFilePath = new File("input//A-small-attempt0.in").getAbsolutePath();
				String outputFilePath = new File("output//A-small-practice.out").getAbsolutePath();
				BufferedReader reader = new BufferedReader(new FileReader(new File(inputFilePath)));
				BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFilePath)));
				String line = reader.readLine();
				Integer testCases = Integer.parseInt(line);
				LinkedHashMap<Integer,String> OutputMap = new LinkedHashMap<Integer,String>();
				ArrayList<String> CheckList = new ArrayList<String>();
				for(int k = 0;k<=9;k++){
					CheckList.add(String.valueOf(k));
				}
				for (int i = 1; i <= testCases; i++){
					line = reader.readLine();
					Set<String> TempSet = new HashSet<String>();
					Integer NInt = 0;
					Integer N = 0;
					if(line!=null){
						NInt = Integer.parseInt(line);
						N = Integer.parseInt(line);
					}
					if(NInt==0){
						OutputMap.put(i,"INSOMNIA");
						continue;
					}
					for(int j = 2; ; j++){
						String NString = String.valueOf(NInt);
						String[] digits = NString.split("(?<=.)");
						for(String digit:digits){
							TempSet.add(digit);
						}
						if(TempSet.containsAll(CheckList)){
							OutputMap.put(i,String.valueOf(NInt));
							break;
						}
						NInt = N * j;
					}
				}
				for(int cases : OutputMap.keySet()){
					writer.write("Case #" + cases + ": " + OutputMap.get(cases) + "\r\n");
				}
				reader.close();
				writer.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
}
