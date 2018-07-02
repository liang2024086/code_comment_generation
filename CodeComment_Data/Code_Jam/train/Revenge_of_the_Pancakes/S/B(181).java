package methodEmbedding.Revenge_of_the_Pancakes.S.LYD997;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws FileNotFoundException {
		//Read file
		Scanner sc = new Scanner(new File("x.in"));
		/*
		 * *************
		 * Do not forget to uncomment
		 * *************
		 */
		
		//Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		String n;
		int t = 1;
		
		while(cases --> 0) {
			n = sc.next();
			char[] pancakes = new char[n.length()];
			n.getChars(0,n.length(),pancakes,0);
			int num = 0;
			char temp=pancakes[0];
			
			for(int i=0; i<n.length(); i++){
				if(temp != pancakes[i]){
					num++;
					temp = pancakes[i];
				}
			}
//			System.out.println(pancakes);
			if(pancakes[n.length()-1]=='-'){
				num++;
			}
				System.out.println("Case #"+t+": "+ num);
			t ++;
	}

	}

}
