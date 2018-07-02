package methodEmbedding.Speaking_in_Tongues.S.LYD81;

import java.io.*;
class googlerese1
{
    public void main()throws IOException
    {
        FileReader fr=new FileReader("C:\\Users\\Admin\\Downloads\\A-small-attempt1.in");
        //InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(fr);
        int n=Integer.parseInt(br.readLine());
        String google[]=new String[n];
        String english="Googlerese";
            for(int i=0; i<n; i++)
            {
                google[i]=br.readLine();
                google[i]=google[i].toLowerCase();
                String s1="";
                for(int j=0; j<google[i].length(); j++)
                {
                    char c=google[i].charAt(j);
                    
                    switch(c)
                    {
                        case 'a': c='y'; break;
                        case 'b': c='h'; break;
                        case 'c': c='e'; break;
                        case 'd': c='s'; break;
                        case 'e': c='o'; break;
                        case 'f': c='c'; break;
                        case 'g': c='v'; break;
                        case 'h': c='x'; break;
                        case 'i': c='d'; break;
                        case 'j': c='u'; break;
                        case 'k': c='i'; break;
                        case 'l': c='g'; break;
                        case 'm': c='l'; break;
                        case 'n': c='b'; break;
                        case 'o': c='k'; break;
                        case 'p': c='r'; break;
                        case 'q': c='z'; break;
                        case 'r': c='t'; break;
                        case 's': c='n'; break;
                        case 't': c='w'; break;
                        case 'u': c='j'; break;
                        case 'v': c='p'; break;
                        case 'w': c='f'; break;
                        case 'x': c='m'; break;
                        case 'y': c='a'; break;
                        case 'z': c='q'; break;
                        case ' ': c=' '; break;
                        default: System.out.println("Invalid case"); break;
                    }
                    s1+=c;
                    english=s1;
                }
                System.out.print("Case #"+(i+1)+": ");
                System.out.print(english);
                System.out.println();
            }
        }
    }

    
