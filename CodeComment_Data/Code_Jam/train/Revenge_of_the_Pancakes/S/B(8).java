package methodEmbedding.Revenge_of_the_Pancakes.S.LYD182;

import java.io.*;
import java.util.*;
//import static java.lang.System.*;
public class B
{
	public static void main(String[] args) throws IOException
	{
	Scanner in = new Scanner(System.in);
	int cases = in.nextInt();
	in.nextLine();
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("B.out")));
	
	for(int i=0; i<cases; i++)
	{
		String pancake = in.nextLine();

		int count=0;
		while(pancake.indexOf("-")!=-1){
			int index = pancake.lastIndexOf("-");
			//out.println("feg "+count+pancake);	
			StringBuffer sb = new StringBuffer();
			sb.append(pancake.substring(0,index+1));
			//out.println(sb+" this is sb now");
			/*if(sb.charAt(0)=='+'&&sb.charAt(sb.length()-1)=='-')
			{
				int jj=0;
				//get last + in a consecutive row
				for(int j=0; j<sb.length(); j++)
				{
					if(sb.charAt(j)=='-')
					{
						jj=j;
						break;
					}
				}
				StringBuffer sub = new StringBuffer();
				sub.append(sb.substring(0,jj));
				sub=new StringBuffer(sub.toString().replaceAll("\\+","-"));
				//out.println("sub is now:: "+sub);
				
				sb = new StringBuffer(sub.toString()+sb.toString().substring(1));
				//out.println("sb in the if statement is now  "+sb);
				count++;
			}
			*/
			sb = new StringBuffer(sb.toString().replaceAll("-","n"));
			sb = new StringBuffer(sb.toString().replaceAll("\\+","-"));
			sb = new StringBuffer(sb.toString().replaceAll("n","\\+"));
			pancake=sb+pancake.substring(index+1);
			count++;
		}
		out.println("Case #"+(i+1)+": "+count);
	}
	
	
	
	out.close();
	}
}
