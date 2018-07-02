package methodEmbedding.Counting_Sheep.S.LYD140;

import java.util.Scanner;

public class Count_sheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int n[] = new int[T];
		int nc[] = new int[T];
		for(int i=0; i<T; i++){
			n[i] = in.nextInt();
		}
		for(int i=0; i<T; i++){
			if(n[i]==0){
				nc[i] = 0;
			}else{
				StringBuffer digits = new StringBuffer("0000000000");
				int countindex = 1;
				int N = n[i];
				int temp = 0;
				while(!digits.toString().equals("1111111111")){
					String nstr = N+"";
					for(int j=0; j<nstr.length(); j++){
						int start = Integer.parseInt(nstr.substring(j, j+1));
						int end = start + 1;
						digits.replace(start, end, "1");
					}
					temp = N;
					countindex++;
					N = countindex*n[i];
				}
				nc[i] = temp;
			}
		}
		for(int i=0; i<T; i++){
			if(nc[i]!=0)
				System.out.println("Case #"+(i+1)+": "+nc[i]);
			else
				System.out.println("Case #"+(i+1)+": INSOMNIA");
		}
		in.close();
	}
}
