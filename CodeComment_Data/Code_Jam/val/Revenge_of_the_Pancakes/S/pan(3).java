package methodEmbedding.Revenge_of_the_Pancakes.S.LYD164;

import java.*;
import java.io.*;
class pan
{
public static void main(String args[])throws IOException
{
int len=0,count=0,lst,strt=0,flag=0,j=0,temp,sw=0;
String str;
FileWriter fr=new FileWriter("C:\\Users\\Rakshit\\Desktop\\Java\\outputFilePan.text");
BufferedWriter bw = new BufferedWriter(fr);
BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Rakshit\\Desktop\\Java\\B-small-attempt2.in"));

int t=Integer.parseInt(br.readLine());

if(t>0&&t<101)
{
for(int k=1;k<=t;k++)
{	
str=br.readLine();
len=str.length();
lst=len-1;
flag=0;
count=0;
int arr[]=new int[len];
for(int i=0;i<len;i++)
{
	if(str.charAt(i)=='+')
		arr[i]=1;
	else
		arr[i]=0;
	}
while(lst>=0)
{
	for(j=lst;j>=0;j--)
	{
		if(arr[j]==0)
		{
			
			lst=j;
			break;
		}
	}
	
	if(j==-1)
		break;
	
	if(arr[0]==1)
	{
		count++;
		for(j=0;j<lst;j++)
		{
			if(arr[j]==1)
			{
				arr[j]=0;
			sw=lst;
			}
		else 
			
			{
				sw=j;
				break;
		}
		}
		for(j=0;j<sw/2;j++)
		{
temp=arr[sw-j-1];	
arr[sw-j-1]=arr[j];
arr[j]=temp;
	}
		
	}
	
	count++;
	for(j=0;j<=lst;j++)
	{
		if(arr[j]==0)
			arr[j]=1;
		else
			arr[j]=0;
	}
	for(j=0;j<=lst/2;j++)
		{
temp=arr[lst-j];	
arr[lst-j]=arr[j];
arr[j]=temp;
	}
}
bw.write("Case #"+k+": "+count+"\n");
}
}
bw.close();
}
}
