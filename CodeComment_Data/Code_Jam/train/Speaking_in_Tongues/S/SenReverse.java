package methodEmbedding.Speaking_in_Tongues.S.LYD1266;

import java.io.*;
class SenReverse
{
  void main()throws IOException
  {
      BufferedReader obj= new BufferedReader(new FileReader("A-small-attempt0.in"));
      PrintWriter p= new PrintWriter(new BufferedWriter(new FileWriter("output.out")));
      
      int n= Integer.parseInt(obj.readLine()),z,i,j; String s="",ns="";char ch;
      
      for(i=1;i<=n;i++)
      {
          s=obj.readLine();
          z=s.length();
          
          for(j=0;j<z;j++)
          {
              ch=s.charAt(j);
              
              switch(ch)
              {
                  case 'a': ch='y';break;
                  case 'b': ch='h';break;
                  case 'c': ch='e';break;
                  case 'd': ch='s';break;
                  case 'e': ch='o';break;
                  case 'f': ch='c';break;
                  case 'g': ch='v';break;
                  case 'h': ch='x';break;
                  case 'i': ch='d';break;
                  case 'j': ch='u';break;
                  case 'k': ch='i';break;
                  case 'l': ch='g';break;
                  case 'm': ch='l';break;
                  case 'n': ch='b';break;
                  case 'o': ch='k';break;
                  case 'p': ch='r';break;
                  case 'q': ch='z';break;
                  case 'r': ch='t';break;
                  case 's': ch='n';break;
                  case 't': ch='w';break;
                  case 'u': ch='j';break;
                  case 'v': ch='p';break;
                  case 'w': ch='f';break;
                  case 'x': ch='m';break;
                  case 'y': ch='a';break;
                  case 'z': ch='q';break;
                  case ' ': ch=' ';break;
                  default: break;
               }
               
               ns=ns+ch;
            }
            
            p.println("Case #"+i+": "+ns);
            ns="";
        }
        p.flush();p.close();
    }
}
                  
                  
                  
                  
                  
