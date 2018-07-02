package methodEmbedding.Revenge_of_the_Pancakes.S.LYD133;

/**
 * Author :- Harsh Chaudhari 
 * College :- DAIICT
 */
import java.util.*;
import java.io.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		//Main code starts from here
		int t = s.nextInt();
		while(t-->0){
			char st[] = s.next().toCharArray();
			int len = st.length,count = 0,ans = 0;
			char last = st[0];
			for(int i=0;i<len-1;i++){
				if(st[i]!=st[i+1]){
					count++;
					last = st[i+1];
				}
			}
			if(last=='-')
				ans = count + 1;
			else
				ans  = count;
			out.println(ans);
		}
		//Ends here
		out.close();
	}

}
