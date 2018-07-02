package methodEmbedding.Magic_Trick.S.LYD111;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class MagicTrick {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("A-small-attempt0.in");
		BufferedReader reader =new BufferedReader(fr);
	    
	    FileWriter fw =new FileWriter("output.txt"); 
	    PrintWriter pw =new PrintWriter(fw);
	    
	    int tcase,rownumber;
	    
	    String str;
	    
	    ArrayList<String> firstlist =  new ArrayList<String>();
	    ArrayList<String> secondlist = new ArrayList<String>();
	    
	    tcase = Integer.parseInt(reader.readLine());
	    
	    for (int i = 0; i < tcase; i++) {
	    	
	    	rownumber = Integer.parseInt(reader.readLine());
	    	rownumber--;
	    	
	    	for (int j = 0; j < 4; j++) {
	    		
	    		str = reader.readLine();
	    		if (j==rownumber) {
					
	    			firstlist.addAll(Arrays.asList(str.split(" ")));
				}
				
			}
	    	
	    	rownumber = Integer.parseInt(reader.readLine());
	    	rownumber--;
	    	
	    	for (int j = 0; j < 4; j++) {
	    		
	    		str = reader.readLine();
	    		if (j==rownumber) {
					
	    			secondlist.addAll(Arrays.asList(str.split(" ")));
				}
				
			}
	    	
	    //	System.out.println(firstlist);
	    //	System.out.println(secondlist);
	    	

	    	
	    	int count=0;
	    	String found=null;
	    	for (String string : secondlist) {
	    		
	    		//System.out.println(string);
				
	    		if (firstlist.contains(string)) {
					
	    			count++;
	    			found =string;
				}
			}
	    	
	    	int pos;
	    	pos=i+1;
	    	System.out.println();
	    	firstlist.clear();
	    	secondlist.clear();
	    	

	    	if (count==1) {
	    		
		    	System.out.println("Case #"+pos+": "+found);
		    	pw.println("Case #"+pos+": "+found);
				
			}else if (count==0) {
				
		    	System.out.println("Case #"+pos+": "+"Volunteer cheated!");
		    	pw.println("Case #"+pos+": "+"Volunteer cheated!");
				
			}else if (count>1) {
				
				System.out.println("Case #"+pos+": "+"Bad magician!");
				pw.println("Case #"+pos+": "+"Bad magician!");
			}
	    	
			
		}
	    
	    
	    reader.close();
	    fr.close();
	    pw.close();
	    fw.close();

	}

}

