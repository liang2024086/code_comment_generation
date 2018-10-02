package methodEmbedding.Counting_Sheep.S.LYD1221;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class sheepg{
	
 public static void main(String[] args) throws IOException{
 	Scanner scanner=new Scanner(System.in);
 	 //File file1 =new File("output.txt");
      
      //file1.createNewFile();
      
       // FileWriter writer = new FileWriter(file1);
        //Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
        
 	int t=scanner.nextInt();
 	 
 	//int i=1;
 	for(int l=0;l<t;l++)
 	{

 	int n=scanner.nextInt();
 	//writer.write(n+"\n"); 
 	int[] b=new int[15];
    int error=1;
 	if(n!=0)
 	{
 		int start=1;
 		while(error!=0)
 		{
 			error = 0;
 			int calc = start*n;
 			while(calc!=0)
			{
				b[calc%10]=1;
				calc = calc/10;
	     	}
	     	for(int k=0;k<10;k++)
 			{
 				if(b[k] == 0)
 				error = 1;
 			}
 			++start;
 		}
 		System.out.println("Case #"+(l+1)+": "+n*(start-1));
 		//writer.write("Case #"+(l+1)+": "+n*(start-1));
 		//writer.append(System.lineSeparator());
 		//writer.write('\n');
 	
 	
    }
    else
    {
    	System.out.println("Case #"+(l+1)+": INSOMNIA");
    
   // writer.write("Case #"+(l+1)+": INSOMNIA");
    	//writer.append(System.lineSeparator());
	}
	
	}
	  //writer.flush();
     // writer.close();

}
}
