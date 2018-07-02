package methodEmbedding.Speaking_in_Tongues.S.LYD1255;


import java.io.DataInputStream;
import java.io.*;

public class GoogleCodeJam {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int numberOfTests;
        FileInputStream file = new FileInputStream("C:\\Users\\Taghi\\Downloads\\A-small-attempt6.in");
        DataInputStream in2 = new DataInputStream(file);
        BufferedReader in=new BufferedReader(new InputStreamReader(in2));
        numberOfTests=Integer.parseInt(in.readLine());
        String[] inputLines=new String[numberOfTests+1];
        String[] outputLines=new String[numberOfTests+1];
        for (int i=0;i<numberOfTests;i++)
        {
            inputLines[i]=in.readLine();
        }
        
        for (int i=0;i<numberOfTests;i++)
        {
           outputLines[i]="";
            for (int j=0;j<inputLines[i].length();j++)
            {
                
                switch (inputLines[i].charAt(j)){
                    case 'a':
                        outputLines[i]+='y';
                        break;
                    case 'b':
                        outputLines[i]+='h';
                        break;
                    case 'c':
                        outputLines[i]+='e';
                        break;
                    case 'd':
                        outputLines[i]+='s';
                        break;
                    case 'e':
                        outputLines[i]+='o';
                        break;
                    case 'f':
                        outputLines[i]+='c';
                        break; 
                    case 'g':
                        outputLines[i]+='v';
                        break;
                    case 'h':
                        outputLines[i]+='x';
                        break;
                    case 'i':
                        outputLines[i]+='d';
                        break;
                    case 'j':
                        outputLines[i]+='u';
                        break;
                    case 'k':
                        outputLines[i]+='i';
                        break;
                    case 'l':
                        outputLines[i]+='g';
                        break;
                    case 'm':
                        outputLines[i]+='l';
                        break;
                    case 'n':
                        outputLines[i]+='b';
                        break;
                    case 'o':
                        outputLines[i]+='k';
                        break;
                    case 'p':
                        outputLines[i]+='r';
                        break;
                    case 'q':
                        outputLines[i]+='z';
                        break;
                    case 'r':
                        outputLines[i]+='t';
                        break;
                     case 's':
                         outputLines[i]+='n';
                        break;
                    case 't':
                        outputLines[i]+='w';
                        break;
                    case 'u':
                        outputLines[i]+='j';
                        break;
                    case 'v':
                        outputLines[i]+='p';
                        break;
                    case 'w':
                        outputLines[i]+='f';
                        break;
                    case 'x':
                        outputLines[i]+='m';
                        break;
                    case 'y':
                        outputLines[i]+='a';
                        break;
                    case 'z':
                        outputLines[i]+='q';
                        break;    
                    case ' ':
                        outputLines[i]+=' ';
                        break;
                }
            }
            //String ans=outputLines[i]
            System.out.println("Case #"+(i+1)+": "+outputLines[i]);
            //System.out.format("Case #%d: %d\n",i, outputLines[i]);
        }
    }
}
