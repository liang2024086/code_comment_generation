package methodEmbedding.Counting_Sheep.S.LYD1078;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Csheep {

	private static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {
		scan = new Scanner(new File("E:/cj/A-small-attempt0.in"));
		int cases = scan.nextInt();
		int no=0;
		
		int[] c = new int[10];
		int j=0;
		int flag=0,num=0;
		
		for(int i=1; i<=cases; i++){
			no = scan.nextInt();
			
			for(j=1; j<Integer.MAX_VALUE;j++){
				num = no * j;
				for(int k=num;k>0;){
					int r =  k % 10;
					c[r] = 1;
					k = k/10;
				}
				for(int k=0;k<10;k++){
					if(c[k]!=1)
						break;
					else flag++;
				}
				if(flag==10)
					break;
				flag = 0;
				if(no==0){
					break;
				}
				
			}
			if(flag!=10)
				System.out.println("Case #" + i + ": " + "INSOMNIA");
			else
			    System.out.println("Case #" + i + ": " + no*j);
			flag = 0;
			for(int k=0;k<10;k++){
				c[k]=0;
			}
		}
		
		
		
	}
}
