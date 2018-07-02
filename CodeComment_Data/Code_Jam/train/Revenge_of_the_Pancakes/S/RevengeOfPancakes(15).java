package methodEmbedding.Revenge_of_the_Pancakes.S.LYD755;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class RevengeOfPancakes {

public static void main(String[] args) {
		
		try {
			File input = new File("B-small-attempt0.in");
			File output = new File("output.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(output));
			Scanner sc = new Scanner(input);
			
			int testcases = sc.nextInt();
			for(int i = 1; i <= testcases; i++){
				String str = sc.next();
				
				if(!str.contains("-")){
					writer.write("Case #" + i + ": 0\n");
					continue;
				}
				
				//String temp = str;
				int cnt = 0;
				
				while(true){
					if(!str.contains("-"))
						break;
					cnt++;
					boolean isNeg = false;
					boolean isPos = false;
					for(int j = 0; j < str.length()-1; j++){
						if(str.charAt(j) == '-')
							isNeg = true;
						else
							isPos = true;
						if(str.charAt(j) != str.charAt(j+1)){
							isPos = true;
							isNeg = true;
							StringBuilder sb = new StringBuilder();
							int k = j;
							if(str.charAt(j) == '-'){
								while(k >= 0){
									sb.append("+");
									k--;
								}
							} else {
								while(k >= 0){
									sb.append("-");
									k--;
								}
							}
							str = sb.toString() + str.substring(j+1, str.length());
							break;
						}
					}
					if(!isNeg && str.charAt(str.length() - 1) != '-')
						break;
					if(!isPos && str.charAt(str.length() - 1) != '+')
						break;
				}
				writer.write("Case #" + i + ": " + cnt + "\n");
			}
			writer.close();
		} catch(Exception ex){
			
		}

	}
}
