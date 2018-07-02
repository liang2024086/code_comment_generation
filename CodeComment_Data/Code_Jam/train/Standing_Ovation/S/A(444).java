package methodEmbedding.Standing_Ovation.S.LYD1007;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String dir = "./src/Qualification/";
		String f = "A-small-attempt0.in.txt";
		BufferedReader in = new BufferedReader(new FileReader(dir+f));
		PrintWriter out = new PrintWriter(dir + "out"+f);

		
		int T = Integer.valueOf(in.readLine());
		for(int l=0; l<T; l++){
			String[] line = in.readLine().split(" ");
			int sMax = Integer.valueOf(line[0]);
			//System.out.println("line0 "+line[0] + " line1: "+line[1]);
			
			int nFriends = 0;
			int shyness = 0;
			
			for(int i = 0; i<=sMax; i++){
				int nPeople = line[1].charAt(i)-'0';
				//System.out.println("nP : "+nPeople + " shyness: "+shyness + " i: "+i + " Friends :" + nFriends);
				int neededFriends = 0;
				if(i > shyness && nPeople != 0){
					neededFriends = i-shyness;
				}
				shyness += nPeople + neededFriends;
				nFriends += neededFriends;
			}
			
			out.println("Case #" + (l+1) + ": "+nFriends);
		}
		in.close();
		out.close();
		System.out.println("Done");
	}
}
