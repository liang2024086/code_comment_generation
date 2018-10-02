package methodEmbedding.Magic_Trick.S.LYD1734;

import java.io.*;

public class MagicTrick
{
	public static final String FILE_NAME = "A-small-attempt2";
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(FILE_NAME+".in"));
		PrintWriter p = new PrintWriter(FILE_NAME+".out");
		int n = Integer.parseInt(br.readLine());
			for(int c = 1; c <= n; c++){
			int r = Integer.parseInt(br.readLine());
			String[] s = null;
			for(int i = 1; i <= 4; i++){
				if(i==r){
					s = br.readLine().split(" ");
				}else 
					br.readLine();
			}
			r = Integer.parseInt(br.readLine());
			String[] t = null;
			for(int i = 1; i <= 4; i++){
				if(i==r){
					t = br.readLine().split(" ");
				}else 
					br.readLine();
			}
			String result = "Volunteer Cheated!";
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(s[i].equals(t[j])){
						if(!result.equals("Volunteer Cheated!")){
							result = "Bad magician!";
							i = j = 4;
						}
						else result = s[i];
					}
				}
			}
			p.printf("Case #%d: %s%n", c, result);
		}
		br.close();
		p.close();
	}
}
