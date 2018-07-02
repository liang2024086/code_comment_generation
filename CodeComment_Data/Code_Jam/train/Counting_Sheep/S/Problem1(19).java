package methodEmbedding.Counting_Sheep.S.LYD476;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		String outPath="D:\\codejam\\prblem1\\out\\";
		String inpath="D:\\codejam\\prblem1\\in\\";
		String inFileName = inpath+"A-small-attempt0.in";
		String outFileName = outPath+"A-small-attempt0.out";
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(inFileName)));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(outFileName));
		
		int noTestCase = Integer.parseInt(bufferedReader.readLine());
		
		
		for(int testCase=0;testCase<noTestCase;testCase++){
			
			String result = "";//+testCase;
			String orgNumber = bufferedReader.readLine();
			
			List<Integer> lstOrgNumber = new ArrayList<Integer>();
			List<Integer> lstNewNumber = new ArrayList<Integer>();
			Map<Integer, Object> countedNumber = new HashMap<Integer, Object>();
			int numberCounted = 0;
			int counter =1;
			
			
			for(int i=orgNumber.length();i>0;i--){
				Integer number = Integer.parseInt(""+orgNumber.charAt(i-1));
				lstOrgNumber.add(number);
				lstNewNumber.add(number);
				if( countedNumber.get(number) == null){
					countedNumber.put(number, new Object());
					numberCounted++;
				}
				
			}
			
			boolean  onlyZero = true;
			for( int i= 0;i<lstOrgNumber.size();i++){
				if( lstOrgNumber.get(i).intValue() > 0){
					onlyZero = false;
					break;
				}
					
			}
			
			while( numberCounted < 10 && !onlyZero){
				counter++;
				int qts = 0;
				List<Integer> lstTempNewNbr = new ArrayList<Integer>();
				for(int i=0;i<lstOrgNumber.size();i++){
					
					int val = (counter * lstOrgNumber.get(i))+qts;
					Integer mod = new Integer(val%10);
					lstTempNewNbr.add(mod);
					qts = val/10;
					if( countedNumber.get(mod) == null){
						countedNumber.put(mod, new Object());
						numberCounted++;
					}
					
					if( i == (lstOrgNumber.size()-1) ){
						while(qts > 0){
							Integer mod1 = new Integer(qts%10);
							lstTempNewNbr.add(mod1);
							if( countedNumber.get(mod1) == null){
								countedNumber.put(mod1, new Object());
								numberCounted++;
							}
							qts = qts/10;
							
						}
					}
					
				}
				lstNewNumber = lstTempNewNbr;								
			}
				
			
			
			if( onlyZero){
				result = "INSOMNIA";
			}
			else{
			for(int i=lstNewNumber.size();i>0;i--){
				result = result+lstNewNumber.get(i-1).intValue();
			}
			}
			
			
			
			
			
			
			bufferedWriter.write("Case #"+(testCase+1)+": "+result);
			if( testCase+1 < noTestCase)
				bufferedWriter.write("\n");
			bufferedWriter.flush();
			
		}
		

	}

}
