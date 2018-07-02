package methodEmbedding.Magic_Trick.S.LYD850;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=0;tc<t;tc++){
			int row=sc.nextInt()-1;
			sc.nextLine();
			for(int n=0;n<row;n++){
				sc.nextLine();
			}
			ArrayList<Integer> al=new ArrayList<Integer>();
			
			for(int n=0;n<4;n++){
				al.add(sc.nextInt());
			}
			for(int n=row;n<4;n++){
				sc.nextLine();
			}
			int row2=sc.nextInt()-1;
			sc.nextLine();
			for(int n=0;n<row2;n++){
				sc.nextLine();
			}
			ArrayList<Integer> al2=new ArrayList<Integer>();
			for(int n=0;n<4;n++){
				al2.add(sc.nextInt());
			}
			for(int n=row2;n<4;n++){
				sc.nextLine();
			}
			int c=0;
			int index=0;
			for(int n=0;n<4;n++){
				if(al2.contains(al.get(n))){
					c++;
					index=n;
				}
			}
			if(c==0){
				System.out.println("Case #"+(tc+1)+": Volunteer cheated!");
			}else if(c==1){
				System.out.println("Case #"+(tc+1)+": "+al.get(index));
			}else{
				System.out.println("Case #"+(tc+1)+": Bad magician!");
			}
		}
	}

}
