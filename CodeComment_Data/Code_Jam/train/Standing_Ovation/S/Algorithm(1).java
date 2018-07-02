package methodEmbedding.Standing_Ovation.S.LYD1720;

/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
 */

import java.io.FileInputStream;
import java.util.Scanner;

/*
   As the name of the class should be Algorithm , using Algorithm.java as the filename is recommended.
   In any case, you can execute your program by running 'java Algorithm' command.
 */
class Algorithm {
	static int Answer;
	static int Sum = 0;
	static int Friend = 0;
	static int Audience[] = new int[1001];
	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream(args[0]));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			/////////////////////////////////////////////////////////////////////////////////////////////
			/*
			   Implement your algorithm here.
			   The answer to the case will be stored in variable Answer.
			 */
			/////////////////////////////////////////////////////////////////////////////////////////////
			Answer = 0;
			Friend = 0;
			Sum = 0;
			
			int n = sc.nextInt();
			int diff = 0;
			String AudienceString = sc.next();
			for(int as = 0; as<AudienceString.length();as++){
				Audience[as] = Character.digit(AudienceString.charAt(as), 10);
			}
			for(int i=0;i<=n;i++){				
				Sum+=Audience[i];
				diff = (i+1)-Sum; 
				if(diff > 0){
					Sum += diff;
					Friend += diff;
				}
			}
			
			Answer = Friend;
			// Print the answer to standard output(screen).
			System.out.print("Case #"+(test_case+1)+": ");
			System.out.println(Answer);
		}
	}
}
