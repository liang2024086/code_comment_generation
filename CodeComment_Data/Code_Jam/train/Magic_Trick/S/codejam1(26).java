package methodEmbedding.Magic_Trick.S.LYD2192;

    import java.util.*;
    import java.io.*;
     
     
    class codechef_april
    {
    
     
    public static void main(String args[]) throws IOException
    {
    	FileOutputStream fis = new FileOutputStream("C:\\Users\\shivam\\Desktop\\java learn\\output.txt");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new BufferedOutputStream(fis));
    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
   
   
   
    long test_cases=Integer.parseInt(bis.readLine());
    
    for(long i=0;i<test_cases;i++)
    {
    	
    int a = Integer.parseInt(bis.readLine());
   
   String line[]=new String[4];
   
 for(int k=0;k<4;k++)
 {
 	line[k]=bis.readLine();	
 	
 	}
   
   String array[]=line[a-1].split("\\s+");
   
   int intarray[]=new int[4];
   
   for(int m=0;m<4;m++)
   {
   	
   	intarray[m]=Integer.parseInt(array[m]);
   }
   
   
    int b = Integer.parseInt(bis.readLine());
    
    String line1[]=new String[4];
    	
    for(int k=0;k<4;k++)
 {
 	line1[k]=bis.readLine();	
 	
 	}
 	
 	
 	 String array1[]=line1[b-1].split("\\s+");
   
   int intarray1[]=new int[4];
   
   for(int m=0;m<4;m++)
   {
   	
   	intarray1[m]=Integer.parseInt(array1[m]);
   }
   
 	
 	int count=0;
 	int save=0;
 	
 	for(int m=0;m<4;m++)
 		for(int k=0;k<4;k++)
 		{
 			
 			if(intarray[m]==intarray1[k])
 			{	count++;
 			save=intarray[m];
 			
 			}
 			
 			
 			
 		}
 	
 	
 	if(count==1)
 	{	pw.println("Case #"+(i+1)+": "+save);
 //	continue;
 	}
 	
 		if(count>1)
 	{	pw.println("Case #"+(i+1)+": Bad magician!");
 //	continue;
 	}
 		
    	
    	if(count==0)
 	{	pw.println("Case #"+(i+1)+": Volunteer cheated!");
 //	continue;
 	}
 			
    	
    
    } 
    	pw.flush();
    	pw.close();
    	
    	
    }
    
    }
