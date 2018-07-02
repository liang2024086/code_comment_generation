package methodEmbedding.Standing_Ovation.S.LYD2213;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

	static public void main(String[] args) throws IOException, FileNotFoundException
	{
		File f = new File("/Users/jhamelin/Documents/workspace/Test/src/testFile.txt");
		FileReader fr = new FileReader(f); 
		BufferedReader br = new BufferedReader(fr); 
		String s; 
		
		int NCounter =0;
		int N = Integer.parseInt(br.readLine());
		while((s = br.readLine()) != null) { 

			NCounter++;
			int friends = 0;	
			int sMax = Integer.parseInt(s.substring(0, 1));
					int stand =0;
		    for(int i=2 ; i<=sMax+2 ;i++){
		    	int curr = Integer.parseInt(s.substring(i, i+1));
		    	int friendsNeeded =0;
		    	if(stand < i-2){
		    		friendsNeeded =((i-2) - stand);
		    		friends += ((i-2) - stand);
		    	}
		    	stand = stand+ curr+friendsNeeded;
		    }

			System.out.println("Case #"+NCounter+": "+friends);

		} 
		fr.close(); 

	}

}

