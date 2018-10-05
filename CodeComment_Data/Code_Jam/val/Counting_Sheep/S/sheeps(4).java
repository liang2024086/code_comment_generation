package methodEmbedding.Counting_Sheep.S.LYD127;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class sheeps {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("a.in"));
		int tc = in.nextInt();
		for(int i = 1; i <= tc; i++){
			int n = in.nextInt();
			if(n == 0){
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}else{
				HashSet<Character> set = new HashSet<Character>();
				int c = n;
				while(set.size() != 10){
					String s = c + "";
					for(char c1 : s.toCharArray()){
						if(!set.contains(c1)){
							set.add(c1);
						}
					}
					c += n;
				}
				System.out.println("Case #" + i + ": " + (c - n));
			}
		}
	}
}
