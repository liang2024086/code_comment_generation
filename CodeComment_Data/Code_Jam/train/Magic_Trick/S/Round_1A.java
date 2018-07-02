package methodEmbedding.Magic_Trick.S.LYD835;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Round_1A {
	public static void main(String args[]) throws IOException {

		FileReader fr = new FileReader("A-small-attempt3.in");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		String s[] = new String[4];
		int grid2[][] = new int[4][4];
		int grid1[][] = new int[4][4];
		int p1[] = new int[4];
		int p2[] = new int[4];
		ArrayList <Integer> ans = new ArrayList<Integer>();
		int t, a1, a2;
		while ((line = br.readLine()) != null) {
			t = Integer.parseInt(line);			
			//System.out.println(t);
			for (int tt = 1; tt <= t; tt++) {
				line = br.readLine();
				String out = "Case #"+tt+": ";
				//System.out.println(out+line);
				a1 = Integer.parseInt(line);
				for (int i = 0; i < 4; i++) {
					line = br.readLine();
					//System.out.println(line);
					s = line.split(" ");
					for (int j = 0; j < s.length; j++) {
						grid1[i][j] = Integer.parseInt(s[j]);
					}
				}
				p1 = grid1[a1-1];

				line = br.readLine();
				a2 = Integer.parseInt(line);
				for (int i = 0; i < 4; i++) {
					line = br.readLine();
					s = line.split(" ");
					for (int j = 0; j < s.length; j++) {
						grid2[i][j] = Integer.parseInt(s[j]);
					}
				}
				p2 = grid2[a2-1];
				
				//System.out.println(p1[0]+" "+p1[1]+" "+p1[2]+" "+p1[3]);
				//System.out.println(p2[0]+" "+p2[1]+" "+p2[2]+" "+p2[3]);
				for (int i = 0; i<4;i++){
					for (int j=0;j<4;j++){
						if(p2[j]==p1[i]){
							ans.add(p1[i]);
						}
					}
				}
				//System.out.println(ans.size());
				if(ans.size() == 1){
					System.out.println(out+ans.get(0));
				}
				else if(ans.size() == 0){
					System.out.println(out+"Volunteer cheated!");
				}
				else {
					System.out.println(out+"Bad magician!");
				}
				
				ans.clear();
			}
		}
		br.close();
	}
}
