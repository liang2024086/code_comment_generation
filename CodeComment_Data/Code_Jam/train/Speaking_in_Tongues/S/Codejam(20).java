package methodEmbedding.Speaking_in_Tongues.S.LYD1212;

import java.io.*;
public class Codejam
{
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        int test_case;
        String address="g:\\A-small-attempt0.in";
        BufferedReader br = new BufferedReader(new FileReader(address));
        test_case=Integer.parseInt(br.readLine());
        int iindex=0,jindex;
        String g_str,e_str;
        while(iindex<test_case)
        {
            g_str=br.readLine();
            e_str=new String();
            int g_len=g_str.length();
            for(jindex=0;jindex<g_len;jindex++)
            {
                switch(g_str.charAt(jindex))
                {
                    case 'a':e_str=e_str+'y';
                        break;
                    case 'b':e_str=e_str+'h';
                        break;
                    case 'c':e_str=e_str+'e';
                        break;
                    case 'd':e_str=e_str+'s';
                        break;
                    case 'e':e_str=e_str+'o';
                        break;
                    case 'f':e_str=e_str+'c';
                       break;
                            case 'g':e_str=e_str+'v';
                        break;
                                case 'h':e_str=e_str+'x';
                        break;
                                    case 'i':e_str=e_str+'d';
                        break;
                                        case 'j':e_str=e_str+'u';
                        break;
                                            case 'k':e_str=e_str+'i';
                        break;
                                                case 'l':e_str=e_str+'g';
                        break;
                                                    case 'm':e_str=e_str+'l';
                        break;
                                                        case 'n':e_str=e_str+'b';
                        break;
                                                            case 'o':e_str=e_str+'k';
                        break;
                                                                case 'p':e_str=e_str+'r';
                        break;
                                                                    case 'q':e_str=e_str+'z';
                        break;
                                                                    case 'r':e_str=e_str+'t';
                        break;
                                                                        case 's':e_str=e_str+'n';
                        break;
                                                                            case 't':e_str=e_str+'w';
                        break;
                                                                                case 'u':e_str=e_str+'j';
                        break;
                                                                                    case 'v':e_str=e_str+'p';
                        break;
                                                                                        case 'w':e_str=e_str+'f';
                        break;
                                                                                            case 'x':e_str=e_str+'m';
                        break;
                                                                                                case 'y':e_str=e_str+'a';
                        break;
                                                                                                    case 'z':e_str=e_str+'q';
                        break;
                                                                        
                                                                                                    case ' ':e_str=e_str+' ';
                                                                                                        break;
                }
                
            }
            System.out.print("Case #"+(iindex+1)+": ");
            System.out.println(e_str);
            iindex++;
        }
    }
}
