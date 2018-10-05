package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1034;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		int n=lee.nextInt();
		for (int i = 1; i <= n; i++) {
			String cad=lee.next();
			Stack <String> stack=new Stack();
			stack.push("*");
			char x;
			char y;
			for (int j = 0; j < cad.length(); j++) {
				x=cad.charAt(j);
				if(j==0)
					y=cad.charAt(j);
				if(!stack.peek().equals(x+"")){
					stack.push(x+"");
				}
			}
			int tam=stack.size()-1;
			String aux=stack.peek();
			if(aux.equals("+"))
				System.out.println("Case #"+i+": "+(tam-1));
			else
				System.out.println("Case #"+i+": "+tam);
		}
	}
}
