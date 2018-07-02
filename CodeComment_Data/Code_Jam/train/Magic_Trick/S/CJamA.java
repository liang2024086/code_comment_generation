package methodEmbedding.Magic_Trick.S.LYD442;


import java.io.*;
import java.util.*;

public class CJamA {

    public static void main(String[] args) throws IOException {	 
    	File file = new File("src/input.txt");//change
    	PrintWriter pw = new PrintWriter("src/output.txt");//change
      
    	FileReader fr = new FileReader(file);
    	BufferedReader r = new BufferedReader(fr);
    	
    	int T = Integer.parseInt(r.readLine());  
    	
    	for (int i = 0; i < T; i++){
    		int N = Integer.parseInt(r.readLine());
    		for (int j = 1; j < N; j++){
    			r.readLine();
    		}
    		String line1 = r.readLine();
    		for (int j = 4; j > N; j--){
    			r.readLine();
    		}
    		String[] str1 = line1.split(" ");
    		int[] nums1 = new int[4];
    		N = Integer.parseInt(r.readLine());
    		for (int j = 1; j < N; j++){
    			r.readLine();
    		}
    		String line2 = r.readLine();
    		for (int j = 4; j > N; j--){
    			r.readLine();
    		}
    		String[] str2 = line2.split(" ");
    		int[] nums2 = new int[4];
    		for (int j = 0; j < 4; j++){
    			nums1[j] = Integer.parseInt(str1[j]);
    			nums2[j] = Integer.parseInt(str2[j]);
    		}
    		ArrayList<Integer> result = new ArrayList<Integer>();
    		for (int j = 0; j < 4; j++){
    			for (int k = 0; k < 4; k++){
    				if (nums1[j] == nums2[k])
    					result.add(nums1[j]);
    			}
    		}
    		if (result.size() == 0){
    			pw.println("Case #"+(i+1)+": Volunteer cheated!");
    			pw.flush();
    		} else if (result.size() == 1){
    			pw.println("Case #"+(i+1)+": "+result.get(0));
    			pw.flush();
    		} else if (result.size() > 1){
    			pw.println("Case #"+(i+1)+": Bad magician!");
    			pw.flush();
    		}
    	}
    	pw.close();
    	r.close();
    }
}
