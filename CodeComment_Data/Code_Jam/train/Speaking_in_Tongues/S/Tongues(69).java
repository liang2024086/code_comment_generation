package methodEmbedding.Speaking_in_Tongues.S.LYD533;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Tongues
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fstream = new FileInputStream("/Users/jleibsly2002/A-small-attempt0.in");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = br.readLine();
			int N = Integer.parseInt(strLine);
			
			char[] mappings = new char[26];
			mappings[0] = 'y';
			mappings[1] = 'h';
			mappings[2] = 'e';
			mappings[3] = 's';
			mappings[4] = 'o';
			mappings[5] = 'c';
			mappings[6] = 'v';
			mappings[7] = 'x';
			mappings[8] = 'd';
			mappings[9] = 'u';
			mappings[10] = 'i';
			mappings[11] = 'g';
			mappings[12] = 'l';
			mappings[13] = 'b';
			mappings[14] = 'k';
			mappings[15] = 'r';
			mappings[16] = 'z';
			mappings[17] = 't';
			mappings[18] = 'n';
			mappings[19] = 'w';
			mappings[20] = 'j';
			mappings[21] = 'p';
			mappings[22] = 'f';
			mappings[23] = 'm';
			mappings[24] = 'a';
			mappings[25] = 'q';
			
			for(int i = 0; i < N; i++)
			{
				String result = "";
				
				char[] message = br.readLine().toCharArray();
				for(char c : message)
				{
					if(c==' ')
						result += " ";
					else
					{
						int cInt = c - 97;
						result += "" + mappings[cInt];
					}
				}
				
				System.out.println("Case #" + (i+1) + ": " + result);
			}
			
			in.close();
		}
		catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
}
