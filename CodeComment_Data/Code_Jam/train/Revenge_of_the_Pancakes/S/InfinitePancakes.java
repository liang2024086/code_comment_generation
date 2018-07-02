package methodEmbedding.Revenge_of_the_Pancakes.S.LYD651;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InfinitePancakes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = (new BufferedReader(new FileReader("B-small-attempt0.in.txt")));
		int argumentCount = Integer.parseInt(in.readLine());
		String stack;
		int flip = 0;
		int i = 0;
		int j = 0;
		int z = 0;
		
		while(i < argumentCount) {
			stack = new StringBuilder(in.readLine()).reverse().toString();
			z = 0;
			j = 0;
			while(j < stack.length()) {
				if(stack.charAt(j) == '-') {
					while(j < stack.length() && stack.charAt(j) != '+') {
						j++;
					}
					for(int k = j; k < (stack.length()); k++) {
						if(stack.charAt(k) == '+' && flip == 0) {
							z++;
							flip = 1;
						}
					}
					z++;
				}
				else {
					while(j < stack.length() && stack.charAt(j) == '+') {
						j++;
					}
				}
				flip = 0;
			}
			i++;
			System.out.println("Case #"+ i +": " + (z));
			
		}
		in.close();

	}

}
