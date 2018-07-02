package methodEmbedding.Speaking_in_Tongues.S.LYD1497;

import java.util.*;
import java.io.*;

public class SOURCE041312_CJ_Qual_SpeakingInTongues {

    public static void main (String[] sargs)throws IOException
    {
    	String alph="abcdefghijklmnopqrstuvwxyz";
    	String key="ynficwlbkuomxsevzpdrjgthaq";
    	Scanner oScan=new Scanner(new File("A-small-attempt1.in"));
    	System.setOut(new PrintStream(new File("OUTPUT041312_CJ_Qual_SpeakingInTongues.dat")));
    	int T=Integer.parseInt(oScan.nextLine().trim());
    	int count=0;
    	while(T-->0)
    	{

    		String G=oScan.nextLine();
    		String S="";
    		for(int i=0;i<G.length();++i)
    		{
    			if(key.indexOf(G.charAt(i))>-1)
    				S+=alph.charAt(key.indexOf(G.charAt(i)))+"";
    			else
    				S+=G.charAt(i)+"";

    		}
    		System.out.println("Case #"+ ++count + ": "+S);
    	}
    }

}
