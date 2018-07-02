package methodEmbedding.Magic_Trick.S.LYD184;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Vishal
 */

public class Asmall {
	public static void main(String args[]) 
	{
            int tcount=0;
            try{
			  // Create file 
			  FileWriter fstream = new FileWriter("A-small.out");
			  BufferedWriter out = new BufferedWriter(fstream);
			
		 Scanner myfile;
		try {
			myfile = new Scanner(new FileReader("A-small-attempt0.in"));
                        int testcases = myfile.nextInt();
                       //System.out.println(testcases);         
         while (testcases != 0 )  
         {       
                 int row1,row2,ans = -1;
                 tcount++;
                 int arr1[] = new int[4];
                 int arr2[] = new int[4];
                 row1=myfile.nextInt();
                 
                 for(int i=0;i<16;i++)
                 {
                	 int dum = myfile.nextInt();
                	 if(((i/4)+1) == row1)
                	 arr1[i%4]=dum;
                 }
                 
                 row2=myfile.nextInt();
                 int first =0;
                 for(int i=0;i<16;i++)
                 {
                	 int dum = myfile.nextInt();
                	 if(((i/4)+1) == row2)
                	 {
                		 arr2[i%4]=dum;
                		 
                		 for(int j=0;j<4;j++)
                			 if(arr2[i%4]==arr1[j])
                			 {
                				if (first == 0)
                					{ans=arr1[j];first=1;}
                				else
                					ans=0;
                			 }
                	 }
                 }
                 if(ans== -1)
                	 out.write("Case #"+ tcount+": "+"Volunteer cheated!"+ "\n");
                 else if (ans==0)
                	 out.write("Case #"+ tcount+": "+"Bad magician!"+ "\n");
                 //System.out.println(arr1[0] + " " + arr2[0] );
                 else
                 out.write("Case #"+ tcount+": "+ans+ "\n");
          
		//System.out.println(ans);
                 
                 testcases--;
         }
                
         myfile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Reading file using Scanner

		out.close();
		}catch (Exception e){//Catch exception if any
			  System.out.println(e.toString());
                }
	}

	
}


