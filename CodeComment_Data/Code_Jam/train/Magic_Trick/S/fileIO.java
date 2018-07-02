package methodEmbedding.Magic_Trick.S.LYD886;

import java.io.*;

public class fileIO {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileIn = "d:\\A-small-attempt0.in";
		String badMagician = "Bad magician!";
		String cheatingVolunteer = "Volunteer cheated!";
		String fileOut = "d:\\tempOut.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileIn);
			FileWriter fileWriter =
                new FileWriter(fileOut);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
				
			int loopCount = Integer.parseInt(bufferedReader.readLine());
			System.out.println(loopCount+"");
			
			for(int i=0;i<loopCount;i++){
				int[][] first = new int[4][4];
				int [][] second = new int[4][4];
				int firstRow = 0;
				int secondRow = 0;
				/*Read First Matrix*/
				String firstRowString = bufferedReader.readLine();
				System.out.println(firstRowString);
				firstRow = Integer.parseInt(firstRowString);
				firstRow--;
					for(int j=0;j<4;j++){
						String input = bufferedReader.readLine();
						String[] strArray = input.split(" ");
						for(int f = 0; f < 4; f++) {
							first[j][f] = Integer.parseInt(strArray[f]);
						}
					}			
			/*Read Second Matrix*/
			secondRow = Integer.parseInt(bufferedReader.readLine());
			secondRow--;
					for(int h=0;h<4;h++){
						String input2 = bufferedReader.readLine();
						String[] strArray2 = input2.split(" ");
							for(int g =0;g<4;g++){
								second[h][g] = Integer.parseInt(strArray2[g]);
							}
					}
			int ncount = 0;
			int temp =0;
					for(int m=0;m<4;m++)
					{ 
						for(int j=0;j<4;j++)
						{
							if( first[firstRow][m]==second[secondRow][j] )
							 {System.out.println(first[firstRow][m]+"=="+second[secondRow][j]);
								ncount++;
								temp=first[firstRow][m];
							}
						}
					}

            // Always wrap FileWriter in BufferedWriter.

				/*Case #1: 7
				Case #2: Bad magician!
				Case #3: Volunteer cheated!		*/
			int casei = i+1;
			if(ncount==1){
			bufferedWriter.write("Case #"+casei+": "+temp);
			}
			else if(ncount==0){
			bufferedWriter.write("Case #"+casei+": "+"Volunteer cheated!");
			}
			else if(ncount>1){
			bufferedWriter.write("Case #"+casei+": "+"Bad magician!");
			}
			if(i<loopCount-1){
					System.out.println(i+"");
					bufferedWriter.newLine();
			 }
			/* while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }	*/
		}
            // Always close files.
            bufferedReader.close();	
            bufferedWriter.close();			
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileIn + "'");				
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileIn + "'");					
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		

    }
}
