package methodEmbedding.Speaking_in_Tongues.S.LYD326;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            String sen=br.readLine();
            
            char sens[]=sen.toCharArray();
            for(int j=0;j<sens.length;j++)
            {
                switch(sens[j])
                {
                    case 'a':{sens[j]='y';break;}
                    case 'b':{sens[j]='h';break;}
                    case 'c':{sens[j]='e';break;}
                    case 'd':{sens[j]='s';break;}
                    case 'e':{sens[j]='o';break;}
                    case 'f':{sens[j]='c';break;}
                    case 'g':{sens[j]='v';break;}
                    case 'h':{sens[j]='x';break;}
                    case 'i':{sens[j]='d';break;}
                    case 'j':{sens[j]='u';break;}
                    case 'k':{sens[j]='i';break;}
                    case 'l':{sens[j]='g';break;}
                    case 'm':{sens[j]='l';break;}
                    case 'n':{sens[j]='b';break;}
                    case 'o':{sens[j]='k';break;}
                    case 'p':{sens[j]='r';break;}
                    case 'q':{sens[j]='z';break;}
                    case 'r':{sens[j]='t';break;}
                    case 's':{sens[j]='n';break;}
                    case 't':{sens[j]='w';break;}
                    case 'u':{sens[j]='j';break;}
                    case 'v':{sens[j]='p';break;}
                    case 'w':{sens[j]='f';break;}
                    case 'x':{sens[j]='m';break;}
                    case 'y':{sens[j]='a';break;}
                    case 'z':{sens[j]='q';break;}

                   }

            }
            sen=String.valueOf(sens);
            int x=i+1;
            System.out.println("Case #"+x+": "+sen);




        }





    }

}
