package methodEmbedding.Counting_Sheep.S.LYD583;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
	
	
	public static void main(String[] args) {
        ArrayList<String> digits = new ArrayList<>(); 
        
        for(int i = 0 ; i<10 ; i++ )
        	digits.add(""+i); 
        
        int number = 0 ; 
        int count = 0; 
        boolean isInsomnea = false ;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/hhsain/Documents/code_jam/A-small-attempt0.out")))
		{
        	
			String ligne;
			boolean isFirstLine = true;
			while ((ligne = br.readLine()) != null) {
				
				if(isFirstLine)
				{
					isFirstLine = false;
					continue;
				}
				count ++ ;
				number = Integer.parseInt(ligne);
				int initNumber = number ; 
				while(!digits.isEmpty()){
					if(number != 0 ){
						for (int i = 0; i < ligne.length(); i++) 
							if(digits.contains(""+ligne.charAt(i)))
								digits.remove(""+ligne.charAt(i));
							
						if(!digits.isEmpty()){
							number += initNumber;	
							ligne = ""+number;
						}
					}
					else{
						isInsomnea = true;
						break;
					}
				}
				if(isInsomnea)
					System.out.println("Case #"+count+": INSOMNIA");
				else
					System.out.println("Case #"+count+": "+number);
				isInsomnea = false;
				
				digits = new ArrayList<>();
				for(int i = 0 ; i<10 ; i++ )
		        	digits.add(""+i); 
		        
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
			
        

	}
	

}
