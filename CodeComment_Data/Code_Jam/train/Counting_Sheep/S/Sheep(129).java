package methodEmbedding.Counting_Sheep.S.LYD1291;

import java.io.* ;

public class Sheep
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("test.in")) ;
		PrintWriter fw = new PrintWriter("out") ;


		
		int cases = Integer.parseInt(br.readLine()) ;
		
		// loop through test cases
		for (int a= 1; a<=cases ; a++)
		{
			int n = Integer.parseInt(br.readLine()) ;

			boolean zero = false ;
			boolean one = false ;
			boolean two = false ;
			boolean three = false ;
			boolean four = false ;
			boolean five = false ;
			boolean six = false ;
			boolean seven = false ;
			boolean eight = false ;
			boolean nine = false ;

			// Count the numbers
			for (int i = 0 ; i<= 100000; i++) 
			{
				int testNum = (i+1) * n ;

				String num = Integer.toString(testNum) ;

				// Loop through string
				for (int s = 0; s<num.length() ; s++)
				{
					char c = num.charAt(s) ;

					switch (c)
					{
						case '0': zero = true ; break ;
						case '1': one = true ; break ;
						case '2': two = true ; break ;
						case '3': three = true ; break ;
						case '4': four = true ; break ;
						case '5': five = true ; break ;
						case '6': six = true ; break ;
						case '7': seven = true ; break ;
						case '8': eight = true ; break ;
						case '9': nine = true ; break ;
					}
				} // Done looping through string

				if (zero & one & two & three & four & five & six & seven & eight & nine)
				{
					fw.println("Case #"+a+": "+num) ;
					System.out.println("Case #"+a+": "+num) ;
					break ;
				}
			}
			if (!(zero & one & two & three & four & five & six & seven & eight & nine))
			{
				fw.println("Case #"+a+": INSOMNIA") ;
				System.out.println("Case #"+a+": INSOMNIA") ;
				continue ;
			}
		}




		fw.close() ;
		br.close() ;
	}
}
