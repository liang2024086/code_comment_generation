package methodEmbedding.Speaking_in_Tongues.S.LYD431;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;


public class GLanguage1 {
	

	public static void main(String[] args) {
	try{
		Language l = new Language();
		l.lang();
		//BufferedReader br = new BufferedReader(new FileReader("/Users/Sush/Documents/workspace1/CJ/src/files/Input.txt"));
		BufferedReader br = new BufferedReader(new FileReader("/Users/Sush/Downloads/A-small-attempt0.in.txt"));
		String line;
		StringBuffer sb = new StringBuffer();
		while((line = br.readLine())!=null)
		{
			sb = sb.append(line+ "\n");
		}
		String[] lines = sb.toString().split("\n");
		String data = "";
		for(int i=1; i < lines.length; i++)
		{
			data = data + "Case #"+i+": ";
			System.out.print("Case #"+i+": ");
			String[] chars = lines[i].split("");
			for (String c : chars)
			{
				if (c.compareTo(" ") == 0)
				{
					data = data + " ";
					System.out.print(" ");
				}
				else if (c.compareTo("") == 0)
				{
					data = data + "";
					System.out.print("");
				}
				else
				{
					data = data + Language.language.get(c);
				System.out.print(Language.language.get(c));
				}
			}
			data = data + "\n";
			System.out.print("\n");
			
		}
		System.out.println("data");
		//System.out.println(data);
		File f = new File("Output.txt");
		if(f.exists())
		{
			f.delete();
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
		bw.write(data);
		bw.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
