package methodEmbedding.Counting_Sheep.S.LYD1678;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sheeps {

	public static void main(String[] args) {
		 Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		  int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		  List<String> digitList = new ArrayList<String>();
		  List<String> constDigitList = new ArrayList<String>();
		  for(int i =0;i<10;i++){
		  digitList.add(Integer.toString(i));
		  }
		  constDigitList.addAll(digitList);
		    for (int i = 1; i <= t; ++i) {
		      int n = in.nextInt();
		      boolean seenAll = false;
		      int index= 1;
			while(!seenAll){
				int newNumber = n*index;		
				if(newNumber==0){
					System.out.println("Case #" + i + ": INSOMNIA");
					break;
				}
				  String[] result = (Integer.toString(newNumber)).split("");
		             for ( int x=0; x<result.length; x++) {
//		                 System.out.println(result[x] + "\n");
		                 if(digitList.indexOf(result[x])!=-1){
		                	 digitList.remove(digitList.indexOf(result[x]));
		                 }
		             }
		             if(digitList.size()==0){
//		            	 System.out.println("Last number is : "+newNumber);
		            	 System.out.println("Case #" + i + ": " + newNumber);
		            	 digitList.addAll(constDigitList);
		             seenAll = true;
		             }
				index++;
		      }		      
		     
		    }

	}

}
