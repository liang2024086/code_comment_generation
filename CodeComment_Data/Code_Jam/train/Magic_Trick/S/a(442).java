package methodEmbedding.Magic_Trick.S.LYD246;

import java.util.HashSet;
import java.util.Scanner;


public class a {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	for (int i = 1; i <=n; i++) {
		int x=sc.nextInt();
		int a[][]=new int[5][5];
		for (int j = 1; j <=4; j++) {
			for (int k = 1; k <=4; k++) {
				a[j][k]=sc.nextInt();
			}
		}
		int y= sc.nextInt();
		int b[][]=new int[5][5];
		for (int j = 1; j <=4; j++) {
			for (int k = 1; k <=4; k++) {
				b[j][k]=sc.nextInt();
			}
		}
		int ans  = 0  ;
		int cnt  = 0  ;
		HashSet<Integer> st= new HashSet<Integer>();  
		for (int j =1; j <=4; j++) {
			st.add(a[x][j]);
		}
		for (int j =1; j <=4; j++) {
			if(st.contains(b[y][j])){
				cnt++;
				ans=b[y][j];
			}
		}
		
		if(cnt==1)
			System.out.println("Case #"+i+": "+ans);
		else
			if(cnt==0)
				System.out.println("Case #"+i+": "+"Volunteer cheated!");
			else
				System.out.println("Case #"+i+": "+"Bad magician!");
	}
}
}
