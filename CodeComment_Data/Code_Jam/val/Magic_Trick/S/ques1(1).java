package methodEmbedding.Magic_Trick.S.LYD840;

import java.io.*;

class ques1
{
public static void main(String ar[]) throws Exception
	{
FileOutputStream fos= new  FileOutputStream("ques_out.txt");
DataOutputStream dos = new DataOutputStream(fos);
FileInputStream fis=new FileInputStream("A-small-attempt1.in");//name of input file downloaded with same extension
DataInputStream dis= new DataInputStream(fis);
int[][] arr= new int[4][4];
int [] temp=new int[4];
String ele="",item="";
char c= ' ';
int ans=0, i=0,j=0,k=0, p=0,len=0, flag=0,card=0,count=1;
int test=Integer.parseInt(dis.readLine());
while(test-- > 0)
{flag=0;
//logic
ans=Integer.parseInt(dis.readLine());
for(i=0;i<4;i++)
	{
j=0;p=0;
ele= dis.readLine();
ele+=" ";
len= ele.length();
	for(k=0;k<len;k++)
		{
c=ele.charAt(k);

		if(c== ' ')
			{
item=ele.trim().substring(p,k);
arr[i][j] = Integer.parseInt(item);
j++;
p=k+1;
			}//end if		
		}//inner for ends
	}//outer for ends
for(j=0;j<4;j++)
	temp[j]=arr[ans-1][j];

ans=Integer.parseInt(dis.readLine());
//copy paste from above
for(i=0;i<4;i++)
	{
j=0;p=0;
ele= dis.readLine();
ele+=" ";
len= ele.length();
	for(k=0;k<len;k++)
		{
c=ele.charAt(k);

		if(c== ' ')
			{
item=ele.trim().substring(p,k);
arr[i][j] = Integer.parseInt(item);
j++;
p=k+1;
			}//end if		
		}//inner for ends
	}//outer for ends

for(i=0;i<4&&flag<=1;i++)
{
for(j=0;j<4&&flag<=1;j++)
{
if(temp[i]== arr[ans-1][j])
{
flag++;
card=temp[i];
if(flag>1)
break;
}
}
}

// to check case and output

if(flag==1)
dos.writeBytes("Case #"+(count)+": "+card);
else if(flag>1)
dos.writeBytes("Case #"+(count)+": Bad magician!");
else if(flag==0)
dos.writeBytes("Case #"+(count)+": Volunteer cheated!");

dos.writeBytes("\n");
count++;
}//end while


	}// end main

}
