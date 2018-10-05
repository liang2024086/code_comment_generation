package methodEmbedding.Magic_Trick.S.LYD1432;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ashwin
 *
 */
public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/ashwin/CodeJam/magictrick/A-small-attempt0.in");
			DataInputStream dataInputStream = new DataInputStream(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/ashwin/CodeJam/magictrick/magictrick.txt",true), "UTF-8"));
			String firstval = bufferedReader.readLine();
			int noOfTstCase = (Integer) (firstval == null ? 0 : Integer.parseInt(firstval));
			Integer[] rowNum = new Integer[2];
			List<Integer> arrangement1 = new ArrayList<Integer>();
			List<Integer> arrangement2 = new ArrayList<Integer>();
			
			List<Integer> tempList1 = new ArrayList<Integer>();
			List<Integer> tempList2 = new ArrayList<Integer>();
			List<Integer> result = new ArrayList<Integer>();
			if (noOfTstCase != 0){
				for (int i = 0; i < noOfTstCase; i++){
					for(int j = 0; j < 2; j++){
						rowNum[j] = Integer.parseInt(bufferedReader.readLine());
						for(int k = 0; k < 4; k++){
							String tempStr = bufferedReader.readLine();
							String[] tempStrArr = tempStr.split("\\s+");
							for(int l = 0; l < tempStrArr.length; l++){
								if(j==0){
									arrangement1.add(Integer.parseInt(tempStrArr[l]));
								}
								else{
									arrangement2.add(Integer.parseInt(tempStrArr[l]));
								}
							}
						}
					}
					for(int j = 0; j < 2; j++){
						if(j==0){
							tempList1 = arrangement1.subList( (rowNum[j]-1) * 4, (rowNum[j] * 4));
						}
						else{
							tempList2 = arrangement2.subList( (rowNum[j]-1) * 4, (rowNum[j] * 4));
						}
					}
					for(Integer el : tempList1){
						if(tempList2.contains(el)){
							result.add(el);
						}
					}
					String out;
					
					switch(result.size()){
					case 0: out="Case #"+ (i+1)+": " + "Volunteer cheated!"; break;
					case 1: out="Case #"+ (i+1) +": " + result.get(0); break;
					default: out="Case #"+ (i+1) +": " + "Bad magician!";
					}
					System.out.println(out);
					writer.append(out+"\n");
					result.clear();
					arrangement1.clear();
					arrangement2.clear();
				}
				writer.close();
				bufferedReader.close();
			}
			else{
				System.out.println("the file is empty ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
