package methodEmbedding.Speaking_in_Tongues.S.LYD143;

import java.io.*;
import java.util.*;

public class SpeakingInTongues{

	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner (new FileReader ("A-small-attempt0.in"));
		
		LinkedList<String> google = new LinkedList<String>();
		LinkedList<String> eg = new LinkedList<String>();
		LinkedList<String> input = new LinkedList<String>();
		
		String ggl[];
		String english[];
		String line;
		
		
		String sample = "ejp mysljylc kd kxveddknmc re " +
				"jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd " +
				"de kr kd eoya kw aej tysr re ujdr lkgc jv";
		
		String eng = "our language is impossible to understand " +
				"there are twenty six factorial possibilities " +
				"so it is okay if you want to just give up";
		
		for (int x  = 0; x < sample.length(); x++){
			
				google.add(Character.toString(sample.charAt(x)));	
				eg.add(Character.toString(eng.charAt(x)));	
		}
		
		for (int y = 0; y < google.size(); y++){
				if (google.get(y).equals(" ")) google.remove(y);
				if (eg.get(y).equals(" ")) eg.remove(y);
		}
		
		ggl = new String[google.size()];
		english = new String[ggl.length];
			
		for (int j = 0; j < ggl.length; j++){
			ggl[j] = google.get(j);
			english[j] = eg.get(j);
			//System.out.print(ggl[j]);
		}
		
		int loop = in.nextInt();
		//in.nextLine();
		line = in.nextLine();
		
		for (int i = 0; i< loop; i++){
			line = in.nextLine();
			System.out.print("Case #" + (i+1) + ": ");
			
			//System.out.println(line);
			input.clear();
			for (int u = 0; u < line.length(); u++){
				
				input.add(Character.toString(line.charAt(u)));
			}
			
	hello:
			for (int k = 0; k < input.size(); k++){
				
				if (input.get(k).equals(" ")){
					System.out.print(" ");
					continue hello;
				}else if (input.get(k).equals("z")){
					System.out.print("q");
					continue hello;
				}else if (input.get(k).equals("q")){
					System.out.print("z");
					continue hello;
				}
				for (int h = 0; h < ggl.length; h++){
					if (input.get(k).equals(ggl[h])){
						System.out.print(english[h]);
						continue hello;
					}//end if
				} //end for
			}//end hello
		if (i < loop) System.out.println ("");
		}//end ting
		
		

	}
	
}
