package methodEmbedding.Speaking_in_Tongues.S.LYD48;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;

public class qual2012 {
	
	public static void main(String[] args) {
		
		String real = "abcdefghijklmnopqrstuvwxyz ";
		
		String fake = "ynficwlbkuomxsevzpdrjgthaq ";

		char[] fakeContent = fake.toCharArray();
		char[] realContent = real.toCharArray();
		
		Hashtable stuff = new Hashtable(); 
		
		for(int i = 0;i<real.length();i++){
			stuff.put(fake.charAt(i),real.charAt(i));
		}

		try {


			FileWriter fstream = new FileWriter("out_2012A.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			FileReader input = new FileReader("A-small-attempt0.in");
			BufferedReader bufRead = new BufferedReader(input);  
		

			String line; 
			line = bufRead.readLine();
			int count = Integer.parseInt(line);
		


			for(int i = 1;i<=count;i++){


				line = bufRead.readLine();
				
				StringBuffer answer = new StringBuffer();
				
				for(int j = 0;j<line.length();j++){
					answer.append( (Character) stuff.get(line.charAt(j)));
				}
				
				out.write("Case #" + i+ ": "+answer + "\n");

			}

			bufRead.close();
			out.close();

		}catch (Exception e){
			e.printStackTrace();
		}
	}
}


