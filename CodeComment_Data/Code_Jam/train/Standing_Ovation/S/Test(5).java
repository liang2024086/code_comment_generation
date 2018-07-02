package methodEmbedding.Standing_Ovation.S.LYD561;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;




public class Test {


    public static void main(String[] args) {
        int t,i,j,d,ans,sum;
		Scanner sc = new Scanner(System.in);
		String s = new String();
		t = sc.nextInt();
		for(i = 1; i <= t; i++) {
			d = sc.nextInt();
			s = sc.nextLine();
			ans = 0;
			sum = 0;
			for(j = 0; j<=d; j++) {
				if(sum >= j) {
					sum += (s.charAt(j+1) - '0');
				}
				else {
					ans += (j-sum);
					sum = j + (s.charAt(j+1) - '0');
				}
			}
			System.out.println("Case #"+i+": "+ans);
		}
    }
}
