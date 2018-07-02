package methodEmbedding.Counting_Sheep.S.LYD659;

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int nn = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=nn;i++){
			String s = sc.nextLine();
			String ss = s;
			int m=1;
			int count = 0;
			String num = "1234567890";
			if(Integer.parseInt(s)==0) System.out.println("Case #" + i + ": INSOMNIA");
			else{
			while(count<10){
				s = Integer.toString(Integer.parseInt(ss)*m);
				for(int j=0;j<s.length();j++){
					char a = s.charAt(j);
					int x = num.indexOf(a);
					if(x>=0){
						count+=1;
						num = num.substring(0,x)+num.substring(x+1);
					}
				}
				m+=1;
			}
			System.out.println("Case #" + i + ": " + s);
		}
	}
		sc.close();
	}
}
