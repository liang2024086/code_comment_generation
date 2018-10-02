package methodEmbedding.Revenge_of_the_Pancakes.S.LYD758;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pancakes {
	public static void main(String[] args) throws NumberFormatException, IOException{
		int T,i=0,count=0;
		String S;
		List list=new ArrayList(); 
		File input=new File("C:/Users/Souryadeep/Downloads/B-small-attempt0.in");
		BufferedReader bufferedReader=new BufferedReader(new FileReader(input));
		T=Integer.parseInt(bufferedReader.readLine());
		while(i<T){
		 S=bufferedReader.readLine();
		 String[]string=S.split("");
		 Collections.addAll(list, string);
		 int index=list.lastIndexOf("-");
		 while(index!=-1){
			 for(int j=0;j<=index;j++){
				 if(list.get(j).equals("+")){
					 list.set(j, "-");
				 }else if(list.get(j).equals("-")){
					 list.set(j, "+");
				 }else{
					 System.out.print("");
				 }
			 }
			 index=list.lastIndexOf("-");
			 count++;
		 }
		 i++;
		 System.out.println("Case #"+i+": "+count);
		 count=0;
		 list.clear();
		}
	}
}
