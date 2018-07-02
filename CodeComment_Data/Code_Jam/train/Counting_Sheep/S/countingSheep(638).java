package methodEmbedding.Counting_Sheep.S.LYD1613;

import java.util.*;
import java.io.*;
public class countingSheep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("A-small-attempt0 (1).in");
		BufferedReader br = new BufferedReader(fr);
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++){
			String n = br.readLine();
			int num = Integer.parseInt(n);
			if (num == 0){
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			}
			else{
				boolean [] seen = new boolean[10];
				int count = 0;
				int mult = 1;
				while(count != 10){
					n = ""+mult*num;
					for(int j = 0; j < n.length(); j++){
						if (!seen[Character.getNumericValue(n.charAt(j))]){
							count++;
							seen[Character.getNumericValue(n.charAt(j))] = true;
						}
					}
					mult++;
				}
				System.out.println("Case #"+(i+1)+": "+n);
			}
		}
		
	}

}
