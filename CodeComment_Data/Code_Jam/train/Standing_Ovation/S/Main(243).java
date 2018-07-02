package methodEmbedding.Standing_Ovation.S.LYD925;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
		PrintWriter pw = new PrintWriter(new File("A-small-attempt0.out"));
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++){
			Ovation ovation = new Ovation(br.readLine());
//			System.out.println("Case #"+i+": " + ovation.getNumFriendsToInvite());
			pw.print("Case #"+i+": " + ovation.getNumFriendsToInvite());
			if(i!=T){
				pw.println();
			}
		}
		br.close();
		pw.flush();
		pw.close();
	}

}
