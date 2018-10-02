package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1073;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int test = in.nextInt();
		int counter = 0;
		int tested = 0;

		do {
			String pankcake = in.next();

			char a[] = new char[pankcake.length()];
			for (int j = 0; j < pankcake.length(); ++j) {
				a[j] = pankcake.charAt(j);
			}
			for (int i = 0; i < pankcake.length(); ++i) {
				if (pankcake.indexOf("-") == i && pankcake.length() == 1 && a[i] == '-') {
					pankcake = "+";
					counter++;
				}
				else if (pankcake.length() == 1 && a[i] == '+'){
					break;
				}else if (i < pankcake.length() - 1 && a[i] == '-' && a[i + 1] == '-') {
					continue;
				} else if (i < pankcake.length() - 1 && a[i] == '-' && a[i + 1] == '+') {
					pankcake = pankcake.substring(0, i + 1).replace("-", "+")
							+ pankcake.substring(i + 1, pankcake.length());
					a[i + 1] = a[i] = '+';
					counter++;
				} else if ((i == pankcake.length() - 1 && a[i - 1] == '+' && a[i] == '-')) {
					pankcake = pankcake.substring(0, i).replace("+", "-");
					counter++;
					a[i-1] = '-';
				} else if ((i == pankcake.length() - 1 && a[i - 1] == '-' && a[i] == '-')) {
					pankcake = pankcake.substring(0, i + 1).replace("-", "+");
					counter++;
					a[i - 1] = a[i] = '+';
				} else if ((i < pankcake.length() - 1 && a[i] == '+' && a[i + 1] == '-')) {
					pankcake = pankcake.substring(0, i + 1).replace("+", "-")
							+ pankcake.substring(i + 1, pankcake.length());
					 a[i] = '-';
					counter++;
				}

			}

			System.out.println("Case #" + ++tested + ": " + counter);
			counter = 0;

		} while (tested < test);

	}
}
