package methodEmbedding.Revenge_of_the_Pancakes.S.LYD67;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution2 {

	public static void main(String[] args) throws IOException {
		File file = new File("B-small-attempt1.in");
		FileReader input = new FileReader(file);
		BufferedReader out = new BufferedReader(input);
		PrintWriter out2 = new PrintWriter("Output2_2.txt", "UTF-8");
		String line = out.readLine();
		long t = Long.parseLong(line);

		for (long test = 0; test < t; test++) {
			int count = 0;
			line = out.readLine();
			char A[] = line.toCharArray();

			if(line.indexOf('+')==-1)
			{
				count=1;
			}
			else {
				for (int p = 0; p < A.length; p++)

				{
					if (A.length >= 3 ) {
 
					//	System.out.println("p=" + p + "  A[p]" + A[p]);
						if (A[p] == '+'&& p+1<A.length && A[p + 1] == '-' && (p + 2) < A.length && A[p + 2] == '+') {
							

							if (p == 0) {
								A[p] = '-';
								A[p] = '+';
								A[p + 1] = '+';
								count = count + 2;
							} else {

								for (int index = 0; index <= p; index++) {
									A[index] = '-';
								}
								for (int index = 0; index <= p + 1; index++) {
									A[index] = '+';
								}

								count = count + 2;
							}

							/*System.out.println("p=" + p + "A[p]" + A[p]);
							System.out.println("count: " + count);*/
						}

						else if (A[p] == '-') {
							if (p == 0) {
								
								int index2=0;
								if(p+1<A.length&&A[p+1]=='-'){
									while(A[index2]=='-'){
										index2++;
									}
									for(int k=0;k<index2;k++)
										A[k]='+';
								}
								else{
								A[p] = '+';
								}
								
								count = count + 1;
							} else {
								for (int index2 = 0; index2 <= p; index2++) {
									A[p] = '-';
								}

								count = count + 1;
								for (int index2 = 0; index2 <= p; index2++) {
									A[p] = '+';
								}
								count = count + 1;

							}
							
						}

						else if (A[p] == '+'&& p+1<A.length && A[p + 1] == '-'&& (p + 2) < A.length && A[p + 2] == '-' ) {
						//	System.out.println("P:" +p +"  A[p]:  "+A[p]);
							int index = p + 2;
							
							if (p+3<A.length && A[p + 3] == '-') {
								index = p + 3;
							//	System.out.println("Index Assigning : "+index+" p "+p);
								if(index!=A.length-1)
								while (index<A.length && A[index] == '-'){
									index++;
									//System.out.println("index value: "+index);
								}
							}
							if(index>=A.length)
								index=A.length-1;
							
							for (int j = 0; j <= index; j++) {	
								A[j] = '-';
								//System.out.println("j= " +j);
							}
							count = count + 1;

							for (int j = 0; j <= index; j++) {
								A[j] = '+';
							}

							count = count + 1;
						
						}

					}

					else if (A.length == 1) {
						if (A[0] == '-')
							count = 1;
						else if (A[0] == '+') {
							count = 0;
						}
					}

					else if (A.length == 2) {
						if (A[0] == '-' && A[1] == '-') {
							count = 1;
						} else if (A[0] == '-' && A[1] == '+') {
							count = 1;
						}

						else if (A[0] == '+' && A[1] == '-') {
							count = 2;
						} else if (A[0] == '+' && A[1] == '+') {
							count = 0;
						}

					}
				}
				} /* End of for loop */
				

			System.out.println("Case #" + (test + 1) + ": " + count);
			out2.println("Case #" + (test + 1) + ": " + count);

		}

		input.close();
		out.close();
		out2.close();

	}

}
