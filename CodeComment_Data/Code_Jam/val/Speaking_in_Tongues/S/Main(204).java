package methodEmbedding.Speaking_in_Tongues.S.LYD919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.charset.Charset;


public class Main {

	public static void main(String arg[])
	{
		try {
			FileInputStream fIn = new FileInputStream("input.txt");
			Charset cs = Charset.forName("UTF-8");
			InputStreamReader iRd = new InputStreamReader(fIn,cs);
			BufferedReader bRd = new BufferedReader(iRd);
			
			
			String str = bRd.readLine();
			
			Integer line = Integer.parseInt(str);
			
			System.out.println(line);
			
			Convertor.Initial();
			
			Writer output = null;
			File file = new File("output.txt");
			output = new BufferedWriter(new FileWriter(file));
			
			
			for(int i = 0 ; i < line; ++i)
			{
				String inLine = bRd.readLine();
				
				StringBuffer sb = new StringBuffer();
				
				for(int j = 0 ; j < inLine.length() ; ++j)
				{
					char ch = inLine.charAt(j);
					ch = Convertor.convert(ch);
										
					sb.append(ch);
				}
				
				
				System.out.println("Case #" + (i+1) + ": " + sb);
				output.write("Case #" + (i+1) + ": " + sb + "\n");
				
			}
			
			
			
			output.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
