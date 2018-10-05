package methodEmbedding.Speaking_in_Tongues.S.LYD1346;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class Speaking {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(".in")));
		String table ="yhesocvxduiglbkrztnwjpfmaq";
		int num =0;
		String line = null;
		line = br.readLine();
		int i=0;
		num = Integer.parseInt(line);
		
		while(num-->0){
			StringBuilder sb = new StringBuilder();
			line = br.readLine();
			i++;
			for(int j=0;j<line.length();j++){
				char c =line.charAt(j);
				if(c==' '){
					sb.append(' ');
				}
				else{
					sb.append(table.charAt(c-'a'));
				}
			}
			System.out.println("Case #"+i+": "+sb.toString());
			
		}
		br.close();
		
	}

}
