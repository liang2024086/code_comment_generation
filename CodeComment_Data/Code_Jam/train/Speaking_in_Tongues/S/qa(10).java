package methodEmbedding.Speaking_in_Tongues.S.LYD564;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class qa {

	public static void main(String[] args)
	{
		String fileName = "A-small-attempt1.in";
		char [] alpha = new char[26];
		char [] google = new char[26];
		
		for(int i=0; i<alpha.length; i++)
		{
			if(i==0)
				alpha[i] = 'a';
			else
				alpha[i] = (char) (alpha[i-1]+1);			
		}
		
		
		google[0] = 'y';
		google[1] = 'h';
		google[2] = 'e';
		google[3] = 's';
		google[4] = 'o';
		google[5] = 'c';
		google[6] = 'v';
		google[7] = 'x';
		google[8] = 'd';
		google[9] = 'u';
		google[10] = 'i';
		google[11] = 'g';
		google[12] = 'l';
		google[13] = 'b';
		google[14] = 'k';
		google[15] = 'r';
		google[16] = 'z';
		google[17] = 't';
		google[18] = 'n';
		google[19] = 'w';
		google[20] = 'j';
		google[21] = 'p';
		google[22] = 'f';
		google[23] = 'm';
		google[24] = 'a';
		google[25] = 'q';
		
		
		try {
			
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line="";
			int count = 0;
			
			while((line = br.readLine())!= null)
			{
				if(count == 0)
				{
					count++;
					continue;
				}
				
				bw.write("Case #"+count+": ");
				for(int j=0; j<line.length(); j++)
				{
					if(line.charAt(j) == ' ')
						bw.write(" ");	
					else 
					{	
						for(int k=0; k<alpha.length; k++)
						{
							if(alpha[k] == line.charAt(j))
							{
								bw.write(google[k]);								
							}
							
						}						
					}					
				}
				bw.write("\n");
				count++;
			}
			
			br.close();
			fr.close();
			bw.close();
			fw.close();
			
		} catch (Exception EE) {
			// TODO Auto-generated catch block
			EE.printStackTrace();
		}
		
	}
}
