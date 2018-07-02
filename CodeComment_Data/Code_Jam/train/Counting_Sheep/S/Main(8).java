package methodEmbedding.Counting_Sheep.S.LYD1207;


import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
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
				String[] numbers = {"0","0","0","0","0","0","0","0","0","0"};
				Integer no = Integer.parseInt(lines.get(pos));
				Integer lastNumber = new Integer(no);
				if(no==0){
					output.append("INSOMNIA");
				}
				else{
					int tempNo = no;
					while(tempNo > 0){
						int remainder = tempNo %10;
						tempNo = tempNo/10;
						numbers[remainder] = "1";
					}
					int loop = 2;
					while(Arrays.asList(numbers).contains("0")){
							lastNumber = no*loop;
							loop++;
							int tempLastNo = lastNumber;
							while(tempLastNo > 0){
								int remainder = tempLastNo %10;
								tempLastNo = tempLastNo/10;
								numbers[remainder] = "1";
							}
					}
					output.append(lastNumber);
				}
				
				System.out.println(output);
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
