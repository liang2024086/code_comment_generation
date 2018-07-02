package methodEmbedding.Counting_Sheep.S.LYD88;

import java.io.*;
import java.math.*;
import java.util.*;

public class DigitTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner((Readable) new BufferedReader(new InputStreamReader(System.in)));
		Scanner scan = null;
		try {
			scan = new Scanner(new File("A-small-attempt1.in"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    int t = scan.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
	    //int t=5;
		int allcheck=0;
	    int invalue=0;
	    int round=0;
	    String tString,writeString;
	    boolean[] sleepSwitch=new boolean[10];
	    FileWriter fw = null;
		try {
			fw = new FileWriter("output");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
	    for(int i=0;i<t;i++){
	    	for(int j=0;j<10;j++){
		    	sleepSwitch[j]=false;
		    }
	    	invalue=scan.nextInt();
	    	if(invalue==0){
	    		//System.out.println("Case #"+(i+1)+": "+"INSOMNIA");
	    		writeString="Case #"+(i+1)+": "+"INSOMNIA\n";
	    		try {
					bw.write(writeString);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		continue;
	    	}
	    	
	    	BigInteger x=new BigInteger(Integer.toString(invalue));
	    	BigInteger y=new BigInteger(Integer.toString(0));
	    	
	    	
	    	while(allcheck!=10){
	    		round++;
	    		y=y.add(x);
	    		
	    		tString=y.toString();
	    		//System.out.println(tString);
	    		for(int k=0;k<10;k++){
	    			if(tString.contains(Integer.toString(k))){
	    				sleepSwitch[k]=true;
	    			}
	    		}
	    		allcheck=0;
	    		for(int k=0;k<10;k++){
	    			if(sleepSwitch[k]==true){
	    				allcheck++;
	    			}
	    		}
	    	}
	    	writeString="Case #"+(i+1)+": "+y.toString()+"\n";
	    	try {
				bw.write(writeString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	//System.out.println("Case #"+(i+1)+": "+y.toString());
	    	round=0;
	    	for(int j=0;j<10;j++){
		    	sleepSwitch[j]=false;
		    }
	    	allcheck=0;
	    }
	    
	    try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
