package methodEmbedding.Magic_Trick.S.LYD2225;

import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(new File(args[0]));
			int nbCase=sc.nextInt();
			for (int i=1;i<=nbCase;i++){
				int answer=sc.nextInt();
				
				ArrayList<Integer> possible=new ArrayList<Integer>();
				for (int j=0;j<answer-1;j++){
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
				
				for (int j=0;j<4;j++) possible.add(new Integer(sc.nextInt()));
				
				for (int j=0;j<4-answer;j++){
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
				
				answer=sc.nextInt();
				for (int j=0;j<answer-1;j++){
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
				
				ArrayList<Integer> res=new ArrayList<Integer>();
				
				for (int j=0;j<4;j++){
					Integer k=new Integer(sc.nextInt());
					if (possible.contains(k)) res.add(k);
				}
				
				for (int j=0;j<4-answer;j++){
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
					sc.nextInt();
				}
				
				if (res.size()==1) System.out.println("Case #"+i+": "+res.get(0));
				else if (res.size()==0) System.out.println("Case #"+i+": Volunteer cheated!");
				else System.out.println("Case #"+i+": Bad magician!");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
