package methodEmbedding.Speaking_in_Tongues.S.LYD800;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int i = 0;
            String str[]=new String[n];
            for (i = 0; i < n; i++) {
                str[i]=br.readLine();
                StringTokenizer strtok=new StringTokenizer(str[i]," ");
                System.out.print("Case #"+(i+1)+": ");
                while(strtok.hasMoreTokens())
                {
                    String temp=strtok.nextToken();
                    int len=temp.length();
                    char[] CharArray = temp.toCharArray();
                    for(int j=0;j<len;j++){
                        switch(CharArray[j]){
                            case 'y':System.out.print("a");break;
                            case 'n':System.out.print("b");break;
                            case 'f':System.out.print("c");break;
                            case 'i':System.out.print("d");break;
                            case 'c':System.out.print("e");break;
                            case 'w':System.out.print("f");break;
                            case 'l':System.out.print("g");break;
                            case 'b':System.out.print("h");break;
                            case 'k':System.out.print("i");break;
                            case 'u':System.out.print("j");break;
                            case 'o':System.out.print("k");break;
                            case 'm':System.out.print("l");break;
                            case 'x':System.out.print("m");break;
                            case 's':System.out.print("n");break;
                            case 'e':System.out.print("o");break;
                            case 'v':System.out.print("p");break;
                            case 'z':System.out.print("q");break;
                            case 'p':System.out.print("r");break;
                            case 'd':System.out.print("s");break;
                            case 'r':System.out.print("t");break;
                            case 'j':System.out.print("u");break;
                            case 'g':System.out.print("v");break;
                            case 't':System.out.print("w");break;
                            case 'h':System.out.print("x");break;
                            case 'a':System.out.print("y");break;
                            case 'q':System.out.print("z");break;
                        }
                    }
                    if(strtok.hasMoreTokens())
                    System.out.print(" ");
                 }
                if(i<n-1)
                System.out.print("\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
