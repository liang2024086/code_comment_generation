package methodEmbedding.Magic_Trick.S.LYD1698;


import java.io.BufferedReader;
import java.util.Set;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import static com.magic.codejam.collect.MoreCollects.sizeOne;
import static com.magic.codejam.io.MoreFunctions.INT_PARSER;
import static com.magic.codejam.util.StringUtil.splitParse;

public class QualificationRound {
	
	public static void main(String ... args){
		ScenarioContainer handler = new ScenarioContainer(){

			private final Splitter spaceSplitter = Splitter.on(" ");
			
			@Override
			public String processScenario(BufferedReader br) {
				try{
					
					int firstIndex = Integer.parseInt(br.readLine());
					Set<Integer> firstSet=null;
					Set<Integer> secondSet=null;
					
					for (int i = 1 ; i < 5; i++){
						String line = br.readLine();
						if (i != firstIndex){
							continue;
						}
						firstSet = splitParse(line, INT_PARSER, Sets.<Integer>newHashSet());
					}
					int secondIndex = Integer.parseInt(br.readLine());
					
					for (int i = 1 ; i < 5; i++){
						String line = br.readLine();
						if (i != secondIndex){
							continue;
						}
						secondSet = splitParse(line, INT_PARSER, Sets.<Integer>newHashSet());
					}
					
					Set<Integer> intersect = Sets.intersection(firstSet, secondSet);
					
					return intersect.isEmpty() ? "Volunteer cheated!":
							sizeOne(intersect) ? Iterables.getOnlyElement(intersect).toString()
											   : "Bad magician!";
				} catch (Exception e){
					
				}
				return "";
				
				
			}
		};
		handler.processInput("C:/JavaPgms/A-small-attempt1.in");
	}

}
