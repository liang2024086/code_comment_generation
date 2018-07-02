package methodEmbedding.Counting_Sheep.S.LYD1485;


import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args){
		InputUtils.readInput();
		List<String> solutionList = new ArrayList<String>();
		DecimalFormat df = new DecimalFormat("###.#");
		int T = InputUtils.inputs.length;

		System.out.println("COMPUTING...");
		for (int nCase = 1; nCase <= T; nCase ++) {
		      double N0 = InputUtils.inputs[nCase-1];
		      double N = N0;
		      List<Integer> seenDigits = new ArrayList<Integer>();
		      boolean insomnia = false;

		      // CODE STARTS HERE //
		      for(int i = 0; i < 99999; i++){
		    	  //System.out.println(S);
		    	  double tempN = N;
		    	  while (tempN > 0){
		              int digit = (int) (tempN % 10);
		              tempN = Math.floor(tempN / 10);
		              if(!seenDigits.contains(digit)) seenDigits.add(digit);
		          }
		    	  if(seenDigits.size() == 10) break;
		    	  if(i == 99998){
		    		  //System.out.println("Case #"+nCase+": INSOMNIA");
				      solutionList.add("Case #"+nCase+": INSOMNIA");
				      insomnia = true;
		    	  }
		    	  N = N + N0;
		      }
		      
		      if(!insomnia){
		      System.out.println("Case #"+nCase+": "+df.format(N));
		      solutionList.add("Case #"+nCase+": "+df.format(N));}
		      // CODE ENDS HERE //
		}
		
		System.out.println("DONE!");
		
		FileWriter writer;
		try {
			writer = new FileWriter("C://GoogleCodeJam/output.in");
			for(String str: solutionList) {
				  writer.write(str + System.getProperty("line.separator"));
				}
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}

