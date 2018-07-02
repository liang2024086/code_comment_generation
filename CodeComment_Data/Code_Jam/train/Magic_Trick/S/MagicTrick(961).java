package methodEmbedding.Magic_Trick.S.LYD1792;

import java.io.*;
import java.util.*;

public class MagicTrick {
	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			
			int line = 0;
			String x;
			int cases = 0;
			int y = 0;
			int ans1 = 0;
			int ans2 = 0;
			String[] token1 = null;
			String[] token2 = null;
			
			in = new BufferedReader(new FileReader("input/A-small-attempt1.in"));
			
			for (x = in.readLine(); x != null ; x = in.readLine()) {
				
				line++;
				//System.out.println(y);
				//System.out.println(line);
				
				if(line==1){
					
					cases = Integer.parseInt(x);
					//System.out.println(cases);
					
				}else if(line == 10*y+2){
					
					ans1 = Integer.parseInt(x);
					//System.out.println(ans1);
					//line++;
					//x = in.readLine();
					//System.out.println(line);
					
				}else if(line == 10*y+7){
					//System.out.println(line);
					ans2 = Integer.parseInt(x);
					//System.out.println(ans2);
					//line++;
					//x = in.readLine();
					//System.out.println(line);
					
				}else if(line == 10*y+2+ans1){
					
					token1 = x.split(" ");
					//System.out.println(Arrays.toString(token1));
					
				}else if(line == 10*y+7+ans2){
					
					token2 = x.split(" ");
					//System.out.println(Arrays.toString(token2));
					ArrayList<String> chars1 = new ArrayList<String>(Arrays.asList(token1));
					ArrayList<String> chars2 = new ArrayList<String>(Arrays.asList(token2));
					chars1.retainAll(chars2);
					//System.out.println(chars1);
					
					/*token1.retainAll(token2);
					System.out.println(token1);*/
					int z = y+1;
					if(chars1.size() == 0)
						System.out.println("Case #"+z+": Volunteer cheated!");
					else if(chars1.size() == 1)
						System.out.println("Case #"+z+": "+chars1.get(0));
					else if(chars1.size() > 1)
						System.out.println("Case #"+z+": Bad magician!");
					
					//System.out.println(y);
					y++;
					//System.out.println(y);
					//System.out.println(line);
					ans1 = ans2 = 0;
					token1 = token2 = null;
					 
				}
				
				if(y==cases)	break;
			}
			
			//System.out.println(cases);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
