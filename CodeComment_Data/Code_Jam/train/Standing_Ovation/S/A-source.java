package methodEmbedding.Standing_Ovation.S.LYD1754;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while((s=br.readLine())!=null){
			int t = Integer.parseInt(s);
			for(int c=0;c<t;c++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				int smax = Integer.parseInt(st.nextToken());
				int y = 0;
				int ps = 0;
				String data = st.nextToken();
				for(int i=0;i<smax && ps<smax;i++){
					int number = Integer.parseInt(String.valueOf(data.charAt(i)));
					if(number!=0){
						ps+=number;
					}else{
						if(ps<=i){
							ps++;
							y++;
						}
					}
				}
				System.out.println("Case #"+(c+1)+": "+y);
			}
		}
	}
}
