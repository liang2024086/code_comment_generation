package methodEmbedding.Magic_Trick.S.LYD1232;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;


public class MagicTrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		
		try {
			 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\A-small-attempt2.in"));
			PrintWriter writer = new PrintWriter("C:\\examples\\output.txt", "UTF-8");
			
			int numinput = Integer.parseInt(br.readLine());
			for (int i=0;i<numinput;i++){
				int x = Integer.parseInt(br.readLine());
				x--;
				String decks[][]=new String[4][4];
				for(int j=0;j<4;j++)
					decks[j]=br.readLine().split("[ ]+");
				String select[]=decks[x];
				int y = Integer.parseInt(br.readLine());
				y--;
				String decks2[][]=new String[4][4];
				for(int j=0;j<4;j++)
					decks2[j]=br.readLine().split("[ ]+");
				String select2[]=decks2[y];
				if(Arrays.equals(select,select2)){
					writer.println("Case #"+ (i+1) +": Bad Magician!");
					continue;
				}
			else {
					String value=" ";
					int count=0;
					for(int m=0;m<4;m++)
						for(int n=0;n<4;n++)
							if(select[m].equals(select2[n])){
								value=select[m];
								count++;
							}
					if(count<2){
						if(value.equals(" "))
							writer.println("Case #"+ (i+1) +": Volunteer cheated!");
						else
							writer.println("Case #"+ (i+1) +": "+value);
					}
					else
						writer.println("Case #"+ (i+1) +": Bad Magician!");
				}
				
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
