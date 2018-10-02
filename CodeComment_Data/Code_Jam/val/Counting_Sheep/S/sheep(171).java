package methodEmbedding.Counting_Sheep.S.LYD1228;

import java.io.*;
import java.util.*;
class sheep
{
	public static void main(String args[]) throws IOException
	{
	PrintWriter out = new PrintWriter( "output.txt" );
		try{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		File input = new File("input.in");
        File output = new File("output.txt");
        Scanner sc = new Scanner(input);
		int t=Integer.parseInt(sc.nextLine());
		int n=1;
		while(t!=0)
		{
			int c=0,i,j,g,f=0,h=0,a;
			g=Integer.parseInt(sc.nextLine());
			String u=" ",x;
			String s="";
			if(g==0){
			out.println("Case #"+n+": INSOMNIA"	);}
			else
			{
				
				for(i=g;;i=i+g)
				{
					
					h=i;
					x=Integer.toString(h);
					u=u.concat(x);
					a=u.length();
					if((u.contains("0"))&&(u.contains("1"))&&(u.contains("2"))&&(u.contains("3"))&&(u.contains("4"))&&(u.contains("5"))&&(u.contains("6"))&&(u.contains("7"))&&(u.contains("8"))&&(u.contains("9")))
						
						{
							out.println("Case #"+n+": "+x);
					break;
						}
				}
				
			}
			n++;
			t--;
		}}
		 catch(FileNotFoundException e) {
        System.err.println("File not found. Please scan in new file.");
    }
	out.close();
		
	}
		
}
