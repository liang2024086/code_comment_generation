package methodEmbedding.Standing_Ovation.S.LYD1525;

import java.util.Scanner;

public class A {
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine(); //remove empty line
		
		String line;
		String[] linesplit;
		int j;
		char[] numchars;
		for (int i=1;i<n+1;i++){
			line = in.nextLine();
			linesplit = line.split(" ");
			j = Integer.parseInt(linesplit[0]);
			numchars = linesplit[1].toCharArray();
			
			int sum = 0;
			int toadd = 0;
			int curr;
			int ca;
			for (int a=0;a<j+1;a++){
				curr = numchars[a]-'0';
				if(sum<a){
					ca = a-sum; //get how many short we are		
				}
				else{
					ca = 0;
				}
				toadd = toadd + ca;
				sum = sum + curr + ca;
			}
			System.out.printf("Case #%d: %d\n",i,toadd);
		}
		in.close();
		
	}
}
