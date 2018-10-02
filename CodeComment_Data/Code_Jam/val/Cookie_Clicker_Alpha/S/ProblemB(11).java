package methodEmbedding.Cookie_Clicker_Alpha.S.LYD986;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ProblemB {
	
	public static void main(String[] args) {
		BufferedReader reader = null;
		
		BufferedOutputStream printer = new BufferedOutputStream(System.out);
		byte[] newLineCharacter = System.lineSeparator().getBytes();
		byte[] caseString = "CASE #".getBytes();
		byte[] colon = ": ".getBytes();
		
		try{
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])));
			
			int testCase = Integer.parseInt(reader.readLine());
			
			for(int i=1;i<=testCase;i++){
				
				String[] input = reader.readLine().split(" ");
				Double C = Double.parseDouble(input[0]);
				Double F = Double.parseDouble(input[1]);
				Double X = Double.parseDouble(input[2]);
				
				Double currentRate = 2.0;
				Double totalNoSeconds = 0.0;
				
				Double timeWithoutFarm = totalNoSeconds + X/currentRate;
				Double timeWithFarm = totalNoSeconds + C/currentRate + X/(currentRate+F);
				
				while((timeWithoutFarm-timeWithFarm)>0.0000001){
					totalNoSeconds+=C/currentRate;
					currentRate+=F;
					timeWithoutFarm = totalNoSeconds + X/currentRate;
					timeWithFarm = totalNoSeconds + C/currentRate + X/(currentRate+F);
				}
				totalNoSeconds+=X/currentRate;
				
				printer.write(caseString);printer.write(Integer.valueOf(i).toString().getBytes());printer.write(colon);
				printer.write(String.format("%.7f", totalNoSeconds.doubleValue()).getBytes());
				printer.write(newLineCharacter);
			}
			
			printer.flush();
			reader.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
