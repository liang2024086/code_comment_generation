package methodEmbedding.Counting_Sheep.S.LYD1111;

import java.util.*;
import java.lang.*;
import java.io.*;

class ProblemA
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int lineNum = 0;
        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("a-output.txt", "UTF-8");
 
        while(input.hasNext()){
            String line = input.nextLine(); 
            lineNum++;
            if(lineNum >  1){
                
                writer.print("Case #" + (lineNum-1) + ": ");
                int N = Integer.parseInt(line);
            	//System.out.println(N);
                int ubound = Integer.MAX_VALUE;
                ArrayList<String> digits = new ArrayList<String>();
                List<String> digitsL = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
                digits.addAll(digitsL);
                if(N > 0) {
                    for(int i = 1; i < ubound; i++) {
                        long value = N * i;
                        String strValue = Long.toString(value);
                        //System.out.println(strValue);
                        for (int j = 0; j < strValue.length(); j++){
                            String c = strValue.substring(j, j + 1);
                            //System.out.println(c);
                            if(digits.contains(c)) {
                                digits.remove(c);
                            }
                        }
                        
                        if(digits.isEmpty()) {
                            writer.print(strValue);
                            break;
                        } 
                    }
                }
                if(!digits.isEmpty()){
                    writer.print("INSOMNIA");
                }
            }
            writer.println();               
        }

        writer.close();

	}
}
