package methodEmbedding.Magic_Trick.S.LYD1955;


import java.util.*;
class Solve
{

	public static void main(String args[])throws Exception
	{int i,j;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		int[] b=new int[4];
		int T=sc.nextInt();
		for(i=1;i<=T;i++)
		{
			int first=sc.nextInt();
                        int k=0;
			for(j=1;j<=16;j++)
		{
			int card=sc.nextInt();
                       
			if((first*4>=j)&&(j>(first-1)*4))
			{
				a[k]=card;k++;
			}
		}
			int second=sc.nextInt();
                         k=0; 
			for(j=1;j<=16;j++)
		{
			int card=sc.nextInt();
                       
			if((second*4>=j)&&(j>(second-1)*4))
			{
				b[k]=card;k++;
                                
                                
			}
		}int count=0;int p=0;
			for(j=0;j<4;j++)
			{ 
                            for(int v=0;v<4;v++)
                             {
                            if(a[j]==b[v])
                            {
                                    count++;p=a[j];
                            }
                            }
                           }
                        if( count==1)
                        {
                            System.out.println("Case #"+i+": "+p); 
                        }if(count>1)
                        { System.out.println("Case #"+i+": "+"Bad magician!"); 
                        }if(count==0)
                        {System.out.println("Case #"+i+": "+"Volunteer cheated!");}
		}	
	}
}
