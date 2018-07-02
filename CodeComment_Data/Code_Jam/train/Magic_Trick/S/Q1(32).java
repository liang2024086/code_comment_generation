package methodEmbedding.Magic_Trick.S.LYD2213;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class Q1 {
	
	public static final String INPUT = "A.in";
	public static final String OUTPUT = "output.txt";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(INPUT)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(OUTPUT)));
		int caseNum = Integer.parseInt(br.readLine());
		String line = "";
		for (int i = 0; i <caseNum; i++){
			int rowNum = Integer.parseInt(br.readLine());
			HashSet<Integer> set = new HashSet<Integer>();
			int leftNum = 4 - rowNum;
			while (rowNum!=1){
				rowNum--;
				br.readLine();
			}
			line = br.readLine();
			String[] Nums = line.split(" ");
			for (String num : Nums){
				set.add(Integer.parseInt(num));
			}
			while (leftNum != 0){
				br.readLine();
				leftNum --;
			}
			rowNum = Integer.parseInt(br.readLine());
			leftNum = 4 - rowNum;
			String result = "";
			boolean isFound = false;
			
			while (rowNum!=1){
				rowNum--;
				br.readLine();
			}
			line = br.readLine();
			Nums = line.split(" ");
			for (String num : Nums){
				if (set.contains(Integer.parseInt(num))){
					if (isFound){
						result = "Bad magician!";
						break;
					} else {
						result = num;
						isFound = true;
					}
				}
			}
			while (leftNum != 0){
				br.readLine();
				leftNum --;
			}
			if (result.equals("")) result = "Volunteer cheated!";
			bw.write("Case #"+ (i+1) + ": " + result + "\n");
			System.out.println("Case #"+ (i+1) + ": " + result + "\n");
		}
		bw.close();
		br.close();
		
	}
}
