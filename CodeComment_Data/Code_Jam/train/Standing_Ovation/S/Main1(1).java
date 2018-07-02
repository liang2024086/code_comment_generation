package methodEmbedding.Standing_Ovation.S.LYD119;








import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
	File file=new File("A-small-attempt9.in");
	ArrayList<BigInteger> list = new ArrayList<BigInteger>();
	FileReader input = null;
	try {
		input = new FileReader(file);
		BufferedReader out = new BufferedReader(input);
		PrintWriter out2 = new PrintWriter("output2.txt", "UTF-8");
		String line=out.readLine();
		long t=Long.parseLong(line);
		for(long i=0;i<t;i++){
			line=out.readLine();
			String s[]=line.split(" ");
			int n1=Integer.parseInt(s[0]);
			char[] chararr=new char[n1+1];
		    s[1].getChars(0, n1, chararr, 0);	
				
			int arr[]=new int[n1+1];
			for(int j=0;j<chararr.length;j++)
			{   
				String s2=String.valueOf(s[1].charAt(j));
				arr[j]=Integer.parseInt(s2);
				
			}
			for(int a:arr)
				System.out.print(a+"  ");
		      int sum=0;
		     System.out.println();
		    	  //System.out.println("i="+i);
			for(int k=0;k<arr.length;k++)
			{  int arrsum=0;
				for(int j=0;j<k;j++)
				{
					 arrsum=arrsum+arr[j];
				}
				System.out.println("k="+k+"  "+"arrsum "+arrsum);
				if(arr[k]!=0)
				{
					if(k>arrsum+sum)
					{    
						sum=(k-arrsum);
						
						System.out.println("k="+k+"  "+ "arrsum="+arrsum+"   "+"sum="+sum);
					}
					
				}
				
			}
		
			out2.println("Case #"+(i+1)+": "+sum);
			System.out.println("Case #"+(i+1)+": "+sum);
			/*Scanner testing=new Scanner(System.in);
			int y=testing.nextInt();*/
			
			
		}
		out2.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
