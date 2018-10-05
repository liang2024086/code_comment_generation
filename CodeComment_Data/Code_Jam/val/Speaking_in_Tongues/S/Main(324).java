package methodEmbedding.Speaking_in_Tongues.S.LYD1455;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		HashMap<Character, Character> M=new HashMap<Character, Character>();
		 M.put('f', 'c');
		 M.put('g', 'v');
		 M.put('d', 's');
		 M.put('e', 'o');
		 M.put('b', 'h');
		 M.put('c', 'e');
		 M.put('a', 'y');
		 M.put('n', 'b');
		 M.put('o', 'k');
		 M.put('l', 'g');
		 M.put('m', 'l');
		 M.put('j', 'u');
		 M.put('k', 'i');
		 M.put('h', 'x');
		 M.put('i', 'd');
		 M.put('w', 'f');
		 M.put('v', 'p');
		 M.put('u', 'j');
		 M.put('t', 'w');
		 M.put('s', 'n');
		 M.put('r', 't');
		 M.put('p', 'r');
		 M.put('y', 'a');
		 M.put('x', 'm');
		 M.put('q', 'z');
		 M.put('z', 'q');
		 String x;
		 try{
			 int t=Integer.parseInt(in.nextLine());
			 for(int i=1;i<=t;i++){
				 x=in.nextLine();
				 char A[]=x.toCharArray();
				 for(int j=0;j<A.length;j++){
					 if(A[j]>='a'&&A[j]<='z')
						 A[j]=M.get(A[j]);
					 else if(A[j]>='A'&&A[j]<='Z')
						 A[j]=(char)(M.get(A[j]+32)-32);
				 }
				 System.out.println("Case #"+i+": "+new String(A));
			 }	 
		 }catch (Exception e) {
		}
	}	
}
