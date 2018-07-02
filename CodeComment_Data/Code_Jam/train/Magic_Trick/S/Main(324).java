package methodEmbedding.Magic_Trick.S.LYD1915;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException
    {
        FileReader file = new FileReader("input.in");
        int[] integers = new int [100];
       // int i=0;
        BufferedWriter out=out= new BufferedWriter(new FileWriter("output.txt"));
        try {
            Scanner input = new Scanner(file);
            int test=input.nextInt();
            System.out.println("test numbers: "+test);
            int round=0;
            while(test>0){
                    
                    int num1,x,y;
                    num1=input.nextInt();
                    int temp1[]=new int[5];
                    int temp2[]=new int[5];
                   
                    int arr1[][]= new int[5][5];
                    int arr2[][]= new int[5][5];
                   
                    
                    for(int i=1;i<=4;i++)
                    {
                        for(int j=1;j<=4;j++)
                        {
                            x=input.nextInt();
                            arr1[i][j]=x;
                        }
                    }
                    for(int i=1;i<=4;i++)
                    {
                        temp1[i]=arr1[num1][i];
                    }
                    int num2;
                    num2=input.nextInt();
                    for(int i=1;i<=4;i++)
                    {
                        for(int j=1;j<=4;j++)
                        {
                            y=input.nextInt();
                            arr2[i][j]=y;
                        }
                    }
                    int count =0, value=0;
                    for(int i=1;i<=4;i++)
                    {
                        temp2[i]=arr2[num2][i];
                    }
                    for(int i=1;i<=4;i++)
                    {
                        for(int j=1;j<=4;j++)
                        {
                            if(temp1[i]==temp2[j])
                            {
                                count++;
                                value=temp1[i];
                            }
                        }
                    }
                     
                    if(count ==1){
                        round++;
                        
						out.write("Case #"+round+": "+value);
                        //System.out.println("Case #"+round+": "+value);
                    }
                    if(count==0){
                        round++;
                        out.write("Case #"+round+": "+ "Volunteer cheated!");
                        //System.out.println("Case #"+round+": "+ "Volunteer cheated!");
                    }
                    if(count > 1){
                        round++;
                        out.write("Case #"+round+": "+ "Bad magician!");
                        //System.out.println("Case #"+round+": "+ "Bad magician!");
                    }
                    count=0; 
                    
            	test=test-1;
            	if(test!=0)
            		out.write("\n");
            	
            }
            out.close();
            input.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
