package methodEmbedding.Counting_Sheep.S.LYD182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CountingSheep {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        BigInteger T = null;
        try {
			T = new BigInteger(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        for(int i=1;i<=T.intValue();i++){
        	//System.out.print("Case "+i);
        	int[] seen = new int[10];
        	boolean found_all = false;
        	BigInteger input = null;
        	try {
				input = new BigInteger(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	if(input.compareTo(new BigInteger("0"))==0){
        		System.out.println("case #"+i+": INSOMNIA");
        		continue;
        	}
        	BigInteger count = new BigInteger("1");
        	BigInteger temp = null;
        	BigInteger done = new BigInteger("0");
    		while(!found_all){
    			input = input.multiply(count);
    			temp = input;
    			while(temp.divide(new BigInteger(Integer.toString(10))).compareTo(new BigInteger(Integer.toString(0)))!=0){
    				//System.out.println((temp.remainder(new BigInteger("10"))).intValue());
    				if(seen[(temp.remainder(new BigInteger("10"))).intValue()]==0){
    					seen[(temp.remainder(new BigInteger("10"))).intValue()] = 1;
    					done = done.add(new BigInteger("1"));
    				}
    				temp = temp.divide(new BigInteger("10"));
    			}
    			//System.out.println((temp.remainder(new BigInteger("10"))).intValue());
    			if(seen[(temp.remainder(new BigInteger("10"))).intValue()]==0){
					seen[(temp.remainder(new BigInteger("10"))).intValue()] = 1;
					done = done.add(new BigInteger("1"));
				}
    			
    			if(done.compareTo(new BigInteger("10"))==0){
    				System.out.println("case #"+i+": "+input.intValue());
    				found_all = true;
    				break;
    			}
    			input = input.divide(count);
    			count = count.add(new BigInteger("1"));
    		}
        }
	}
}
