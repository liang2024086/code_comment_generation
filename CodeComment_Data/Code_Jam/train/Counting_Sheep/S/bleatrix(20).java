package methodEmbedding.Counting_Sheep.S.LYD1020;

import java.io.*;
 class bleatrix
 {
     public static void main(String args[])throws IOException
	{
		FileInputStream fstream=new FileInputStream("A-small-attempt2.in");
		DataInputStream in=new DataInputStream(fstream);
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int c=1; //line count
        String cLine; //current line
        
        int rem=10;
        PrintWriter writer=new PrintWriter("bleatfile.txt","UTF-8");
		int n=Integer.parseInt(br.readLine());
		//System.out.println(n);
		while(c<=n) //((cLine=br.readLine())!=null)
		{
		  cLine=br.readLine();
		  //System.out.println(cLine);
		  if(!(cLine.isEmpty() || cLine.trim().equals("") || cLine.trim().equals("\n")))
		  {
			int num=Integer.parseInt(cLine);
			int arr[]={0,0,0,0,0,0,0,0,0,0};
			rem=10;
			//System.out.println(num);
			writer.print("Case #"+c+": ");
			int i=1;
			int m=0;
			if(num==0)
			{
				writer.println("INSOMNIA");
				//System.out.println("INSOMNIA");
			}
			else
			{
				while(rem>0)
				{
					int k=i*num;
					m=k;
					while(k!=0)
					{
						int r=k%10;
						if(arr[r]!=1)
						{
							arr[r]=1;
							rem--;
						}
				    	k=k/10;
					}
					i++;
				}
				writer.println(m+"");
			}
			c++;
		   }
		}
		writer.close();
	}
 }
