package methodEmbedding.Magic_Trick.S.LYD967;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;

public class GCJ2014QA {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("A-small-attempt0.in")));
//	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    int caseCount = Integer.parseInt(in.readLine());
	    for (int i = 0 ; i < caseCount ;i ++){
	    	HashSet<String> set1 = new HashSet<String>();
	    	HashSet<String> set2 = new HashSet<String>();
	    	HashSet<String> set3 = new HashSet<String>();
	    	int	row1 = Integer.parseInt(in.readLine());
	    	
	    	for (int j = 0 ; j < 4 ; j++){
	    		String[] nums = in.readLine().split("\\s");
	    		if (row1 == j + 1)
	    			Collections.addAll(set1, nums);
	    	}
	    	int	row2 = Integer.parseInt(in.readLine());
	    	
	    	for (int j = 0 ; j < 4 ; j++){
	    		String[] nums = in.readLine().split("\\s");
	    		if (row2 == j + 1)
	    			Collections.addAll(set2, nums);
	    	}
	    	for (String n : set1){
	    		if (set2.contains(n)) set3.add(n);
	    	}
	    	if (set3.size() == 1){
	    		System.out.println("Case #"+(i+1)+": "+set3.iterator().next());
	    	}else if (set3.size() == 0){
	    		System.out.println("Case #"+(i+1)+": Volunteer cheated!");
	    	}else{
	    		System.out.println("Case #"+(i+1)+": Bad magician!");
	    	}
	    		
	    }
	  
	  

	}

}
