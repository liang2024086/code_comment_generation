package methodEmbedding.Speaking_in_Tongues.S.LYD1028;

import java.util.*;
import java.io.*;

public class SpeakingTongue {

	public static void main(String[] args){
		

		//String googleres="abcdefghijklmnopqrstuvwxyz";
		String english="yhesocvxduiglbkrztnwjpfmaq";
		
		Scanner in = new Scanner(System.in);
		int count = in.nextInt(); 
		in.nextLine();
		String line;
		
		for(int i=0;i<count;i++){			
			line=in.nextLine();
			StringBuilder output=new StringBuilder(line);			
				for(int j=0;j<line.length();j++){
					if(line.charAt(j)!=' '){
						int ch=(int)(line.charAt(j))-(int)('a');		
						//System.out.print(a+" "+ch);
						output.setCharAt(j, english.charAt(ch));
					}
				}
			System.out.println("Case #"+(i+1)+": "+output);
		}
		
	}
}
