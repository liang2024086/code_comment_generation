package methodEmbedding.Counting_Sheep.S.LYD1339;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QualProbA {
	public static void main(String[] args){		
		try {
			File file = new File("A-small-attempt1.in"); //test.txt for test
			Scanner in = new Scanner(file);
			PrintStream out = new PrintStream(new FileOutputStream("output.txt")); //output.txt for test
		    int next;
		    int caseNum = 5;
		    
		    next = in.nextInt();
		    caseNum = next;
		    for (int i=0; i<caseNum; i++) {
		    	String answer = "";
		    	ArrayList a = new ArrayList(Arrays.asList("0","1","2","3","4","5","6","7","8","9"));

		    	next = in.nextInt();
		    	if(next!=0) 
		    		for (int n=1; n<=1000000; n++){
		        	String value = ""+n*next;
		        	for(int k=0; k<value.length(); k++){
		        		String digit = value.substring(k,k+1);
		        		int index = a.indexOf(digit);
		        		if(index>=0){
		        			a.remove(index);
		        			if(a.isEmpty()) {
		        				answer=value;
		        				break;
		        			}	
		        		}
		        	}
		        	if (!answer.equals("")) break;
		        }
		    	if(answer.equals("")) answer = "INSOMNIA";
		    	System.out.println("Case #"+(i+1)+": "+answer);
		        out.println("Case #"+(i+1)+": "+answer);
		    }
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
