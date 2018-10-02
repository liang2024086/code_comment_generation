package methodEmbedding.Standing_Ovation.S.LYD335;

import java.io.BufferedReader;
import java.io.FileReader;


public class P1 {
	
	public static void main(String[]args) throws Exception
	{
		FileReader fr = new FileReader("C:/Users/aarushi/workspace/CodeJam/src/T1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s="";
		String TestCase="";
		int MaxShyness=0;
		int TestCaseNum=0;
		int minInvited=0;
		int AudienceShyness[];
		int numStanding=0;
		String in="";// for getting to shyness levels in integer
		
		if((s =br.readLine())!=null)
		{
			TestCaseNum=Integer.parseInt(s);
			//System.out.println(TestCaseNum);
			
			for(int i=0;i<TestCaseNum;i++)
			{
				TestCase=br.readLine();
				//System.out.println(TestCase);
				MaxShyness=Integer.parseInt(TestCase.split(" ")[0]);
				//System.out.println(MaxShyness);
			    	
				AudienceShyness=new int[MaxShyness+1];
				numStanding=0;
				minInvited=0;
				String instr=TestCase.split(" ")[1];
				for(int j=0;j<(instr).length();j++)
				{
				   Character c =new Character(instr.charAt(j));
				   AudienceShyness[j]=Integer.parseInt(c.toString());
		          //System.out.println(AudienceShyness[j]);
				   
				}//inner for ends
				
				for(int k=0;k<MaxShyness+1;k++)
				{
					if(k==0)
					{
						numStanding+=AudienceShyness[k];
					}
					else
					{
						if(numStanding>=k)
						{
							numStanding+=AudienceShyness[k];
						}
						else
						{
							if(AudienceShyness[k]>0)
								
							{	minInvited+=k-numStanding;
								numStanding+=minInvited + AudienceShyness[k];
							}	
						}//inner else ends
						
					}//outer else ends
				}//for ends
				int tn=i+1;
			System.out.println("Case #"+tn+": "+minInvited);	
			}// outer most for loop ends
			
		}//if -br ends
		
	}//main ends

}
