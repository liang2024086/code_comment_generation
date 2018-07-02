package methodEmbedding.Standing_Ovation.S.LYD845;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class contest1 {

	public static void main(String[] args) {
         
		Scanner sc = null;
		List<Integer> audiances = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		try {
		  File f = new File("c:/practice.txt");
		  sc = new Scanner(f);
		 
		}catch(Exception e){}
		
		int T = Integer.parseInt(sc.nextLine());
		
		for( int i=0 ; i< T ; i++ ){
		
			int friends = 0;
			int standing = 0;
			
			StringTokenizer tokens = new StringTokenizer(sc.nextLine());
			int Smax = Integer.parseInt(tokens.nextToken());
			String tempStr = tokens.nextToken();
			
					
			for(int t=0 ; t<tempStr.length()  ; t++){
					audiances.add(Character.getNumericValue(tempStr.charAt(t)));	
		    }			
		
			if (audiances.get(0)!=0)
				standing += audiances.get(0) ;
	
			  System.out.println("aud="+audiances+"num"+(i+1));
			  
			for(int m=1 ; m < audiances.size() && m <= Smax; m++){
				
				
				  if( m <= standing ){
					  
					  standing += audiances.get(m); 
					  
				  }else{
					  friends += m-(standing);
					  standing += m-(standing);
					  standing += audiances.get(m);
				   }
			
				//}	// end of main if
				  System.out.println("frineds"+friends);
				  System.out.println("standing "+standing);
			}
			
			result.add(friends);
		//	System.out.println("result"+result);
			
	 	    audiances.clear();
	
		}// end of main for
		
			
		
		
		File f = new File("c:/output.txt");
		try {
			FileOutputStream writer = new FileOutputStream(f);
			PrintStream pen = new PrintStream(writer);
			
			for(int n=0; n < result.size();n++){
		      	pen.println("Case #"+(n+1)+": "+result.get(n));
			  			    
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	} // end of main

}
