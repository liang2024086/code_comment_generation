package methodEmbedding.Standing_Ovation.S.LYD678;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
	public static void main(String []argvs) throws IOException { 
		
		 BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		 Writer writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("o.txt"), "utf-8"));
		 
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();
		        Scanner s = new Scanner(line);
		        int nTestCase = s.nextInt();
		        
		        int n_ppl = 0;
		        int pplToAdd = 0;
		        int n_ppl_atThisShyness;
	        	int nMaxShyness ;
		        //writer.write("Case #");
		        line = br.readLine();
		        int nCase = 1;
		        while (line != null) {
		        	pplToAdd = 0;
		        	n_ppl = 0;
		        	s = new Scanner(line);
		        	nMaxShyness = s.nextInt();
		        	String shyString = s.next();
		        	//loop thru shyness array
		        	for (int i =0; i<= nMaxShyness;i++) {
		        		n_ppl_atThisShyness = Character.getNumericValue(shyString.charAt(i));
		        		//System.out.print(n_ppl_atThisShyness);
		        		
		        		n_ppl += n_ppl_atThisShyness;
		        		//System.out.println("case "+nCase+" " + n_ppl+" "+ i);
		        		if (n_ppl < i+1){
		        			int diff = (i+1-n_ppl);
		        			pplToAdd += diff; 
		        			n_ppl += diff;
		        			//System.out.print("case "+nCase+" adding "+diff+"ppl");
		        		}
		        	}
		        	    
		        	writer.write("Case #" +nCase+": "+pplToAdd + System.lineSeparator());
		            //sb.append(line);
		           // sb.append(System.lineSeparator());
		            line = br.readLine();
		            nCase++;
		        }
		       
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				writer.flush();
		        br.close();
		    }
		
	}
}
