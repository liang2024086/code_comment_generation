package methodEmbedding.Standing_Ovation.S.LYD14;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Tc = Integer.parseInt(sc.nextLine());
      	int count;
      	int up;
        for (int i=0;i<Tc; i++){
			count=0;
			String line =sc.nextLine();
			String[] lineArr=line.split(" ");
			int max = Integer.parseInt(lineArr[0]);
			up=lineArr[1].charAt(0)-'0';
			for(int j=1; j<=max;j++){
			int num=(lineArr[1].charAt(j))-'0';
				if(up<j && num!=0){
					count+=(j-up);
					up+=num+(j-up);
				}else{
					up+=num;
				}
			}
			System.out.printf("Case #%d: %d\n", (i+1), count);
		}
    }

}
