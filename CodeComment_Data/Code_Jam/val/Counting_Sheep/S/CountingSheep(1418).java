package methodEmbedding.Counting_Sheep.S.LYD1223;

/**
 * Neeraj Vyas
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {
	
	
	public static void main(String args[]){

		BigInteger int1= new BigInteger("1000000000000").multiply(new BigInteger("245")) ;
		System.out.println(int1);
		
	
		Set<String> allDigits = new HashSet<String>();
		allDigits.add("0");
		allDigits.add("1");
		allDigits.add("2");
		allDigits.add("3");
		allDigits.add("4");
		allDigits.add("5");
		allDigits.add("6");
		allDigits.add("7");
		allDigits.add("8"); 
		allDigits.add("9"); 
		
		try {
			FileReader fileReader = new FileReader(new File(args[0]));
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			Integer numOfTestCases = Integer.parseInt(bufferedReader.readLine());
			for(int i=0;i<numOfTestCases;i++){
				
				
				BigInteger number  = new BigInteger(bufferedReader.readLine());
				
				if(number.intValue() ==0){
					System.out.println("Case #" + (i+1)+": " + "INSOMNIA");
					continue;
				}
				
				Set<String> remainingDigits = new HashSet<String>(); 
				remainingDigits.addAll(allDigits);
				int multiplier = 1; 
				Long counter = 1l; 
				while(remainingDigits.size()>0){
					BigInteger newNumber = number.multiply(new BigInteger(""+multiplier++));
					String numberStr = newNumber.toString();
					Set<String> digitsFound = new HashSet<String>(); 
					for(String digit:remainingDigits){ 
						if(numberStr.contains(digit)){
							digitsFound.add(digit);
						} 
					}
					remainingDigits.removeAll(digitsFound);
					
					if(remainingDigits.size()==0){
						System.out.println("Case #" + (i+1)+": " + newNumber.intValue());
						break;
					}
					
					counter++;
					
					//assuming will find all digits within 100K multiplication, program will fail otherwise 
					if(counter > 100000){
						System.out.println("Case #" + (i+1)+": " + "INSOMNIA");
						break;
					}
				}
				
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
