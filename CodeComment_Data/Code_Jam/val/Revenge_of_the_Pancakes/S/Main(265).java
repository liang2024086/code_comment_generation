package methodEmbedding.Revenge_of_the_Pancakes.S.LYD542;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		FileInputStream fs = new FileInputStream("B-small-attempt0.in");
		FileWriter fw = new FileWriter("p2out.txt");
		int num = 0;
		Scanner s = new Scanner(fs);
		num = s.nextInt();
		s.nextLine();
		for(int i = 0; i < num; i++){
			String str = s.nextLine();
			int len = str.length();
			int ans = 0;
			boolean operator = false;//false????????????????-
			for(int j = len - 1; j >= 0; j--){
				if(!operator){
					if(str.charAt(j) == '+')
						continue;
					else{
						ans ++;
						operator = !operator;
					}
				}else{
					if(str.charAt(j) == '-')
						continue;
					else{
						ans ++;
						operator = !operator;
					}
				}
			}
			fw.write("Case #" + (i + 1) +": " + ans + "\n");
		}
		fs.close();
		fw.close();
	}
}
