package methodEmbedding.Revenge_of_the_Pancakes.S.LYD308;



import java.util.*;
import java.io.*;

public class PanStack {

    public static String filename = "B-small-attempt0";


    public static void main(String[] args) {


    	try {
	    	Scanner filein = new Scanner(new File(filename+".in"));
	    	PrintWriter fileout = new PrintWriter(new FileWriter(filename+".out"));
	    	int totalCase = filein.nextInt();
	    	System.out.println("Total Case:"+totalCase);
	    	filein.nextLine();
	    	for(int item=1; item<=totalCase; item++) {


				//int cases = filein.nextInt();
				//filein.nextLine();

				fileout.print("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Case #" + (item) + ": ");
				System.out.println("------------------------------------------------------------------------");
				String str = filein.nextLine();
				System.out.println("str:"+str);
				str=str.replace("+","<>");
				System.out.println("str:"+str);
				str=str.replace("><","");
				System.out.println("str:"+str);
				str=str.replace("<>","+");
				System.out.println("str:"+str);

				str=str.replace("-","<>");
				System.out.println("str:"+str);
				str=str.replace("><","");
				System.out.println("str:"+str);
				str=str.replace("<>","-");
				System.out.println("str:"+str);

				int len=str.length();
				int mod=(len%2);
				int div=(len/2);
				int track=0;
				if(len==1)
				{
					if(str.charAt(0)=='-')
					{
				System.out.println("Total Swap:"+1);
				fileout.println(1);
				continue;

					}
					else
					{
				System.out.println("Total Swap:"+0);
				fileout.println(0);
				continue;

					}
				}

				System.out.println("len:"+len);
				System.out.println("mod:"+(mod));
				System.out.println("div:"+(div));
				System.out.println("track:"+(div));
				if(mod==1)
				{
					if(str.charAt(0)=='+')
					track=(div*2);
					else
					track=(div*2)+1;
				}
				else
				{
					if(str.charAt(0)=='+')
					track=(div*2);
					else
					track=(div*2)-1;

				}
				System.out.println("Total Swap:"+track);
				fileout.println(track);


	    	}

	    	filein.close();
	    	fileout.close();
       	}
       	catch(IOException e) {
       		System.out.println("Error loading input or output file");
       	}
    }
}
