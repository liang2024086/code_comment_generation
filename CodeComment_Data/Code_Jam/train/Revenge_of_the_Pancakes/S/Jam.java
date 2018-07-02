package methodEmbedding.Revenge_of_the_Pancakes.S.LYD305;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Jam {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int t = read.nextInt();
		read.nextLine();
		for(int i=1;i<=t;i++){
			int c=0;
			Queue cola = new LinkedList<Integer>();
			String cad = read.nextLine();
			for(int j=0;j<cad.length();j++){
				if(cad.charAt(j)=='+') cola.add(1);
				else cola.add(0);
			}
			int ante=(int)cola.peek();
			while(!cola.isEmpty()){
				if((int)cola.peek()==ante)cola.remove();
				else{
					ante=(int)cola.peek();
					c++;
				}
			}
			if(ante==0) c++;
			System.out.println("Case #"+i+": "+c);
		}		
	}
}
