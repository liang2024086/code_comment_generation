package methodEmbedding.Counting_Sheep.S.LYD106;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;


public class hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	TreeSet<Integer> list1 = new TreeSet<Integer>();
		for(int i =0;i<10;i++)
			list1.add(i);
	BufferedReader br = null;
	      try {
	     br = new BufferedReader(new FileReader("A-small-attempt2.in"));                                                                                                                                                                                                 
  	     PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
	String t = br.readLine();
	int t1 =Integer.parseInt(t);
	for(int i =1;i<=t1;i++)
	{
		String l = br.readLine();
		int n = Integer.parseInt(l);
		if(n==0){writer.println("Case #"+i+": Insomnia"); continue;}
		int temp;
		int rem;
		TreeSet<Integer> list = new TreeSet<Integer>();
		
		for(int j = 1;j<100;j++){
			int temp1 = n*j;
		temp = n*j;
		while(temp>0){
			rem = temp%10;
			temp/=10;
			if(!list.contains(rem)){
				list.add(rem);
			}
			if(list.equals(list1))
					{writer.println("Case #"+i+": "+temp1);
					j=100;
					break;
					}
		}
	}}
		br.close();
		writer.close();
	}catch(IOException e){
	      System.out.print("Exception");
	   }	
	      }

}
