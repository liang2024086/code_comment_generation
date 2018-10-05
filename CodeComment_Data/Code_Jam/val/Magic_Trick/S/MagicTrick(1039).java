package methodEmbedding.Magic_Trick.S.LYD1682;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class MagicTrick {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("C:/Users/msanghvi/Desktop/Code_Jam_Inputs/Magictrick_small_practice.in");
		BufferedReader bufferedReader = new BufferedReader(file);
		String line = null;
		System.out.println("No of cases: "+bufferedReader.readLine());
		
		File outputFile = new File("C:/Users/msanghvi/Desktop/Code_Jam_Outputs/Magictrick_small_practice_output.txt");
		FileWriter outputFileWriter = new FileWriter(outputFile);
		BufferedWriter outputWriter = new BufferedWriter(outputFileWriter);
		
		int i=1, caseNo=0;
		int firstAnswer =1, secondAnswer=-1;
		int arrangement1[][] = new int[4][4];
		int arrangement2[][] = new int[4][4];
		
		while((line = bufferedReader.readLine()) != null) {
			
			switch(i) {
			
			case 1: System.out.println("First Answer:"+line);
					firstAnswer=Integer.parseInt(line);
					++i;
					++caseNo;
					break;
					
			case 2: System.out.print("First Arrangement First row:");
					for(int x=0;x<4;++x) {
						arrangement1[0][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement1[0][x]+" ");
					}
					System.out.println("");
					++i;
					break;
			
			case 3: System.out.print("First Arrangement Second row:");
					for(int x=0;x<4;++x) {
						arrangement1[1][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement1[1][x]+" ");
					}
					System.out.println("");
					++i;
					break;
					
			case 4: System.out.print("First Arrangement Third row:");
					for(int x=0;x<4;++x) {
						arrangement1[2][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement1[2][x]+" ");
					}
					System.out.println("");
					++i;
					break;
			
			case 5: System.out.print("First Arrangement Fourth row:");
					for(int x=0;x<4;++x) {
						arrangement1[3][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement1[3][x]+" ");
					}
					System.out.println("");
					++i;
					break;
			
			case 6: System.out.println("Second Answer:"+line);
					secondAnswer=Integer.parseInt(line);
					++i;
					break;
					
			case 7: System.out.println("Second Arrangement First row:");
					for(int x=0;x<4;++x) {
						arrangement2[0][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement2[0][x]+" ");
					}
					++i;
					break;
	
			case 8: System.out.println("Second Arrangement Second row:");
					for(int x=0;x<4;++x) {
						arrangement2[1][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement2[1][x]+" ");
					}
					++i;
					break;
			
			case 9: System.out.println("Second Arrangement Third row:");
					for(int x=0;x<4;++x) {
						arrangement2[2][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement2[2][x]+" ");
					}
					++i;
					break;
	
			case 10: System.out.println("Second Arrangement Fourth row:");
					for(int x=0;x<4;++x) {
						arrangement2[3][x] = Integer.parseInt(line.split(" ")[x]);
						System.out.print(arrangement2[3][x]+" ");
					}
					int count = 0;
					int number = -1;
					for(int x=0;x<4;++x) {
						for(int y=0;y<4;++y) {
							if(arrangement1[firstAnswer-1][x] == arrangement2[secondAnswer-1][y]) {
								++count;
								number = arrangement1[firstAnswer-1][x];
							}
						}
					}
					
					if(count == 0) {
						System.out.println("Case #"+caseNo+": Volunteer cheated!");
						outputWriter.write("Case #"+caseNo+": Volunteer cheated!");
						outputWriter.newLine();
					}
					else if(count > 1) {
						System.out.println("Case #"+caseNo+": Bad magician!");
						outputWriter.write("Case #"+caseNo+": Bad magician!");
						outputWriter.newLine();
					}
					else {
						System.out.println("Case #"+caseNo+": "+number);
						outputWriter.write("Case #"+caseNo+": "+number);
						outputWriter.newLine();
					}
					i=0;
					++i;
					break;
					
			
			
			}
		}

		bufferedReader.close();
		outputWriter.close();

	}

}
