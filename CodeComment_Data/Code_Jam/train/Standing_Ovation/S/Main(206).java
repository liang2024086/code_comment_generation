package methodEmbedding.Standing_Ovation.S.LYD460;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	static int tests,i,j,k,num;
	static String line;
	static String[] ls;
	
	public static void main(String[] args) {

		try {
			FileReader in = new FileReader("/Users/juliandeluca/Desktop/x.txt");
			BufferedReader br = new BufferedReader(in);						
			tests=Integer.parseInt(br.readLine());
			
			File file = new File("/Users/juliandeluca/Desktop/y.out");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (i=1; i<=tests; i++){
				String str = br.readLine();
				String[] sp = str.split(" ");
				String nums = sp[1];
				int friends = 0;
				int standing = Integer.parseInt("" + nums.charAt(0));
				for (int j = 1; j < nums.length(); j++){
					int newFriends = Math.max(0, j - standing);
					friends += newFriends;
					standing+=Integer.parseInt("" + nums.charAt(j)) + newFriends;
				}
				//System.out.println("Case #"+i+": "+friends);
				bw.write("Case #"+i+": "+friends);				
				bw.newLine();
			}
			
			br.close();
			bw.close();
		}		
		catch (Exception e){
			e.printStackTrace();
		}
		

	}

}
