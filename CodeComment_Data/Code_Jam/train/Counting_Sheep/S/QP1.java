package methodEmbedding.Counting_Sheep.S.LYD1522;

import java.io.*;
import java.util.*;

public class QP1 {

	public static void main(String[] args) {
		Scanner s= new Scanner (new BufferedReader(new InputStreamReader(System.in)));
		int tc=s.nextInt();
		for (int i=1; i<=tc ;i++){
			int in=s.nextInt();
			if (in==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else {
				ArrayList<Character> a =new ArrayList<Character>(); 
				char [] ch=new char [10];
				a.add('0');
				a.add('1');
				a.add('2');
				a.add('3');
				a.add('4');
				a.add('5');
				a.add('6');
				a.add('7');
				a.add('8');
				a.add('9');
				int n=in,c=1;
				while (!a.isEmpty()){
					n=c*in;
					String st=""+n;
					for (int i3=0; i3<st.length() ;i3++)
						if(a.contains(st.charAt(i3)))
							a.remove(a.indexOf(st.charAt(i3)));
					c++;
				}
				System.out.println("Case #"+i+": "+n);
			}
		}
	}

}
