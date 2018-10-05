package methodEmbedding.Magic_Trick.S.LYD247;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class MagicTrick {

public static void main(String args[]) throws FileNotFoundException {
		
		BufferedReader br = new BufferedReader(
				new FileReader("MagicTrick\\A-small-practice.in"));
		try{
			int nTestCases = Integer.valueOf(br.readLine());
			
			for(int i = 1; i<= nTestCases; i++) {
				int prevRow = Integer.valueOf(br.readLine());
				List<String> list1 = null;
				for (int j = 1; j <= 4; j++) {
					if(j==prevRow) {
						String[] nums1 = (br.readLine()).split(" ");						
						list1 = Arrays.asList(nums1);						
					} else 
						br.readLine();
					
				}
				int currRow = Integer.valueOf(br.readLine());
				List<String> list2 = null;
				for (int j = 1; j <= 4; j++) {
					if(j==currRow) {
						String[] nums2 = (br.readLine()).split(" ");						
						list2 = Arrays.asList(nums2);						
					} else 
						br.readLine();
					
				}
				if (list1 != null && list2 != null){
					String ele = null;
					boolean isBadMagician = false;
					
					for(String s:list1){
						if(list2.contains(s)) {
							if (ele == null)
								ele = s;
							else {
								System.out.println("Case #"+i+": Bad magician!");
								isBadMagician = true;
								break;
							}								
						}
					}
					if (ele == null)
						System.out.println("Case #"+i+": Volunteer cheated!");
					else if(!isBadMagician)
						System.out.println("Case #"+i+": "+ele);
				}
			}
			
		} catch(IOException e) {
			System.err.println(e.getMessage());
		}
}
}
