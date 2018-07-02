package methodEmbedding.Cookie_Clicker_Alpha.S.LYD148;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

public class CookieClickerAlpha {
	public static void main(String[] args) throws Exception {
		Stack<Double> stack = new Stack<Double>();
		File file = new File(args[0]);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
//		System.out.println(line);
		int n = Integer.parseInt(line);
		
		
		for (int i = 1; i <= n; i++) {
			double inc = 2.0;
			double acum = 0.0;
			line = br.readLine();

			while (true) {
				
				String[] numbers = line.split(" ");
				double c = Double.parseDouble(numbers[0]);
				double f = Double.parseDouble(numbers[1]);
				double x = Double.parseDouble(numbers[2]);
//				System.out.println(c + " " + f + " " + x + " : " + inc);
				
							
				double a = (x / inc) + acum;
				double b = (c / inc) + acum;
//				System.out.println(":" + a + " "+ b);
				acum = b;
				inc += f;

				if (stack.size() > 0) {
					if (stack.peek() < a) {
						
											
						String ncase = String.format("Case #%d: %.7f",i,stack.peek());
						System.out.println(ncase.replace(",", "."));
						stack.clear();
						break;
					} else {
						stack.push(a);
					}
				}else {
					stack.push(a);
				}
											
			}
		}
		
		br.close();
	}
}
