package methodEmbedding.Standing_Ovation.S.LYD155;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Standing_Ovation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++){
			int Smax = sc.nextInt();
			char[] audiences = sc.next().toCharArray();
			
			int total = 0;
			int needGuy = 0;
			for( int j=0; j<=Smax; j++){
				int s = audiences[j] - 48;
				if( s == 0 ){
					continue;
				}else if( j <= total ){
					total += s;
				}else{
					needGuy = j-total <= needGuy? needGuy : j-total;
					total += s;
				}
			}
			System.out.println("Case #" + i + ": " + needGuy);
		}
		sc.close();
	}
}
