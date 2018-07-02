package methodEmbedding.Counting_Sheep.S.LYD1100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
public class Solution {
public static void main(String [] args)
{   HashMap<Character,Integer> hm;
try{
	BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\xyz\\Dropbox\\A-small-attempt0.in")));
    PrintWriter writer=new PrintWriter("C:\\Users\\xyz\\Dropbox\\output.txt","UTF-8");
    int count;
	Scanner sc= new Scanner(System.in);
	//int t=sc.nextInt();
	int t=Integer.parseInt(br.readLine());
	int iterate,caseno=0;
	boolean val;
	while(t>0)
	{ hm=new HashMap<Character,Integer>();
		t--;
		caseno++;
		iterate=0;
		count=0;
		//int number=sc.nextInt();
		int number=Integer.parseInt(br.readLine());
		val=false;
		while(true)
		{   
			iterate++;
			int n=number*iterate;
			if(iterate>1000000)
		    {
		    	System.out.println("Case #"+caseno+": INSOMNIA");
		    	writer.println("Case #"+caseno+": INSOMNIA");
		    	break;
		    }
		char [] num=String.valueOf(n).toCharArray();
		//System.out.println("Number is "+n);
		for(int i=0;i<num.length;i++)
		{   
			if(!hm.containsKey(num[i])){
				hm.put(num[i], 1);
				//System.out.println("Digits seen "+num[i]);
				count++;
			}
			if(count==10){
				System.out.println("Case #"+caseno+": "+n);
				writer.println("Case #"+caseno+": "+n);
				val=true;
				break;
			}
		}
		if(val==true)
		{
			break;
		}
		}
	}
	writer.close();
}
catch(Exception e)
{
	e.printStackTrace();
}
}
}
