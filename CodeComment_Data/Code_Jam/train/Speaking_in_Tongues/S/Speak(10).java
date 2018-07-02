package methodEmbedding.Speaking_in_Tongues.S.LYD876;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Speak 
{
	
	static int T;
	static String[] lines;
	
	static char[] google = new char[30];
	static char[][] results;
	
	public static void main(String[] args)
	{
		google['a'-'a'] = 'y';
		google['b'-'a'] = 'h';
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

		
		
		
		try 
		{
			FileInputStream fstream = new FileInputStream("textfile.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			T = Integer.parseInt(br.readLine());
			lines = new String[T];
			results = new char[T][110];
			
			for(int i = 0;i<T;++i)
				lines[i] = br.readLine();
			
			for(int i = 0;i<T;++i)
			{//System.out.println(lines[i]);
				for(int j = 0;j<lines[i].length();++j)
				{
					char c = lines[i].charAt(j);
					
					if(c>='a'&&c<='z')
						results[i][j] = google[c-'a'];
					else
						results[i][j] = c;
					
				}
				
			}
			
			 FileWriter ofstream = new FileWriter("out.txt");
			 BufferedWriter out = new BufferedWriter(ofstream);
			
			 for(int i = 0;i<T;++i)
			 {
				 out.write("Case #"+(i+1)+": ");
				 
				 for(int j=0;j<lines[i].length();++j)
				 {
					 out.write(results[i][j]);
				 
				 }out.write('\n');
			 }
			 out.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
