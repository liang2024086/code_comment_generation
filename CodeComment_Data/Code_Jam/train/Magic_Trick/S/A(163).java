package methodEmbedding.Magic_Trick.S.LYD1034;


import java.util.Arrays;
import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int cases=1;cases<=n;cases++){
			int[] c1 = new int[4];
			int[] c2 = new int[4];
			int row1 = sc.nextInt()-1;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i==row1){
						c1[j]=sc.nextInt();
					}
					else{
						sc.nextInt();
					}
				}
			}
			int row2 = sc.nextInt()-1;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i==row2){
						c2[j]=sc.nextInt();
					}
					else{
						sc.nextInt();
					}
				}
			}
			int ans=0,cnt=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(c1[i]==c2[j]){
						ans = c1[i];
						cnt++;
					}
				}
			}
			System.out.print("Case #"+cases+": ");
			if(cnt==0){
				System.out.println("Volunteer cheated!");
			}
			else if(cnt==1){
				System.out.println(ans);
			}
			else{
				System.out.println("Bad magician!");
			}
		}
	}

}
