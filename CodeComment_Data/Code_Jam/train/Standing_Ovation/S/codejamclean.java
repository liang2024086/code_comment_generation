package methodEmbedding.Standing_Ovation.S.LYD1463;

import java.io.*;
class codejamclean
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis= new FileInputStream("A-small-attempt0.in");
		DataInputStream dis= new DataInputStream(fis);
		FileOutputStream fos= new FileOutputStream("solution1.txt");
		DataOutputStream dos= new DataOutputStream(fos);
		StringBuilder s=new StringBuilder();
		int clap=0,need=0,total=0,val=0,len=0,k=0,end=0,index=0;
		int test=Integer.parseInt(dis.readLine());
		int countcase=0;
		while(test--!=0)
		{	s.append(dis.readLine());
		
			len=s.charAt(0)-48;
			end=len+2;
			for(k=2;k<=end;k++)
				{
				index=k-2;
				val=s.charAt(k)-48;
				
				if(clap<index&&val!=0)
					{
					need=index-clap;
					total=total+need;
					
					}
				clap=clap+need+val;
				
				need=0;				
				}
			
			dos.writeBytes("Case #"+(++countcase)+": "+total+"\n");
			
			s.setLength(0);
			total=0;
			clap=0;
		}
	
	}
	
}
