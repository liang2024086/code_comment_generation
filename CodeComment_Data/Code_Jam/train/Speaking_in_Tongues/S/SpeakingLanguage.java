package methodEmbedding.Speaking_in_Tongues.S.LYD780;



import java.util.*;
import java.io.*;

public class SpeakingLanguage {

    public static String filename = "Input";


    public static void main(String[] args) {


    	try {
	    	Scanner filein = new Scanner(new File(filename+".in"));
	    	PrintWriter fileout = new PrintWriter(new FileWriter(filename+".out"));
	    	int totalCase = filein.nextInt();
	    	filein.nextLine();
	    	Hashtable  map = new  Hashtable();
	    	//------------------------------
	    	System.out.println("Adding Googlers");
	    	String trans= "qzejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	    	String ans=   "zqour language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	    	String[] transL = trans.split("\\s");
	    	String[] ansL = ans.split("\\s");
	    	for(int i=0; i<transL.length;i++)
	    	{
	    		if( !map.containsKey(transL[i]))
	    		map.put(transL[i], ansL[i]);
	    		System.out.println(i+" "+transL[i] +":->"+ansL[i]);
	    	}
	    	for(int i=0; i<trans.length();i++)
	    	{
	    		if( !map.containsKey(trans.charAt(i)) && trans.charAt(i) != ' ')
	    		map.put(trans.charAt(i)+"", ans.charAt(i)+"");
	    		System.out.println(i+" "+trans.charAt(i)+""+ans.charAt(i));
	    	}
	    	System.out.println("Char Added"+map);
	    	System.out.println("Testing:"+map.get("c"));
	    	//------------------------------

	    	for(int item=1; item<=totalCase; item++) {


				//int cases = filein.nextInt();
				//filein.nextLine();
				fileout.print("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				String str = filein.nextLine();
				String[] tokens = str.split("\\s");
				System.out.println(tokens.length);
				String answer="";
				String join="";
				for(int i=0; i< tokens.length;i++)
				{
				System.out.println(tokens[i]);
				if(1==1 )//!map.containsKey(tokens[i]))
				{
					String tempans="";
					for(int j=0; j<tokens[i].length(); j++)
						{
							String s1 = Character.toString(tokens[i].charAt(j));
						if( !map.containsKey(s1))
						{
							map.put(s1, s1);
							tempans=tempans+map.get(s1);
						}
						else
							tempans=tempans+map.get(s1);
							System.out.print(map.get(s1));
						}

					map.put(tokens[i], tempans);
					answer=answer+join+tempans;
					if(join.equalsIgnoreCase(""))
						join=" ";
				}
				/*else
				{
					String tempans="";
					tempans=(String)map.get(tokens[i]);
					answer=answer+join+tempans;
					if(join.equalsIgnoreCase(""))
						join=" ";
				}*/

				}
				System.out.println("\nAnswer:   "+answer);
				System.out.println("Question: "+str);
				//Integer.parseInt(tokens[ptr]);


						//System.out.println("cases"+item);

						fileout.println(answer);


	    	}

	    	filein.close();
	    	fileout.close();
       	}
       	catch(IOException e) {
       		System.out.println("Error loading input or output file");
       	}
    }
}
