package methodEmbedding.Speaking_in_Tongues.S.LYD1526;

import java.io.*;
import java.util.*;
import java.lang.*;
public class problemA
{
    public static char[] cmap ={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    public static void main(String args[])throws Exception
    {
        Scanner cin=new Scanner(System.in);
        int numcases = cin.nextInt();
        String s;
        s = cin.nextLine(); 
        for(int i=0;i<numcases;i++){
            s = cin.nextLine(); 
            String k = "";
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == ' '){
                    k += ' ';
                }else{
                    k += cmap[s.charAt(j)-'a'];
                }
            }
            System.out.println("Case #" + (i+1) + ": " + k);
        }
    }

}
