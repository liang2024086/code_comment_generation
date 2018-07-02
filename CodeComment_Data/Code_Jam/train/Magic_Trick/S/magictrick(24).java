package methodEmbedding.Magic_Trick.S.LYD627;

import java.io.*;
import java.util.*;


public class magictrick {

	public static void main(String[] args) throws IOException {
		BufferedReader x = new BufferedReader(new FileReader("C:/Documents and Settings/alvin/My Documents/alvin/Computer Science/Code Jam/magictrick.in"));
		PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("C:/Documents and Settings/alvin/My Documents/alvin/test.out.txt")));
		int numcases=Integer.parseInt(x.readLine());
		for (int i=1; i<=numcases; i++){
			int initialrow=Integer.parseInt(x.readLine());
			int[]goodrow=new int[4];
			for (int j=1; j<=4; j++){
				StringTokenizer st=new StringTokenizer(x.readLine());
				if (j==initialrow){
					for (int k=0; k<4; k++){
						int currentnumber=Integer.parseInt(st.nextToken());
						goodrow[k]=currentnumber;
					}
				}
			}
			int finalrow=Integer.parseInt(x.readLine())-1;
			int[][]grid2=new int[4][4];
			for (int j=0; j<4; j++){
				StringTokenizer st=new StringTokenizer(x.readLine());
				for (int k=0; k<4; k++){
					int currentnumber=Integer.parseInt(st.nextToken());
					grid2[j][k]=currentnumber;
				}
			}
			boolean appears=false;
			boolean done=false;
			int finalnum=-1;
			for (int j=0; j<4; j++){
				int currentnumber=goodrow[j];
				for (int k=0; k<4; k++){
					if (grid2[finalrow][k]==currentnumber){
						if (appears){
							out.println("Case #"+i+": Bad magician!");
							done=true;
							break;
						}
						else{
							finalnum=currentnumber;
							appears=true;
						}
					}
				}
				if (done)break;
			}
			if (appears && !done){
				out.println("Case #"+i+": "+finalnum);
			}
			if (!appears){
				out.println("Case #"+i+": Volunteer cheated!");
			}
		}
		out.close();
		System.exit(0);
	}
	
}
