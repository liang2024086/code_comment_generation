package methodEmbedding.Cookie_Clicker_Alpha.S.LYD597;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CookieClickerAlpha {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:/Users/msanghvi/Desktop/Code_Jam_Inputs/CookieClicker_small_practice.in");
		BufferedReader bufferedReader = new BufferedReader(file);
		String line = null;
		System.out.println("No of Cases: "+bufferedReader.readLine());
		
		File outputFile = new File("C:/Users/msanghvi/Desktop/Code_Jam_Outputs/CookieClicker_small_practice_output.txt");
		FileWriter outputFileWriter = new FileWriter(outputFile);
		BufferedWriter outputWriter = new BufferedWriter(outputFileWriter);
		
		int i=1, caseNo=0;

		while((line = bufferedReader.readLine()) != null) {
			
			switch(i) {
			
			case 1: System.out.println("C F X:"+line);
					double timeWaited = 0;
					double c=-1,f=-1,x=-1;
					double r=2;
					c=Double.parseDouble(line.split(" ")[0]);
					f=Double.parseDouble(line.split(" ")[1]);
					x=Double.parseDouble(line.split(" ")[2]);
					++caseNo;
					
					while(true){
						
						double reachXWithR = x/r;
						double reachXWithRF = x/(r+f);
						double reachCWithR = c/r;
						System.out.println("Time:"+timeWaited);
						System.out.println("R:"+r);
						System.out.println("XR:"+reachXWithR);
						System.out.println("XRF:"+reachXWithRF);
						System.out.println("CR:"+reachCWithR);
						if(timeWaited+reachXWithRF+reachCWithR < timeWaited+reachXWithR) {
							
							r += f;
							timeWaited += reachCWithR;
							
						}
						else {
							
							timeWaited += reachXWithR;
							break;

						}
						
					}
					System.out.println("Case #"+caseNo+": "+timeWaited);
					outputWriter.write("Case #"+caseNo+": "+timeWaited);
					outputWriter.newLine();
					i=0;
					++i;
					
			}
		
			
		}
		bufferedReader.close();
		outputWriter.close();
	}

}
