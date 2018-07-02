package methodEmbedding.Standing_Ovation.S.LYD958;

import java.io. * ;

public class TestOvation
{
	public static void main(String[] args)throws IOException
	{
		// Keyboard input
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

		// File input
		 BufferedReader br = new BufferedReader(new FileReader("C1.in")) ;

		Ovation s = new Ovation() ;

		int T = Integer.parseInt(br.readLine());

		int[] ans = new int[T] ;

		int loop = 0 ;

		do
		{
			//int Smax = Integer.parseInt(br.readLine());
			String BS = br.readLine();
			
			int Smax = Integer.parseInt(BS.substring(0,1));
			String B = BS.substring(2,BS.length());
			
			ans[loop] = s.Stand(B,Smax);
			loop ++ ;

		}while (loop != T);

		 br.close() ;

		// show results

		PrintWriter pw = new PrintWriter(new FileWriter("Ovation.out"));
		
		for (int a=0 ; a<T ; a++)
		{
			System.out.println("Case #"+(a+1)+": "+ans[a]);
			pw.println("Case #"+(a+1)+": "+ans[a]);
		}
		pw.close();
	}
}	
