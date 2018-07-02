package methodEmbedding.Speaking_in_Tongues.S.LYD602;

/////     put all imports here    /////////

import java.io.*;
import java.util.*;                // for system.out n stuff
import static java.lang.Math.*;    

///////////////////////////////////////////

public class Googleese {
	public static void main(String[] args) throws FileNotFoundException{
		
		//  handy scanner that everyone uses
		//  nextInt() nextLong() ect. 
	    //  these actually return int and long
		//  happy coding
		Scanner in = new Scanner(System.in);
		
		char[] convert = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		int NumCases = in.nextInt();
		String fuckyou = in.nextLine();
		
		for(int CasesDone=0; CasesDone < NumCases; CasesDone++){
			
			
			
			//dont forget to delete the last output from GoogleOut
			System.setOut(new PrintStream(new FileOutputStream("/Users/NathanBreitsch/Desktop/GoogleOut/StoreCreditOut", true)));
			
			String temp = in.nextLine();
			
			
			
			
			
			//In Europe, the first floor is numbered zero.
			//But this is America!  Hence the +1
			System.out.print("Case #" + (CasesDone+1) + ": ");
			
			
			for (int i = 0; i < temp.length(); i++){
				if (temp.charAt(i) == ' '){
					System.out.print(" ");
				}
				else{
					System.out.print(convert[temp.charAt(i) - 97]);			
				}
			}

			
			System.out.println();
			
			
		}
	}
}
