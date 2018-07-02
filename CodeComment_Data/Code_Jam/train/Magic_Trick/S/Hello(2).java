package methodEmbedding.Magic_Trick.S.LYD2224;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Hello {

	
	public static void main(String[] args) throws Exception {
int t,row1,row2,val=0;
int store1[]=new int[4];
int store2[]=new int[4];
int value[][]=new int[4][4];
int i,j,k,count=0,o;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		t=Integer.parseInt(br.readLine());
		
		for(i=0;i<t;i++)
		{
			
		row1=Integer.parseInt(br.readLine()); row1--;
		
		for(j=0;j<4;j++)
		{
				String str=br.readLine();
				String[] str1Array =  str.split(" ");
				for(k=0;k<4;k++)
				value[j][k]=Integer.parseInt(str1Array[k]);
					
			}
		
		
		store1[0]=value[row1][0];
		store1[1]=value[row1][1];
		store1[2]=value[row1][2];
		store1[3]=value[row1][3];
		
	//	for(k=0;k<4;k++)
		//	System.out.println(store1[k]+"");
		
		row2=Integer.parseInt(br.readLine()); row2--;
	//	System.out.println(row2+"FDDF");
		
		for(j=0;j<4;j++)
		{
			String str=br.readLine();
			String[] str1Array =  str.split(" ");
			for(k=0;k<4;k++)
			value[j][k]=Integer.parseInt(str1Array[k]);
					
			}
		
		store2[0]=value[row2][0];
		store2[1]=value[row2][1];
		store2[2]=value[row2][2];
		store2[3]=value[row2][3];
		
	//	for(k=0;k<4;k++)
		//	System.out.println(store2[k]+"");

	count=0;
		for(j=0;j<4;j++)
			for(k=0;k<4;k++)
		       if(store1[j]==store2[k])
		       { count++; val=store1[j]; }
		
		if (count==0)
		System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
		else if(count==1)
	    System.out.println("Case #"+(i+1)+": "+val);
		else
		System.out.println("Case #"+(i+1)+": "+"Bad magician!");
			
		}
			

	}

}

