package methodEmbedding.Magic_Trick.S.LYD972;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("A-small-attempt0.in"));
			int iterCount=Integer.parseInt(bufferedReader.readLine()),count=0;
			File file = new File("A-small-attempt0.out");
			 FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
			
				String currString,arrString[],value = null;
				int rowFirstAns,rowSecondAns;
			for(int iTmp=0;iTmp<iterCount;iTmp++){
				rowFirstAns=Integer.parseInt(bufferedReader.readLine());
				Map<String,String> map=new HashMap<String, String>();
				for(int jTmp=1;jTmp<=4;jTmp++){
					
					currString=bufferedReader.readLine();
					
					if(jTmp==rowFirstAns){
						arrString=currString.split(" ");
						for(int kTmp=0;kTmp<4;kTmp++){
						map.put(arrString[kTmp], "");
						}
						
					}
				}				
				
				rowSecondAns=Integer.parseInt(bufferedReader.readLine());
				count=0;
				for(int jTmp=1;jTmp<=4;jTmp++){
					
					currString=bufferedReader.readLine();
					
					if(jTmp==rowSecondAns){
						arrString=currString.split(" ");
						
						for(int kTmp=0;kTmp<4;kTmp++){
							if(map.containsKey(arrString[kTmp])){
								count++;
								value=arrString[kTmp];
							}
						}
					}
				}
				
				if(count==0){
					value="Volunteer cheated!";
				}else if(count>1){
					value="Bad magician!";
				}
								
				bw.write("Case #"+(iTmp+1)+": "+value+"\n");
				
			}
			bw.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
