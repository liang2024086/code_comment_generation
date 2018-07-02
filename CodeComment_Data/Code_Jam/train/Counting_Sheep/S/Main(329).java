package methodEmbedding.Counting_Sheep.S.LYD1532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testcases=Integer.parseInt(br.readLine());
		System.out.println(testcases);
		int cases=1;
		int i=1;
		while(testcases>=cases){
			
			Set<Character> set=new HashSet<Character>();
			String input=br.readLine();
			if(input.equals("0")){
				System.out.println("Case #"+cases+": INSOMNIA");
				cases++;
				continue;
			}
			String nextInput=input;
			while(set.size()!=10){
				
				for(Character c:nextInput.toCharArray())
				set.add(c);
				int nextInt=Integer.parseInt(input)*(i+1);
				if(set.size()==10){
					break;
				}
				nextInput=nextInt+"";
				i++;
				
			}
			System.out.println("Case #"+cases+": "+nextInput);
			cases++;
			i=1;
		}
	}

}
