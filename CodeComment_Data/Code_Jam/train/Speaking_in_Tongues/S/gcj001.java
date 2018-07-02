package methodEmbedding.Speaking_in_Tongues.S.LYD1058;

import java.util.*;
import java.io.*;
  
  class test{
    public static void main (String[] args) throws IOException{
      
      String str="",str1="";
      char c;
      
      FileReader fin=new FileReader("A-small-attempt0.in");
      FileWriter fout=new FileWriter("out.out");       
      
      Scanner scan=new Scanner(fin);
      Scanner scan1=new Scanner(fin);
      
      int count=scan.nextInt();
      
      for (int i=0;i<=count;i++)
      {
        str1="";
        str=scan.nextLine();
        for(int j=0;j<str.length();j++)
        {
          c=str.charAt(j);
          if (Character.isWhitespace(c)) 
          {
            str1+=" ";
            continue; 
          }
          switch (c)
          {
            case 'a': str1+="y"; break ;
            case 'b': str1+="h"; break ;
            case 'c': str1+="e"; break ;
            case 'd': str1+="s"; break ;
            case 'e': str1+="o"; break ;
            case 'f': str1+="c"; break ;
            case 'g': str1+="v"; break ;
            case 'h': str1+="x"; break ;
            case 'i': str1+="d"; break ;
            case 'j': str1+="u"; break ;
            case 'k': str1+="i"; break ;
            case 'l': str1+="g"; break ;
            case 'm': str1+="l"; break ;
            case 'n': str1+="b"; break ;
            case 'o': str1+="k"; break ;
            case 'p': str1+="r"; break ;
            case 'q': str1+="z"; break ;
            case 'r': str1+="t"; break ;
            case 's': str1+="n"; break ;
            case 't': str1+="w"; break ;
            case 'u': str1+="j"; break ;
            case 'v': str1+="p"; break ;
            case 'w': str1+="f"; break ;
            case 'x': str1+="m"; break ;
            case 'y': str1+="a"; break ;
            case 'z': str1+="q"; break ;
            //Default : str+=" "; break ; 
            
          }
        //  System.out.println(str1);
        }
        if(i>=1)
        {
         String print= "Case #"+i+": "+str1+"\n";
         
         fout.write(print);
         
        }
        //System.out.println("Case #"+i+": "+str1);
       // fout.write(str1);
      }
      
      fin.close();
      fout.close();
    }
    
  }
