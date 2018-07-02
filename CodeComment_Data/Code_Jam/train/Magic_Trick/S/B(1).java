package methodEmbedding.Magic_Trick.S.LYD284;

//input file must be in.txt in this directory
//output file will be out.txt
import java.io.*;
import java.util.*;
public class B
{
	public static Scanner in;
	public static PrintStream out;
	
	public static void main(String [] args) throws Exception
	{
		in = new Scanner(new File("in.txt"));
		int cases = in.nextInt();
		in.nextLine();
		out = new PrintStream(new File("out.txt"));
		for (int i = 1; i <= cases; i++)
		{
			out.print("Case #" + i + ": ");
			int a1 = in.nextInt();in.nextLine();
			int k=1; String a1r="";
			while(k<=4){
				if(k == a1)
					a1r = in.nextLine();
				else
					in.nextLine();
				k++;
			}
			String[] no1ss = a1r.split(" ");
			int a2 = in.nextInt();in.nextLine();
			k=1; List no2s = new ArrayList<String>();
			while(k<=4){
				if(k == a2){
					String a2r = in.nextLine();
					String[] no2ss = a2r.split(" ");
					no2s.add(no2ss[0]);
					no2s.add(no2ss[1]);
					no2s.add(no2ss[2]);
					no2s.add(no2ss[3]);
				}else
					in.nextLine();
				k++;
			}
			
			String outp = "";
			for(int j=0;j<4;j++){
				if(no2s.contains(no1ss[j]))
					outp = outp.equals("") ? no1ss[j] : "Bad magician!";
			}
			if(outp.equals(""))
				outp = "Volunteer cheated!";
			out.print(outp);			
			out.println();
		}
	}
} 
