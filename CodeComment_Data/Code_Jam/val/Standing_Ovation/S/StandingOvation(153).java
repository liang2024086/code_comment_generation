package methodEmbedding.Standing_Ovation.S.LYD870;


import java.util.*;
import java.io.*;

public class StandingOvation {
	public static void main(String[] args) throws IOException
	{
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.in")));
		Scanner in = new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));
		
		int cas = in.nextInt();
		
		for (int j = 1; j <= cas; j++)
		{
			
			int Nmin=0;
			int Smax = in.nextInt();
			int S[]= new int[Smax+1];
			String str =in.next();
			System.out.println("---" + str);
			
			for (int i = 0; i<= Smax; i++){
				 //S[i]=str. //in.nextInt();
				if (str.charAt(i)== '0') S[i]=0;
				if (str.charAt(i)== '1') S[i]=1;
				if (str.charAt(i)== '2') S[i]=2;
				if (str.charAt(i)== '3') S[i]=3;
				if (str.charAt(i)== '4') S[i]=4;
				if (str.charAt(i)== '5') S[i]=5;
				if (str.charAt(i)== '6') S[i]=6;
				if (str.charAt(i)== '7') S[i]=7;
				if (str.charAt(i)== '8') S[i]=8;
				if (str.charAt(i)== '9') S[i]=9;
				
				 System.out.print(S[i]);
				 
			}
			System.out.println("");
			//if (S[0]==0) Nmin=1;
			int s=0;
			for (int i =1; i<= Smax; i++ ){		
				s=s+S[i-1];
				if (S[i]!=0){
				if ( s < i) {
					Nmin=Nmin+(i-s);
					s=s+(i-s);
				}
				else Nmin=Nmin+0;
				}
			}
			System.out.println("Case  #" + j + ":" + Nmin);
			out.println("Case #" + j + ": "+ Nmin);
		}
		out.flush();
		out.close();
	}
}
