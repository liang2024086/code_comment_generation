package methodEmbedding.Magic_Trick.S.LYD1210;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:\\Users\\Maheshwaran\\Downloads\\CodeJam\\A-small-attempt1.in"));
            outputStream = new PrintWriter(new FileWriter("C:\\Users\\Maheshwaran\\Downloads\\CodeJam\\output1.txt"));

            
            String num = inputStream.readLine();
            //System.out.println("Number of test cases "+num);
           // System.out.println(num);
            for(int i=1;i<Integer.valueOf(num)+1;i++)
            {
            	
            	int n1=Integer.parseInt(inputStream.readLine());
            	
            	int array1[][]=new int[4][4];
            	
            	for(int t=0;t<4;t++)
            	{
            		int b=0;
            		String[] v=inputStream.readLine().split(" ");
            		array1[t][b]=Integer.parseInt(v[0]);
            		b++;
            		array1[t][b]=Integer.parseInt(v[1]);
            		b++;
            		array1[t][b]=Integer.parseInt(v[2]);
            		b++;
            		array1[t][b]=Integer.parseInt(v[3]);
            		b++;
            	}
            	

            	int n2=Integer.parseInt(inputStream.readLine());
            	
            	int array2[][]=new int[4][4];
            	
            	for(int t=0;t<4;t++)
            	{
            		int b=0;
            		String[] v=inputStream.readLine().split(" ");
            		array2[t][b]=Integer.parseInt(v[0]);
            		b++;
            		array2[t][b]=Integer.parseInt(v[1]);
            		b++;
            		array2[t][b]=Integer.parseInt(v[2]);
            		b++;
            		array2[t][b]=Integer.parseInt(v[3]);
            		b++;
            	}
            	
            	int array3[][]=new int[2][4];
            	array3[0]=array1[n1-1];
            	array3[1]=array2[n2-1];
            	
            	int ans=0;
            	int count=0;
            	for(int t=0;t<4;t++)
            	{
            		int m=array3[0][t];
            		for(int j=0;j<4;j++)
            		{
            			if(array3[1][j]==m)
            			{
            				count++;
            				ans=m;
            			}
            		}
            	}
            	if(count==1)
            	{
            		outputStream.write("Case #"+i+": "+ans+"\n");
            		

            	}
            	else if(count==0)
            	{
            		outputStream.write("Case #"+i+": Volunteer cheated!\n");

            	}
            	else if(count>1)
            	{
            		outputStream.write("Case #"+i+": Bad magician!\n");

            	}

            	
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

            
            
	}

}
