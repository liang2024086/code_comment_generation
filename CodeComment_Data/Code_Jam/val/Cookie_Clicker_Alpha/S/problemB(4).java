package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1385;

import java.io.*;
import java.text.*;

public class problemB {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileIn = "d:\\codejam\\B-small-attempt0.in";
		String fileOut = "d:\\codejam\\Bout.txt";

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
			double[] a = new double[3];
			
			/*main loop*/
			for(int i=0;i<loopCount;i++){
			    String input = bufferedReader.readLine();
				String[] strArray = input.split(" ");
					for(int j = 0; j < strArray.length; j++) {
						a[j] = Double.parseDouble(strArray[j]);
						//bufferedWriter.write(a[j]+" ")
					}	
					double c = a[0];
					double f = a[1];
					double x = a[2];
					double currentRate = 2.000000;
					//bufferedWriter.newLine();
					double seconds = 0.0;
					int casei=i+1;
					NumberFormat formatter = new DecimalFormat("#0.0000000");  
					if(x<=c)
					{	
						seconds=x/2.000000;
						bufferedWriter.write("Case #"+casei+": "+formatter.format(seconds));
					}
					else {
					//seconds = c/currentRate;
					  while(((x)/currentRate)>=((c/(currentRate))+(x/(currentRate+f)))){ //eger satmaq serf eleyirse
					    seconds=seconds+c/currentRate;
						currentRate=currentRate+f;					  
					  }
					  double seconds1 = seconds+x/(currentRate);
					  //double seconds2 = seconds + (x-c)/(currentRate+f);
					  //System.out.println("Seconds1: "+seconds1+" Seconds2: "+seconds2);
					   //seconds=seconds+c/currentRate;					  
					   //seconds=seconds+(x-c)/currentRate;
					   //System.out.println(" Final: Seconds: "+seconds1+" currentRate: "+currentRate);
						bufferedWriter.write("Case #"+casei+": "+formatter.format(seconds1));
					}
				if(i<loopCount-1){
					bufferedWriter.newLine();
			 }
			}
			/*end of main loop*/
			
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
