package methodEmbedding.Counting_Sheep.S.LYD645;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CountSheep {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("A-small-attempt0.in");
		BufferedWriter out = new BufferedWriter(new FileWriter("output.in"));
		BufferedReader is = new BufferedReader(new FileReader(file));
		String n0_test1 = is.readLine();
		String s;
		int no_test =  Integer.parseInt(n0_test1);
		for(int i=1;i<=no_test;++i){
		  String ip1 = is.readLine();
		  int ip = Integer.parseInt(ip1);
		  Set<Integer> test = new HashSet<Integer>();
		  if(ip==0){
			  out.write("Case #"+i+": ");
			  out.write("INSOMNIA");
			  out.newLine();
		  }
		  else{
			  int j=1;
			  while(j>0){
				int temp =ip*j;
				while(temp>0){
					int digit = temp%10;
					test.add(digit);
					if(test.size()>=10){
						break;
					}
					temp = temp/10;
				}
				if(test.size()==10){
					s = "Case #"+i+": "+ip*j;
					out.write(s);
					out.newLine();
					break;
				}
				j=j+1;  
			  }
			  
		  }
		}	
		is.close();
        out.close();
	}

}
