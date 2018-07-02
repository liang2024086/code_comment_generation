package methodEmbedding.Speaking_in_Tongues.S.LYD3;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.io.*;
/**
 *
 * @author Reuben
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        File f=new File("/users/reuben/desktop/A-small-attempt0.in");
        FileReader f1=new FileReader(f);
   BufferedReader in=new BufferedReader(f1);
InputStream intp=new FileInputStream(f);
int size=intp.available();
        char c;
           int n=Integer.parseInt(in.readLine());
          String s="";
        for(int h=1;h<=n;h++)
        { System.out.print("Case #"+h+": ");
            for(int j=0;j<size;j++)
       {
           
               
           
               c=(char)in.read();
          
           
           switch(c)
           {
               case 'a':
                   System.out.print("y");
                   break;
               case 'b':
                   System.out.print("h");
                   break;
              case 'c':
                   System.out.print("e");
                   break;
                 case 'd':
                   System.out.print("s");
                  break;
                 case 'e':
                   System.out.print("o");
                   break;
                 case 'f':
                   System.out.print("c");
                   break;
                                       case 'g':
                   System.out.print("v");
                   break;
                                           case 'h':
                   System.out.print("x");
                   break;
                      case 'i':
                   System.out.print("d");
                   break;
                                                   case 'j':
                   System.out.print("u");
                   break;
                                                       case 'k':
                   System.out.print("i");
                   break;
                                                           case 'l':
                   System.out.print("g");
                   break;
                  case 'm':
                   System.out.print("l");
                   break;
                  case 'n':
                   System.out.print("b");
                   break;
                      case 'o':
                   System.out.print("k");
                   break;
                          case 'p':
                   System.out.print("r");
                   break;
                              case 'q':
                   System.out.print("z");
                   break;
                                  case 'r':
                   System.out.print("t");
                   break;
                                      case 's':
                   System.out.print("n");
                   break;
                                          case 't':
                   System.out.print("w");
                   break;
                                              case 'u':
                   System.out.print("j");
                   break;
                                              case 'v':
                   System.out.print("p");
                   break;
                   case 'w':
                   System.out.print("f");
                   break;
                       case 'x':
                   System.out.print("m");
                   break;
                           case 'y':
                   System.out.print("a");
                   break;
                               case 'z':
                   System.out.print("q");
                   break;
                               default:
                                   System.out.print(" ");
           } 
           if(c=='\n')
           {
               System.out.print("\n");
               break;
           }
       }
        }
    }
}
