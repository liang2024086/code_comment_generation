package methodEmbedding.Standing_Ovation.S.LYD1388;

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
			shyLevel=Integer.parseInt(""+toknizeData.charAt(0));
			int counter=Integer.parseInt(""+toknizeData.charAt(2));
			//System.out.print(shyLevel);
			int length=toknizeData.length()-2;
			audiance=new int[length];
			for(int j=2;j<toknizeData.length();j++)
			{
				audiance[j-2]=Integer.parseInt(""+toknizeData.charAt(j));
			}
			
			for(int j=1;j<length;j++)
			{
				if(shyLevel==0)
					break ;
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
