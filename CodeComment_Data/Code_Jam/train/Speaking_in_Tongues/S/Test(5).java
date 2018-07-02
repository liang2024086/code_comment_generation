package methodEmbedding.Speaking_in_Tongues.S.LYD430;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File infile = new File("A-small-attempt0.in");
		File outfile = new File("out.txt");
		char []change = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k',
				'r','z','t','n','w','j','p','f','m','a','q'};
		BufferedReader reader = null;
		BufferedWriter writer = null;
		try{
			reader = new BufferedReader(new FileReader(infile));
			writer = new BufferedWriter(new FileWriter(outfile));
			String s = reader.readLine();
			String out;
			int n = Integer.parseInt(s),i,j;
			char temp;
			for(i=1;i<=n;i++){
				s = reader.readLine();
				out = "Case #" + i + ": ";
				for(j=0;j<s.length();j++){
					temp = s.charAt(j);
					if(temp >= 'a' && temp <= 'z'){
						temp = change[temp-'a'];
					}else{
						if(temp >= 'A' && temp <= 'Z'){
							temp = change[temp-'A'];
						}
					}
					out += temp;
				}
				writer.write(out);
				writer.newLine();
			}
			reader.close();
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
