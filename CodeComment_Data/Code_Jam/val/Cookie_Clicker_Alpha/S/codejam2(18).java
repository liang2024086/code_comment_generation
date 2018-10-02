package methodEmbedding.Cookie_Clicker_Alpha.S.LYD816;

    import java.util.*;
    import java.io.*;
    
    import java.text.DecimalFormat;
     
     
    class codechef_april
    {
    
     
    public static void main(String args[]) throws IOException
    {
    	FileOutputStream fis = new FileOutputStream("C:\\Users\\shivam\\Desktop\\java learn\\output2.txt");
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new BufferedOutputStream(fis));
    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
   
   
   
    long test_cases=Integer.parseInt(bis.readLine());
    
    for(long i=0;i<test_cases;i++)
    {
    	
    String s=bis.readLine();
    
    String array[]=s.split("\\s+");
    
    double c=Double.parseDouble(array[0]);
    
    double f=Double.parseDouble(array[1]);
    
    double x=Double.parseDouble(array[2]);
    
    
    
    double dumpans=0;
    double ans=0;
    double rate=2;
    double farmtime=0;
   
   
    while(true)
    {ans=0;
    dumpans=0;
   
    	
    
    
    dumpans=dumpans+(x/rate)+farmtime;
    
    
    farmtime=farmtime+(c/rate);
    
    rate=rate+f;
    
    ans=ans+x/rate+farmtime;
    
    
    	
    	 
    if(ans>dumpans)
    {
    	break;
    }
    	
    	
    //System.out.println(dumpans);  	
    //	
    	
    }
  
    
pw.println("Case #"+(i+1)+": "+dumpans);
 // System.out.println(dumpans);  
    		
    	
    
    } 
    	pw.flush();
    	pw.close();
    	
    	
    }
    
    }
