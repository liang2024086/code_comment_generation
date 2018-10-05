package methodEmbedding.Counting_Sheep.S.LYD1676;

import java.io.*;
class sheep {
	public static void main(String[] args)throws IOException {	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int seen[]=new int[10];
		int tc,sc=0,n1;
		FileInputStream fin=new FileInputStream("A-small-attempt0.in");
		int ch,count_sp=0;
		String str3="";
		while((ch=fin.read())!='\n')
		{
			str3=str3+(char) ch;
		}
		int num=Integer.parseInt(str3);
		tc=num;
		num=0;
		str3="";
		if(tc>0 && tc<101)
		{
			int input[]=new int[tc];
			int result[]=new int [tc];
			for(int t=0;t<tc;t++)
			{
				while((ch=fin.read())!='\n')
				{
					str3=str3+(char) ch;
				}
				num=Integer.parseInt(str3);
				input[t]=num;
				str3="";
				num=0;
			}
			for(int t=0;t<tc;t++)
			{
				if(input[t]>=0 && input[t]<=1000000)
				{
					n1=input[t];
					if(n1!=0)
					{
						sc=0;
						while(sc!=10)
						{
							String str=Integer.toString(n1);
							int len=str.length();
							for(int j=0;j<len;j++)
							{
								char ch1=str.charAt(j);
								String str1="";
								str1=str1+ch1;
								int counter=0;
								int num1=Integer.parseInt(str1);
								for(int k=0;k<sc;k++)
								{
									if(seen[k]==num1)
									{
										counter++;
									}
								}
								if(counter==0)
								{
									seen[sc]=num1;
									sc++;
								}
							}
							n1=n1+input[t];;
						}
						result[t]=(n1-input[t]);
					}
					else
					{
						result[t]=0;
					}
				}
				else
				{
					result[t]=0;
				}
			}
			fin.close();
			FileOutputStream fout=new FileOutputStream("output_large.txt");
			for(int c=0;c<tc;c++)
			{
				if(result[c]==0)
				{
					String res1=Integer.toString(c+1);
					String res="Case #"+res1+": INSOMNIA\n";
					int l1=res.length();
					for(int i=0;i<l1;i++)
					{
						char ch5=res.charAt(i);
						fout.write((int) ch5); 
					}
				}
				else
				{
					String res1=Integer.toString(c+1);
					String res2=Integer.toString(result[c]);
					String res="Case #"+res1+": "+res2+"\n";
					int l1=res.length();
					for(int i=0;i<l1;i++)
					{
						char ch5=res.charAt(i);
						fout.write((int) ch5); 
					}
				}
			}
		}//if*/
	}//close of main()

}//close of class
