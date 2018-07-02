package methodEmbedding.Magic_Trick.S.LYD1337;

import java.io.BufferedReader;
import java.io.*;
import java.*;


class TestSolution{

public static void main(String args[]) {
	
	try{	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputstring = br.readLine();
	
        int T=Integer.parseInt(inputstring);
        String[] row=new String[4];
        int rowa[][]=new int[4][4];
        int rowb[][]=new int[4][4];
        
        String[] result=new String[T];
        int match=0;
        int ans=0;
        
        int inputrow1;
	int inputrow2;
        
        for(int i=0;i<T;i++)
        {
			inputstring = br.readLine();
			
			match=0;	
			inputrow1=Integer.parseInt(inputstring);
			for(int y=0;y<4;y++)
			{	//start inputting rows 
				inputstring=br.readLine();
				row=inputstring.split(" ");
				for(int z=0;z<4;z++)
				{
					rowa[y][z]=Integer.parseInt(row[z]);
				}
			}
			
			inputstring = br.readLine();
			inputrow2=Integer.parseInt(inputstring);
			for(int y=0;y<4;y++)
			{	//start inputting rows 
				inputstring=br.readLine();
				row=inputstring.split(" ");
				for(int z=0;z<4;z++)
				{
					rowb[y][z]=Integer.parseInt(row[z]);
				}
			}
		/*for(int c=0;c<4;c++)
			{	for(int d=0;d<4;d++){
				System.out.print("rowa["+c+"]["+d+"] is "+rowa[c][d]);
			}
			System.out.println();
			}
			for(int c=0;c<4;c++)
			{	for(int d=0;d<4;d++){
				System.out.print(" rowb["+c+"]["+d+"] is "+rowb[c][d]);
			}
			System.out.println();
			}*/
			int temp1[]=new int[4];
			int temp2[]=new int[4];
			//System.out.println("inputrow1 is "+inputrow1);
			//System.out.println("inputrow2 is "+inputrow2);
			inputrow1--;
			inputrow2--;
			for(int x=0;x<4;x++)
			{
				temp1[x]=rowa[inputrow1][x];
			}
			for(int x=0;x<4;x++)
			{
				temp2[x]=rowb[inputrow2][x];
			}
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(temp1[j]==temp2[k])
					{
						match++;
						ans=temp1[j];
					}
				}
			}
			//System.out.println("match value is "+ match);
			//storing output
			if(match==1)
			result[i]=""+ans;
			else{
				if(match>1)
				result[i]="Bad magician!";
				else{
				if(match==0)
				result[i]="Volunteer cheated!";
			}
		}
		}
		for(int p=1;p<=T;p++)
		{
			//showing output
			System.out.println("Case #"+p+": "+result[p-1]);
			
		}
	
}
	catch(IOException e)
	{System.out.println(e);}
}
}
			
			

	
