package methodEmbedding.Revenge_of_the_Pancakes.S.LYD420;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class RevengeofthePancakes {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\WHZZ\\Desktop\\B-small-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\WHZZ\\Desktop\\answer.txt")));
		String s = br.readLine();
		int T = Integer.valueOf(s);
		for(int i = 0; i < T;i++){
			s = br.readLine();
			StringBuilder sb = new StringBuilder();
			char[] c = s.toCharArray();
			sb.append(c[0]);
			for(int j = 1; j < c.length; j++){
				if(c[j]!=c[j-1])
					sb.append(c[j]);
			}
			bw.write("Case #"+(i+1)+": " + (sb.lastIndexOf("-") + 1) + "\n");
		}
		bw.close();
	}

}
