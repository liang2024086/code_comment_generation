package methodEmbedding.Magic_Trick.S.LYD2197;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class magic {
	private static final String FAIL = "Bad magician!\n";
    private static final String CHEAT = "Volunteer cheated!\n";
    public static void main(String[] args){
    	int sameCard;
		String result = null, possibleCard = null;
		HashSet<String> hs = null;
		String str = null;
		StringTokenizer st;
    	File file = new File("magic.out");
    	if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
			br = new BufferedReader(new FileReader(args[0]));
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++)
			{
				sameCard = 0;
				bw.write("Case #" + (i+1) + ": ");
				int first = Integer.parseInt(br.readLine());
				for(int j=1; j<first; j++)
				{
					br.readLine();
				}
				hs = new HashSet<String>(4);
				str = br.readLine();
				st = new StringTokenizer(str);
				while (st.hasMoreElements()) {
					hs.add((String) st.nextElement());
				}
				for(int j=first; j<4;j++)
				{
					br.readLine();
				}
				int second = Integer.parseInt(br.readLine());
				for(int j=1; j<second; j++)
				{
					br.readLine();
				}
				str = br.readLine();
				st = new StringTokenizer(str);
				while (st.hasMoreElements()) {
					possibleCard = (String) st.nextElement();
					if(hs.contains(possibleCard))
					{
						sameCard++;
						result = possibleCard;
					}
				}
				for(int j=second; j<4;j++)
				{
					br.readLine();
				}
				
				if(sameCard==0)
				{
					bw.write(CHEAT);
				}
				else if(sameCard==1)
				{
					bw.write(result+"\n");
				}
				else
				{
					bw.write(FAIL);
				}
				
			}
			
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
    }
}
