package methodEmbedding.Standing_Ovation.S.LYD1796;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class StandingOvation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int test,shyLevel;
		int result[]=null;
		String toknizeData=null;

		BufferedReader stream=new BufferedReader(new InputStreamReader(System.in));
		test=Integer.parseInt(stream.readLine());
		result=new int[test];
		int audiance[]=null;
		for(int i=0;i<test;i++)
		{
			toknizeData=stream.readLine();
			StringTokenizer tokenizer=new StringTokenizer(toknizeData);
			String lengthString=tokenizer.nextElement().toString();
			shyLevel=Integer.parseInt(lengthString);
			toknizeData=tokenizer.nextElement().toString();
			int counter=Integer.parseInt(""+toknizeData.charAt(0));
			//System.out.print(shyLevel);
			audiance=new int[shyLevel+1];
			for(int j=0;j<=shyLevel;j++)
			{
				audiance[j]=Integer.parseInt(""+toknizeData.charAt(j));
			}
			
			
			for(int j=1;j<=shyLevel;j++)
			{
				
				if(j>counter)
				{
					int needFriend=j-counter;
					//System.out.println("adding "+needFriend);
					result[i]=result[i]+needFriend;
					counter=counter+needFriend;
				}
				//System.out.print(shyLevel);
				counter=counter+audiance[j];
				
			}
			
			counter=0;
		}

		for(int i=0;i<test;i++)
			System.out.println("Case #"+(i+1)+": "+result[i]);
	}

}
