package methodEmbedding.Magic_Trick.S.LYD1154;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class A {

	public static void main(String[] args) {

		
		File input = new File("A-small.in");
		File output = new File("A-small.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(input));
			BufferedWriter bw = new BufferedWriter(new FileWriter(output));
			int cases = Integer.parseInt(br.readLine());
			for(int i =1; i<=cases; i++){
				int[][] v1 = new int[4][4];
				int[][] v2 = new int[4][4];
				ArrayList<Integer> v1List = new ArrayList<Integer>();
				ArrayList<Integer> v2List = new ArrayList<Integer>();
				String V1Row = br.readLine();
				int selectedRowV1 = Integer.parseInt(V1Row);
				for(int r = 0 ; r< 4;r++){
					String rowData = br.readLine();
					String[] rowDataArr = rowData.split("\\s");
					for(int c =0; c<4;c++){
						v1[r][c] = Integer.parseInt(rowDataArr[c]);
						if(selectedRowV1-1 == r){
							v1List.add(v1[r][c]);
						}
					}
				}
				
				String V2Row = br.readLine();
				int selectedRowV2 = Integer.parseInt(V2Row);
				for(int r = 0 ; r< 4;r++){
					String rowData = br.readLine();
					String[] rowDataArr = rowData.split("\\s");
					for(int c =0; c<4;c++){
						v2[r][c] = Integer.parseInt(rowDataArr[c]);
						if(selectedRowV2-1 == r){
							v2List.add(v2[r][c]);
						}
					}
				}
				
				int matchFound = 0;
				int matchedNumber = -1;
				Iterator<Integer> v1it = v1List.iterator();
				while(v1it.hasNext()){
					int number = v1it.next();
					Iterator<Integer> v2it = v2List.iterator();
					while(v2it.hasNext()){
						int number2 = v2it.next();
						if(number == number2){
							matchFound++;
							matchedNumber= number;
						}
					}
				}
				String outputStr = "";
				if(matchFound  == 1){
					outputStr = String.valueOf(matchedNumber);
				}else if(matchFound > 1){
					outputStr = "Bad magician!";
				}else{
					outputStr = "Volunteer cheated!";
					
				}
				bw.write("Case #"+i+": "+outputStr+"\n");
			}
			bw.flush();
			bw.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}

}
