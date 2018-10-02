package methodEmbedding.Cookie_Clicker_Alpha.S.LYD432;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class cookieclicker {

	public static void main(String[] args) throws IOException {
		BufferedReader x = new BufferedReader(new FileReader("C:/Documents and Settings/alvin/My Documents/alvin/Computer Science/Code Jam/cookieclicker.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("C:/Documents and Settings/alvin/My Documents/alvin/test.out.txt")));
		int numcases=Integer.parseInt(x.readLine());
		for (int a=1; a<=numcases; a++){
			StringTokenizer st=new StringTokenizer(x.readLine());
			double farmbuying=Double.parseDouble(st.nextToken());// c
			double farmproduction=Double.parseDouble(st.nextToken()); //f
			double goal=Double.parseDouble(st.nextToken()); //x
			double currentproduction=2;
			DecimalFormat df = new DecimalFormat("#.0000000");
			if (farmbuying>=goal){
				out.println("Case #"+a+": "+df.format(goal/currentproduction));
				continue;
			}
			boolean notdone=true;
			double totaltime=0;
			while (notdone){
				double timetaken=farmbuying/currentproduction;
				totaltime=totaltime+timetaken;
				double buy=(goal/(currentproduction+farmproduction));
				double keep=((goal-farmbuying)/currentproduction);
				if (keep<=buy){
					totaltime=totaltime+keep;
					out.println("Case #"+a+": "+df.format(totaltime));
					notdone=false;
				}
				else{
					currentproduction=currentproduction+farmproduction;
				}
			}
		}
		out.close();
		System.exit(0);
	}

}
