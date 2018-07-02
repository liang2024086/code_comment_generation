package methodEmbedding.Speaking_in_Tongues.S.LYD1484;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


public class App {

	public static void main(String[] args){
		//save googlerese to english alphabetic
		Hashtable<Character, Character> mapping = new Hashtable<Character, Character>();
		
		mapping.put('y','a');
		mapping.put('e','o');
		mapping.put('q', 'z');
		mapping.put('z', 'q');
		
		String msgGooglerese = "ejp mysljylc kd kxveddknmc re jsicpdrysirbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcdde kr kd eoya kw aej tysr re ujdr lkgc jv";
		String msgEnglish = "our language is impossible to understandthere are twenty six factorial possibilitiesso it is okay if you want to just give up";

		for(int i=0;i<msgEnglish.length();i++){
			mapping.put(msgGooglerese.charAt(i), msgEnglish.charAt(i));
		}
		
		
		//reading file 
		
    	List<String> r = new ArrayList<String>();
    	
    	try {
    		FileInputStream fstream = new FileInputStream("input.in");
        	DataInputStream in      = new DataInputStream(fstream);
        	BufferedReader  br      = new BufferedReader(new InputStreamReader(in));

        	int cases = Integer.parseInt(br.readLine());
        	
        	String output = "";
        	
        	for(int i=1;i<=cases;i++){
        		String text = br.readLine();
        		String translate = "";
        		//translating
        		
        		for(int j=0;j<text.length();j++){
        			translate += mapping.get(text.charAt(j)); 
        		}
        		
        		//case it is not the last
        		if(i+1 <= cases){
        			translate += "\n";
        		}
        		
        		output += "Case #"+i+": " + translate;
        	}
        	
        	System.out.println(output);
			
        	BufferedWriter out = new BufferedWriter(new FileWriter("output.out", true));
            out.write(output);
            out.close();
              
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
	
	}
}
