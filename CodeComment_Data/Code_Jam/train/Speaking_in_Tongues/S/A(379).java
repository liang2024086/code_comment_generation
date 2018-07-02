package methodEmbedding.Speaking_in_Tongues.S.LYD1457;


import java.io.*;

import java.util.Scanner;


public class A {
    
      
   
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
       String fn="C:\\Users\\Personal.Personal-PC\\Documents\\NetBeansProjects\\googlecodejam\\src\\A-small-attempt1.in";
        File inFile = new File(fn);
        Scanner sc = new Scanner(inFile);

 

        String no=sc.nextLine();
        int n=Integer.parseInt(no);
      
     String ou="";
       
       for(int i=0;i<n;i++)
        {
            String q=sc.nextLine();
           
            String f="Case #"+(i+1)+": ";
            for(int j=0;j<q.length();j++)
            {
                char c=q.charAt(j);
                char d;
                switch(c)
                {
                    case 'a':
                        d='y';
                        break;
                     case 'b':
                        d='h';
                        break;
                      case 'c':
                        d='e';
                        break;
                      case 'd':
                        d='s';
                        break;
                         case 'e':
                        d='o';
                        break;
                         case 'f':
                        d='c';
                        break;
                         case 'g':
                        d='v';
                        break;
                         case 'h':
                        d='x';
                        break;
                         case 'i':
                        d='d';
                        break;
                         case 'j':
                        d='u';
                        break;
                         case 'k':
                        d='i';
                        break;
                         case 'l':
                        d='g';
                        break;
                         case 'm':
                        d='l';
                        break;
                         case 'n':
                        d='b';
                        break;
                         case 'o':
                        d='k';
                        break;
                         case 'p':
                        d='r';
                        break;
                         case 'q':
                        d='z';
                        break;
                         case 'r':
                        d='t';
                        break;
                         case 's':
                        d='n';
                        break;
                         case 't':
                        d='w';
                        break;
                         case 'u':
                        d='j';
                        break;
                         case 'v':
                        d='p';
                        break;
                         case 'w':
                        d='f';
                        break;
                         case 'x':
                        d='m';
                        break;
                         case 'y':
                        d='a';
                        break;
                         case 'z':
                        d='q';
                        break;
                    default:
                        d=c;
                }
                f=f+d;
            }
            ou=ou+f+"\n";


        }
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String file_name = "C:\\Users\\Personal.Personal-PC\\Documents\\NetBeansProjects\\googlecodejam\\src\\A-small-attempt1.out";
            FileWriter fstream = new FileWriter(file_name);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(ou);
            out.close();
       
    }
    
    }


