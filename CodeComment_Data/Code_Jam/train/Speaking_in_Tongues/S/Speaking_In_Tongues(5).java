package methodEmbedding.Speaking_in_Tongues.S.LYD1027;

import java.util.*;
import java.io.*;

class Speaking_In_Tongues
{
  public static void main(String arg [])
  {
    String  enter="";
    String output="" ;
    String path;
    char []googlerese ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char [] english ={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    
    Scanner read = new Scanner(System.in);
    System.out.println("pls enter your file");
    path = read.nextLine();
    
   
    BufferedWriter bw;
    try
    {
      File  fobj = new File(path);
      Scanner sc = new Scanner(fobj);
     
      bw =new BufferedWriter( new FileWriter("Output.txt"));
      int tests = Integer.parseInt(sc.nextLine())   ,counter = 1;
      while (counter <= tests)
      {  
        output = "";
        enter = sc.nextLine();
       
        
        for (int e =0; e < enter.length();e++)
        {
          for (int  g=0; g < googlerese.length;g++)
          {
            
            if((enter.charAt(e))==googlerese[g])
              output += english[g];
           
             
           }
           if(enter.charAt(e)==' ')
             output +=" ";
        }
      
      bw.write("Case #"+counter+": "+output); 
      bw.newLine();
      counter++;
      
      }
       
      
      
      bw.close();
      
    }//end of try
    catch(Exception e)
    {
      System.out.println(e);
    }
    
  }
}
