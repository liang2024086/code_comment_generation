package methodEmbedding.Speaking_in_Tongues.S.LYD1490;

import java.io.*;
import java.util.*;

public class skeleton {
	public static void main(String[] argv) throws Exception {
	
		String inputFile = argv[0];
		Scanner scan = null;
		FileReader fR = null;
		BufferedReader bR = null;

		int T;
		
		
		try{
			
			fR = new FileReader(inputFile);
			bR = new BufferedReader(fR);

			
			
			T = Integer.parseInt(bR.readLine());
			
			for(int i = 0; i <= T; i++){
				String line = bR.readLine();
				char[] googlese = line.toCharArray();
				
				for(int j=0; j < googlese.length; j++ ){
					
					if(googlese[j]=='a'){
						googlese[j] = 'y';
					} else if(googlese[j]=='b'){
						googlese[j] = 'h';
					} else if(googlese[j]=='c'){
						googlese[j] = 'e';
					} else if(googlese[j]=='d'){
						googlese[j] = 's';
					} else if(googlese[j]=='e'){
						googlese[j] = 'o';
					} else if(googlese[j]=='f'){
						googlese[j] = 'c';
					} else if(googlese[j]=='g'){
						googlese[j] = 'v';
					} else if(googlese[j]=='h'){
						googlese[j] = 'x';
					} else if(googlese[j]=='i'){
						googlese[j] = 'd';
					} else if(googlese[j]=='j'){
						googlese[j] = 'u';
					} else if(googlese[j]=='k'){
						googlese[j] = 'i';
					} else if(googlese[j]=='l'){
						googlese[j] = 'g';
					} else if(googlese[j]=='m'){
						googlese[j] = 'l';
					} else if(googlese[j]=='n'){
						googlese[j] = 'b';
					} else if(googlese[j]=='o'){
						googlese[j] = 'k';
					} else if(googlese[j]=='p'){
						googlese[j] = 'r';
					} else if(googlese[j]=='q'){
						googlese[j] = 'z';
					} else if(googlese[j]=='r'){
						googlese[j] = 't';
					} else if(googlese[j]=='s'){
						googlese[j] = 'n';
					} else if(googlese[j]=='t'){
						googlese[j] = 'w';
					} else if(googlese[j]=='u'){
						googlese[j] = 'j';
					} else if(googlese[j]=='v'){
						googlese[j] = 'p';
					} else if(googlese[j]=='w'){
						googlese[j] = 'f';
					} else if(googlese[j]=='x'){
						googlese[j] = 'm';
					} else if(googlese[j]=='y'){
						googlese[j] = 'a';
					} else if(googlese[j]=='z'){
						googlese[j] = 'q';
					} 
				}
				
				String out = new String(googlese);
				int caseIndex = i+1;
				System.out.println("Case #" + caseIndex + ": " + out);

				
			}
			
		
			
		} catch (Exception e){}
		
	}	
} 
