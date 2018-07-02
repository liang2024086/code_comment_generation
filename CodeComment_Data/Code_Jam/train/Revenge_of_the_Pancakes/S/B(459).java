package methodEmbedding.Revenge_of_the_Pancakes.S.LYD621;

import java.util.*;
public class B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		for(int temp2=0;temp2<temp;temp2++) {
			String line = sc.next() +"+";
			int counter=0;
			System.out.print("Case #"+(temp2+1)+": ");
			char on = line.charAt(0);
			for(int x=1;x<line.length();x++) {
				if(line.charAt(x)!=on) {
					counter++;
					on = line.charAt(x);
				}
			}
			System.out.println(counter);
		}
	}
}
