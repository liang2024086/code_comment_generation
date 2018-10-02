package methodEmbedding.Magic_Trick.S.LYD2176;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
        String filename = "C:\\Users\\Anamika\\Desktop\\Test.txt";
		File file = new File(filename);
        Scanner in = new Scanner(file);
        int testcases = in.nextInt();
        //System.out.println("testcases :"+testcases);
        for(int i=0;i<testcases;i++){
        
        	int row1=in.nextInt();
        	//System.out.println("row1 :"+row1);
        	int a[]=new int[4];
        	for(int j=0;j<4;j++)
        	{
        		for(int k=0;k<4;k++)
        		{
        			if((j+1)==row1)
        			{
        			a[k]=in.nextInt();
        		   }
        		   else
        		   {
        			in.nextInt();
        		   }
        		}
        	}
        	
        	int row2=in.nextInt();
        	//System.out.println("row2 :"+row2);
        	int b[]=new int[4];
        	for(int j=0;j<4;j++)
        	{
        		for(int k=0;k<4;k++)
        		{
        			if((j+1)==row2)
        			{
        			 b[k]=in.nextInt();
        		   }
        		   else{
        			in.nextInt();
        		   }
        		}
        	}
        	
        	int count=0,card=-1;
        	for(int j=0;j<4;j++)
        	{
        		for(int k=0;k<4;k++)
        		{
        			if(a[j]==b[k])
        			{
        				count++;
        				card=a[j];
        				break;
        			}
        		}
        	}
        	
        	if(count==1)
        	{
        		System.out.println("Case #"+(i+1)+": "+card);
        	}
        	else if(count>1)
        	{
        		System.out.println("Case #"+(i+1)+": Bad magician!");
        	}
        	else
        	{
        		System.out.println("Case #"+(i+1)+": Volunteer cheated!");
        	}
        	
        }
	}

}
