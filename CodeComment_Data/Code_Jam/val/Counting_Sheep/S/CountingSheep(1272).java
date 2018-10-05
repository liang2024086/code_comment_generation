package methodEmbedding.Counting_Sheep.S.LYD771;


import java.io.*;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		FileReader fr= new FileReader("src/gcj/A-small-attempt0.in");
		FileWriter fw= new FileWriter("src/gcj/output.txt");
		BufferedReader br= new BufferedReader(fr);
		String s;
		s=br.readLine();
		int t,n,i=1,temp2=0;
		t=Integer.parseInt(s);
		while(t-->0)
		{
			s=br.readLine();
			n=Integer.parseInt(s);
			//fw.write(n+"\n");
			if(n==0)
			{
				fw.write("Case #"+i+": "+"INSOMNIA"+"\n");
			}
			else
			{
				boolean []digits= new boolean[10];
				int temp=n;
				while(temp!=0)
				{
					digits[temp%10]=true;
					//fw.write(temp%10+" ");
					temp/=10;
				}
				//fw.write("\n");
				for(int j=2;;j++)
				{
					
					temp=n*j;
					temp2=temp;
					//fw.write(temp+" ");
					while(temp!=0)
					{
						
						digits[temp%10]=true;
						//fw.write(temp%10+" ");
						temp/=10;
					}
					//fw.write("\n");
					boolean flag=true;
					for(int k=0;k<10;k++)
					{
						if(digits[k]==false)
						{
							flag=false;
							break;
						}
					}
					if(flag==true)
					{
						fw.write("Case #"+i+": "+temp2+"\n");
						break;
					}
				}
			}
			i++;
		}
		fw.close();
		fr.close();
	}
}

