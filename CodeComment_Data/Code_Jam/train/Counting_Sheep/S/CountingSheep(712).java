package methodEmbedding.Counting_Sheep.S.LYD22;

import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class CountingSheep {

	public static void main(String[] args) {		
		FileInputStream fis = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        String sCurrentLine;
		int rem;
		BigInteger temp = new BigInteger("0");
		BigInteger temp2 = new BigInteger("0");
		BigInteger zero = new BigInteger("0");
		BigInteger stepper = new BigInteger("1");
		BigInteger ten = new BigInteger("10");
		try 
		{
			fis = new FileInputStream("A-small-attempt0.in");
            br = new BufferedReader(new InputStreamReader(fis));
			sCurrentLine = br.readLine().trim();
			int numTest = Integer.parseInt(sCurrentLine);		
			File file = new File("output.out");
			if (!file.exists()) {
			     file.createNewFile();
			  }
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(int i = 1; i <= numTest; i++){
				BigInteger number = new BigInteger(br.readLine().trim());
				BigInteger multiplier = new BigInteger("1");
				long[] digits = {0,0,0,0,0,0,0,0,0,0};
				if(number.equals(zero)){
					//System.out.println("Case #" + i + ": " + "INSOMNIA");
					bw.write("Case #" + i + ": " + "INSOMNIA");
					if(i != numTest)
						bw.newLine();
				}
				else{
					while(digits[0] == 0 || digits[1] == 0 || digits[2] == 0 || digits[3] == 0 || digits[4] == 0 || digits[5] == 0 || digits[6] == 0 || digits[7] == 0 || digits[8] == 0 || digits[9] == 0){
						temp = new BigInteger(number.multiply(multiplier).toString());
						temp2 = new BigInteger(temp.toString());
						while(! temp2.equals(zero)){
							rem = temp2.remainder(ten).intValueExact();
							temp2 = temp2.divide(ten);
							digits[rem] += 1;
						
						}
						multiplier = multiplier.add(stepper);
					}
					//System.out.println("Case #" + i + ": " + temp.toString());
					bw.write("Case #" + i + ": " + temp.toString());
					if(i != numTest)
						bw.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally{
			 try{
			      if(bw!=null)
			    	  bw.close();
			      if(br!=null)
			    	  br.close();
			   }catch(Exception ex){
				   
			    }
		}
	}

}
