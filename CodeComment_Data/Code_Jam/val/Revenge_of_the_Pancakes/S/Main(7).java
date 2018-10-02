package methodEmbedding.Revenge_of_the_Pancakes.S.LYD222;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//args[0] should contain the 'in' file location
		String path = null;
		if(args.length == 0){
			System.out.println("In file required");
			System.exit(0);
		}
		path = args[0];
		
		try{
			List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
			//Total number of cases
			Integer N = Integer.parseInt(lines.get(0));
			for(int pos=1; pos<=N; pos++){
				StringBuffer output = new StringBuffer();
				output.append("Case #"+pos+": ");
				String orignalString = lines.get(pos);
				Integer tries = 0;
				while(orignalString.contains("-")){
					Integer lastBlankPos = orignalString.lastIndexOf('-');
					//System.out.println(orignalString);
					String stackStr;
					String restStr = null;
					//System.out.println(lastBlankPos);
					if(orignalString.length() == (lastBlankPos+1)){
						stackStr = orignalString;
					}
					else{
						stackStr = orignalString.substring(0, lastBlankPos+1);
						restStr = orignalString.substring(lastBlankPos+2);
					}
					//Swap the stack
					//System.out.println("orig "+stackStr);
					stackStr = stackStr.replace('-', '*');
					//System.out.println("first "+stackStr);
					stackStr = stackStr.replace('+', '-');
					stackStr = stackStr.replace('*', '+');
					//concat the stack
					if(orignalString.length() == (lastBlankPos+1)){
						orignalString = stackStr;
					}
					else{
						orignalString = stackStr + restStr;
					}
					
					
					tries = tries + 1;
					
				}
				output.append(tries);
				System.out.println(output);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
