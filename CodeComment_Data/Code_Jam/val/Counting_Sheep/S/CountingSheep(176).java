package methodEmbedding.Counting_Sheep.S.LYD306;


import java.util.*;
import java.io.*;

public class CountingSheep {
	public static void main(String[] args) throws IOException
	{
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.in")));
		Scanner in = new Scanner(new BufferedReader(new FileReader("A-small.in")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("A-small.out")));
		
		int cas = in.nextInt();
		
		for (int j = 1; j <= cas; j++)
		{
			
			int S[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
			String str =in.next();
			boolean alldigits= false;
			int N, M, k=1;
			
			N= Integer.parseInt(str);
			M=N;
			
			
			System.out.println("str = " + str);
			System.out.println("str.length = " + str.length());
			System.out.println("N = " + N);
			
				
				do {
					
					for (int i = 0; i< str.length(); i++)S[str.charAt(i)-'0']=str.charAt(i)-'0';
					alldigits=true;
					//for (int i =0; i< 10; i++) System.out.println("S[" + i + "] = "+  S[i]);
					for (int i =0; i< 10; i++) if (S[i]== -1)alldigits=false;
					if (alldigits == false){
						N= Integer.parseInt(str);
					    k=k+1;
						N=k*M;
						str = Integer.toString(N);				
					}
					if (N==0)alldigits =true;
					System.out.println("-------------N = " + N);
				}while(alldigits== false);
				
			
			
				if (N==0){
					System.out.println("Case  #" + j + ":" + "INSOMNIA");
					out.println("Case #" + j + ": "+ "INSOMNIA");
				}else {
					System.out.println("Case  #" + j + ":" + str);
					out.println("Case #" + j + ": "+ str);
				}
		}
		out.flush();
		out.close();
	}
}
