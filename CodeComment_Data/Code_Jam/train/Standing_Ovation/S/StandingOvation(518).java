package methodEmbedding.Standing_Ovation.S.LYD272;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StandingOvation {

	public static void main(String[] args){
		String filePath = "/files/standingovation.txt";
		if(args.length > 0)
			filePath = args[0];
		
		List<String> lines = new ArrayList<String>();
		
		try {
			Files.lines(Paths.get(filePath)).forEach(s -> lines.add(s));
        } catch (IOException ex) {

        }
		
		boolean findingNumberCases = true;
		
		Case[] cases = null;
		int caseFillingIndex = 0;
		
		for(String line : lines) {
			if(line == null || line.isEmpty())
				continue;
			if(findingNumberCases){
				try{
					int numberCases = Integer.parseInt(line);
					cases = new Case[numberCases];
					findingNumberCases = false;
				}
				catch(Exception exp){
					
				}
			}
			else{
				try{
					String[] configurations = line.split(" ");
					Case _case = new Case();
					_case.maxShyness = Integer.parseInt(configurations[0]);
					_case.shynessLevelPersons = new int[_case.maxShyness+1];
					
					for(int i = 0; i <= _case.maxShyness; i++){
						_case.shynessLevelPersons[i] = Integer.parseInt(configurations[1].substring(i, i+1));
					}
					cases[caseFillingIndex++] = _case;
				}
				catch(Exception exp){
					
				}
			}
		}
		
		for(Case _case : cases){
			for(int i = 0; i < _case.shynessLevelPersons.length; i++){
				if(_case.shynessLevelPersons[i] <= 0)
					continue;
				if(_case.standupPersons >= i){
					_case.standupPersons += _case.shynessLevelPersons[i];
				}
				else{
					_case.result += i-_case.standupPersons;
					_case.standupPersons += i-_case.standupPersons;
					_case.standupPersons += _case.shynessLevelPersons[i];
				}
			}
		}
		
		for(int i = 0; i < cases.length; i++){
			Case _case = cases[i];
			System.out.println("Case #" + (i+1) + ": " + _case.result);
		}
	}
	
}
