package methodEmbedding.Magic_Trick.S.LYD1942;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thirteen.FileUtility;

public class Magic {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Map<Integer, List<String>> testArray1=new HashMap<Integer, List<String>>();
		Map<Integer, List<String>> testArray2=new HashMap<Integer, List<String>>();
		MFileUtility.readFile(testArray1, testArray2);
		int numberOfTests = testArray1.size();
		System.out.println(testArray1);
		System.out.println(testArray2);
		String[] array1, array2;
		int matches =0;
		String matched = "";
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < numberOfTests-1; i++) {
			array1 = new String[4];
			array2 = new String[4];
			testArray1.get(i).toArray(array1);
			testArray2.get(i).toArray(array2);
			matches = 0;
			for(int j=0; j<4; j++) {
				for(int k=0; k<4; k++) {
					if(array1[j].equals(array2[k])) {
						matches++;
						matched = array1[j];
					}
				}
			}
			if(matches ==0) {
				sb = sb.append("Case #"+(i+1)+": "+"Volunteer cheated!\n");
			} else if (matches > 1) {
				sb = sb.append("Case #"+(i+1)+": "+"Bad magician!\n");
			}  else if (matches ==1) {
				sb = sb.append("Case #"+(i+1)+": "+matched+"\n");
			}
		}
		System.out.println(sb);
		MFileUtility.writeFile(sb);
		
	}

}
