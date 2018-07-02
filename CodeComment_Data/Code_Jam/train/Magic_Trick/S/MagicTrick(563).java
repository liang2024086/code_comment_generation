package methodEmbedding.Magic_Trick.S.LYD1503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTrials = Integer.parseInt(br.readLine());
		for(int i = 1; i <= numTrials; i++){
			int guess1 = Integer.parseInt(br.readLine());
			String[] rowHelper;
			Set<Integer> firstRunSuccesses = new HashSet<Integer>();
			for(int j = 0; j < 4; j++){
				rowHelper = br.readLine().split("\\s");
				if(j == guess1-1){
					for(String num: rowHelper){
						firstRunSuccesses.add(Integer.parseInt(num));
					}
				}
			}
			Set<Integer> secondRunSuccesses = new HashSet<Integer>(){
				/**
				 * 
				 */
				private static final long serialVersionUID = -3380381736123764630L;

				@Override
				public String toString(){
					return this.toArray()[0].toString();
					
				}
			};
			int guess2 = Integer.parseInt(br.readLine());
			for(int j = 0; j < 4; j++){
				rowHelper = br.readLine().split("\\s");
				if(j == guess2-1){
					for(String num:rowHelper){
						if(firstRunSuccesses.contains(Integer.parseInt(num))){
							secondRunSuccesses.add(Integer.parseInt(num));
						}
					}
				}
			}
			if(secondRunSuccesses.size()==0){
				System.out.println("Case #"+i+": Volunteer cheated!");
			} else if (secondRunSuccesses.size()==1){
				System.out.println("Case #"+i+": "+secondRunSuccesses);
			} else	{
				System.out.println("Case #"+i+": Bad magician!");
			}
		}
	}
}
