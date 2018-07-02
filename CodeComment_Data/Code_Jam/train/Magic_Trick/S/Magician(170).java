package methodEmbedding.Magic_Trick.S.LYD639;

import java.io.*;


public class Magician {
	
	
	public static void main(String[] args) {
		int nrOfCases=0;
		int firstAnswer=0;
		int secondAnswer=0;
		int[] firstSelectedLine = new int[4];
		int[] secondSelectedLine = new int[4];
		
		try{
			//Preparing input
			FileInputStream input = new FileInputStream ("C:\\Users\\tparidae\\Documents\\Magician.txt");
			DataInputStream in = new DataInputStream(input);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String tempLine;
			String[] parts;
			// read number of testcases
			tempLine=br.readLine();
			System.out.println();
			nrOfCases=Integer.parseInt(tempLine);
			//For each case, process values
			for (int i=0;i<nrOfCases;i++){
				tempLine=br.readLine();
				//parse the line number
				firstAnswer=Integer.parseInt(tempLine);
				//read the 4 lines of the arrangement, parse only the selected line
				for(int j=0;j<4;j++){
					tempLine=br.readLine();
					if(j==firstAnswer-1){
						parts=tempLine.split(" ");
						for (int k=0;k<4;k++)
							firstSelectedLine[k]=Integer.parseInt(parts[k]);
					}
				}
				//parse the line number
				tempLine=br.readLine();
				//read the 4 lines of the arrangement, parse only the selected line
				secondAnswer=Integer.parseInt(tempLine);
				for(int j=0;j<4;j++){
					tempLine=br.readLine();
					if(j==secondAnswer-1){
						parts=tempLine.split(" ");
						for (int k=0;k<4;k++)
							secondSelectedLine[k]=Integer.parseInt(parts[k]);
					}
				}
				//compare the selected lines, if a match is found it is saved in the match variable
				//if a 2nd match is found, the multiMatch boolean is set to true and comparing is stopped
				int match = 0;
				boolean multiMatch = false;
				for (int j=0;j<4;j++){
					for (int k=0;k<4;k++)
						if (firstSelectedLine[j]==secondSelectedLine[k]){
							if (match==0)
								match=firstSelectedLine[j];
							else {
								multiMatch=true;
								j=4;k=4;
							}
						}
				}
				//The requested output
				if (multiMatch==true)
					System.out.println("Case #"+(i+1)+": Bad Magician!");
				else if (match==0)
					System.out.println("Case #"+(i+1)+": Volunteer cheated!");
				else System.out.println("Case #"+(i+1)+": "+match);
			}		
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
		
		

	}

}
