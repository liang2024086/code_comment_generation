package methodEmbedding.Magic_Trick.S.LYD135;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class First {

	public static void main(String[] args) throws Exception, FileNotFoundException {
		String preLocation = "C:\\Users\\user\\Desktop\\codeJam\\";
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(preLocation+"A-small-attempt1.in"), "utf-8"));
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(preLocation+"result-small.in"), "utf-8");
		int num = 0;
		num = Integer.parseInt(reader.readLine());
		for(int i=1;i<=num;i++){
			int row1 = Integer.parseInt(reader.readLine()); 
			for(int j=0;j<row1-1;j++)
				reader.readLine();
			String[]items1 = reader.readLine().split(" ");
			for(int j=row1-1;j<3;j++)
				reader.readLine();
			int row2 = Integer.parseInt(reader.readLine()); 
			for(int j=0;j<row2-1;j++)
				reader.readLine();
			String[]items2 = reader.readLine().split(" ");
			for(int j=row2-1;j<3;j++)
				reader.readLine();
			
			String indexString = "";
			for(int m=0;m<items1.length;m++)
				for(int n=0;n<items2.length;n++)
					if(items1[m].equals(items2[n]))
						indexString+=m;
			
			int length = indexString.length();
			if(length==0)
				writer.write("Case #"+i+": "+"Volunteer cheated!"+"\n");
			else if(length==1)
				writer.write("Case #"+i+": "+items1[Integer.parseInt(indexString)]+"\n");
			else
				writer.write("Case #"+i+": "+"Bad magician!"+"\n");
		}
		reader.close();
		writer.close();
	}
	
}
