package methodEmbedding.Speaking_in_Tongues.S.LYD915;

import java.util.*;
public class Tongues {
	public static void main(String args[]){
		HashMap hm=new HashMap();
		String input="ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String output="our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
		for(int i = 0; i < input.length(); i++)
		{
		   char c = input.charAt(i);
		   char d=  output.charAt(i);
		   hm.put(c, d);
		}
		hm.put('q', 'z');
		hm.put('e', 'o');
		hm.put('y', 'a');
		hm.put('z', 'q');
		
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();scan.nextLine();
		String in=null;
		for(int j=0;j<t;j++){
			in=scan.nextLine();
			System.out.print("Case #"+(j+1)+": ");
			for(int i = 0; i < in.length(); i++){
				if(hm.containsKey(in.charAt(i)))
					System.out.print(hm.get(in.charAt(i)));
				else
					System.out.print(in.charAt(i));
					
			}
			System.out.println();
			
		}
		/*String abc="abcdefghijklmnopqrstuvwxyz";
		for(int i = 0; i < abc.length(); i++){
			System.out.print(abc.charAt(i)+"---->");
			//if(hm.containsKey(abc.charAt(i)))
				System.out.print(hm.get(abc.charAt(i)));
			//else
				//System.out.print(abc.charAt(i));
				System.out.println();
		}
		for(int i = 0; i < abc.length(); i++){
			if(!hm.containsValue(abc.charAt(i)))
					System.out.println("missing char"+abc.charAt(i));
		}*/
		
		
	}

}
