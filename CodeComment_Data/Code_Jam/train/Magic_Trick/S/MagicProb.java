package methodEmbedding.Magic_Trick.S.LYD1182;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;

public class MagicProb {
	
	public static void main(String[] args) throws FileNotFoundException {
		//File f = new File ("C:\\Users\\Priya\\Downloads\\B-large-practice.in");
	        Scanner sc = new Scanner(new FileReader("C:\\Users\\Public\\Documents\\testData\\A-small-attempt0.in"));
	        PrintWriter pw = new PrintWriter("C:\\Users\\Public\\Documents\\testData\\test.out");
	        int n = sc.nextInt();
	        
	        for (int c = 0; c < n; c++) {
	        	
	        	
	            pw.print("Case #" + (c + 1) + ": ");
	            
	            String temp;
	            String[] arr;int j ;int num;int result = 0;
	            boolean multipleResult = false;
	            BitArray arrDigit = new BitArray(16);
	            
	            int rowNumOfFirstSet = sc.nextInt();
	            sc.nextLine();

	            for (j = 1; j <= 4;j++){
	            	temp = sc.nextLine();

	            	if (j == rowNumOfFirstSet){
			           	arr = temp.split(" ");
			           	if (arr.length == 4){
			           		 	for (int k = 0; k<4 ; k++){
			           			arrDigit.setBit(Integer.parseInt(arr[k]));
			           		}
			           	}
	            	}
	            }
	            
	            int rowNumOfSecondSet = sc.nextInt();
	            sc.nextLine();
	            for (j = 1; j <= 4;j++){
	            	temp = sc.nextLine();
	            	if (j == rowNumOfSecondSet){
			           arr = temp.split(" ");
			           if (arr.length == 4){
			     		
			           		for (int k = 0 ; k < 4  ; k++){
					          num = Integer.parseInt(arr[k]);
					           	if (arrDigit.getBit(num)){
					           		if (result == 0)
					           			result = num;
					           		else
					           			multipleResult = true;
					           	}else
					           		arrDigit.setBit(num);
					           		
			           		}
			           	}
	            	}
	            }
	    		if (result == 0)
	    			pw.print("Volunteer cheated!");
	    		else{
	    			
	    			if (multipleResult)
	    				pw.print("Bad magician!");
	    			else
	    				pw.print(result);

	    		}
	           	pw.println();
	        }
	        pw.flush();
	        pw.close();
	        sc.close();		
		}

}
