package methodEmbedding.Counting_Sheep.S.LYD600;

import java.io.*;
import java.util.*;
public class CountingSheep {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ; i++){
			long n = Long.parseLong(br.readLine());
			if(n == 0){
				System.out.println("Case #"+i+": INSOMNIA");
				continue;
			}
			Set<Integer> numbers = new HashSet<Integer>();
			for(int num = 0 ; num < 10 ; num++){
				numbers.add(num);
			}
			long product= n;
			int multiplier = 1;
			while(!numbers.isEmpty()){
				product = multiplier * n;
				multiplier++;
				String s = Long.toString(product);
				for(char c : s.toCharArray()){
					numbers.remove((int)(c-'0'));
				}
			}
			System.out.println("Case #"+i+": "+product);
		}
	}
}
