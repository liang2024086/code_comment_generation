package methodEmbedding.Counting_Sheep.S.LYD1162;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for (int i = 1; i <= T; i++) {
			int n = s.nextInt();
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
			}
			else {
				boolean[] checkArray = new boolean[10];
				boolean allDigitsFound = false;
				int j = 1;
				while (!allDigitsFound) {
					int number = j * n;
					while (number > 0) {
						checkArray[number%10] = true;
						number /= 10;
					}
					allDigitsFound = true;
					for (int k = 0; k < 10; k++) {
						if (!checkArray[k]) {
							allDigitsFound = false;
							break;
						}
					}
					j++;
				}
				System.out.println("Case #" + i + ": " + (--j)*n);
			}
		}
		
	}
}
