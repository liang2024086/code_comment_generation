package methodEmbedding.Speaking_in_Tongues.S.LYD224;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SpeakingInTongues {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader dicReader = new BufferedReader(new FileReader("D:\\workspace\\GoogleCodeJam\\data\\dic.txt"));
			char dic[] = new char[26];
			char l1[] = dicReader.readLine().toCharArray();
			char l2[]= dicReader.readLine().toCharArray();//translated
			
			for (int j = 0; j < l1.length; j++)
			{
				if (l1[j]!=' ')
					dic[(l1[j]-'a')] = l2[j];
			}
			for (int j = 0; j < 26; j++)
			{
				System.out.print(dic[j]);
			}
			
			BufferedReader reader = new BufferedReader(new FileReader("D:\\workspace\\GoogleCodeJam\\data\\A-small-attempt0.in"));
			String line;
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\workspace\\GoogleCodeJam\\data\\A-small-attempt0.out"));
			
			line=reader.readLine();
			int c = Integer.parseInt(line);
			int i = 1;
			while ((line=reader.readLine()) != null) 
			{
				char cArray[] = line.toCharArray();
				char result[] = new char[cArray.length];
				for (int j = 0; j < cArray.length; j++)
				{
					if (cArray[j]>='a' && cArray[j]<='z')
					{
						if (Character.isUpperCase(cArray[j]))
							result[j] = Character.toUpperCase(dic[cArray[j]-'A']);
						else
							result[j] = dic[cArray[j]-'a'];
					}
					else 
						result[j] = cArray[j];
				}
				writer.write(String.format("Case #%s: %s", i, new String(result)));
				if (i<c)
					writer.newLine();
				i++;
			} 
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
