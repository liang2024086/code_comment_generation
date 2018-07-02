package methodEmbedding.Revenge_of_the_Pancakes.S.LYD740;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class B {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"B-small.out")));
		// BufferedReader f=new BufferedReader(new FileReader("B.in"));
		// PrintWriter out=new PrintWriter(new BufferedWriter(new
		// FileWriter("B.out")));

		int t;
		t = Integer.parseInt(f.readLine());
		for (int tt = 1; tt <= t; tt++) {
			int ans=-1;
			// form
			int form = -1;
			String s = new String();
			s = f.readLine();
			String newstr = "";
			newstr += s.charAt(0);
			// reduce
			char pre = s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) != pre) {
					pre = s.charAt(i);
					newstr += pre;
				}
			}


			// critical code
			critical: {

				// form 1
				if (newstr.length() == 1 && newstr.charAt(0) == '+')
					form = 1;

				// form 2
				if ((newstr.length() == 2 && newstr.charAt(0) == '-' && newstr
						.charAt(1) == '+')
						|| (newstr.length() == 1 && newstr.charAt(0) == '-'))
					{form = 2;break critical;}

				// form 3
				boolean flag3 = true;
				for (int i = 0; i < newstr.length(); i++) {
					if ((i % 2 == 0 && newstr.charAt(i) == '-')
							|| (i % 2 == 1 && newstr.charAt(i) == '+')) {
						// ok
					} else {
						flag3 = false;
						break;
					}
				}
				if (flag3)
					{form = 3;break critical;}

				// form4
				boolean flag4 = true;
				for (int i = 0; i < newstr.length(); i++) {
					if ((i % 2 == 1 && newstr.charAt(i) == '-')
							|| (i % 2 == 0 && newstr.charAt(i) == '+')) {
						// ok
					} else {
						flag4 = false;
						break;
					}
				}
				if (flag4)
					{form = 4;break critical;}
			}//critical end
			
			//find ans with the help of form value
			if(form==1){
				ans=0;
			}
			else if(form==2){
				ans=1;
			}
			else if(form==4){
				ans=(newstr.length()/2)*2;
			}
			else if(form==3){
				int l=newstr.length();
				if(newstr.charAt(l-1)=='+'){
					ans=(l-2);
				}
				else{
					ans=(l-1);
				}
				ans+=1;
			}

			out.println("Case #" + (tt) + ": " + ans);
		}

		 f.close();out.close();
		 System.out.println("done bro");
	}

}
