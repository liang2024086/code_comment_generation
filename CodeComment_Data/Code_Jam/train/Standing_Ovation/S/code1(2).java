package methodEmbedding.Standing_Ovation.S.LYD1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class codejam1 {

	

public static void main(String[] args) throws IOException {
	ArrayList<String> sm=new ArrayList<String>();
	  BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
	  int test_cases=Integer.parseInt(buff.readLine());
	  int tmp=0;
	  while(tmp<test_cases){
		
		 int count =0;
		 int row_count=0;
		  String[] max=buff.readLine().split(" ");
		  int max_input=Integer.parseInt(max[0]);
		
		  int i=0;
		  while(i<=max_input){
			
			
			
			  if(!(max[1].charAt(i)=='0')){
				
			  if(row_count<i){
				 
				  count=count+i-row_count;
				
				  row_count=count+row_count;
			  }
			  }
			  row_count=(int)(Character.getNumericValue(max[1].charAt(i)))+row_count;
			  i++;
		  }
		  int z=tmp+1;
		 sm.add( "Case #"+z+":"+" "+count);
		tmp++;
	  }
	 

	  for(String list :sm){
		  System.out.println(list);
	  }
}
}
