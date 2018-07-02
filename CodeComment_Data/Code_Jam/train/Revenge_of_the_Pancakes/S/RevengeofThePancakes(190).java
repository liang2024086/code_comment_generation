package methodEmbedding.Revenge_of_the_Pancakes.S.LYD427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RevengeofThePancakes {

	public static void main(String[] args) throws IOException{
		File file = new File("B-small-attempt2.in");
		BufferedWriter out = new BufferedWriter(new FileWriter("output.in"));
		BufferedReader is = new BufferedReader(new FileReader(file));
		String n0_test1 = is.readLine();
		String s;
		int no_test =  Integer.parseInt(n0_test1);
		for(int i=1;i<=no_test;++i){
		  String ip1 = is.readLine();
		  int j=0;
		  int count =0;
		  while(j<ip1.length()){
			  if(ip1.charAt(j)=='-'){
				if(j==ip1.length()-1){
				  count++;
				}
				else if(ip1.charAt(j+1)=='+'){
			      count++;
				}
			  }
			  if((ip1.charAt(j)=='+')&&(j<ip1.length()-1)&&(ip1.charAt(j+1)=='-')){
				  count++;
			  }
			  j++;
		  }
		  s = "Case #"+i+": "+count;
		  out.write(s);
		  out.newLine();
	  }
	  is.close();
	  out.close();

	}

}
