package methodEmbedding.Magic_Trick.S.LYD387;

import java.util.*;
import java.lang.*;
import java.io.*;

class magic
{
    public static void main(String args[])
    {
	try
	{
	    PrintWriter pw=new PrintWriter("out.txt"); 
	    //creating file reader instance and reading first line
	    BufferedReader br=new BufferedReader(new FileReader(args[0]));
	    String line=br.readLine();
	    int T=Integer.parseInt(line); //number of test cases T
	    //-------------------------

	    //processing each test case
	    for(int t=0;t<T;++t)
	    {
		int[] firstArray = new int[4];
		int[] secondArray = new int[4];
		int firstRowNum = Integer.parseInt(br.readLine());
		for(int i = 1; i<=4;++i) {
		    if(i==firstRowNum) {
			String[] temp = br.readLine().split(" ");
			for(int j=0;j<4;++j) {
			    firstArray[j] = Integer.parseInt(temp[j]);
			}
		    } else {
			br.readLine();
		    }
		}

		int secondRowNum = Integer.parseInt(br.readLine());
		for(int i = 1; i<=4;++i) {
                    if(i==secondRowNum) {
			String[] temp = br.readLine().split(" ");
			for(int j=0;j<4;++j) {
                            secondArray[j] = Integer.parseInt(temp[j]);
                        }
                    } else {
			br.readLine();
                    }
                }

		int matchCount=0;
		int matchingNumber=0;
		Arrays.sort(secondArray);
		for(int i : firstArray){
		    if(Arrays.binarySearch(secondArray,i)>=0) {
			matchCount++;
			matchingNumber = i;
		    }
		}

		if(matchCount==0)
		    pw.println("Case #"+(t+1)+": " + "Volunteer cheated!");
		else if(matchCount>1)
		    pw.println("Case #"+(t+1)+": " + "Bad magician!");
		else
		    pw.println("Case #"+(t+1)+": " + matchingNumber);
		    
		/*------------------------**/
	    }
	    br.close();
	    pw.close();
	}//end of try
	catch(Exception e)
	{
	    System.out.println("Exception caught: "+e);
	}	
   } 
}
