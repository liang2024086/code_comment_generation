package methodEmbedding.Standing_Ovation.S.LYD1826;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fis=new FileInputStream("A-small-attempt1.in");  
	     System.setIn(fis);  
		Scanner scan =  new Scanner(new BufferedInputStream(System.in));
		int T = Integer.parseInt(scan.nextLine());
		int cmd = 1;
		while(T-- != 0){
			String[] s = scan.nextLine().split(" ");
			int Smax = Integer.parseInt(s[0]);
			int[] array = new int[Smax+1];
			System.out.print("Case #"+(cmd++)+": ");
			int sum = 0;
			int need = 0;
			
			for(int i=0; i<=Smax; i++){
				array[i] = s[1].charAt(i)-'0';
			}
			
			sum += array[0];
			
			for(int i=1; i<=Smax; i++){
				if((i > sum) && (array[i] != 0)){
					need += i - sum;
					sum += i - sum;
				}
				sum += array[i];
			}
			
			System.out.println(need);
		}
	}
}
