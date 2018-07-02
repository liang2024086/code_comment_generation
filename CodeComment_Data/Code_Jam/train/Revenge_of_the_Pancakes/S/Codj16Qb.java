package methodEmbedding.Revenge_of_the_Pancakes.S.LYD219;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codj16Qb {

	public static void main(String[] args) throws IOException {
		
		int T,x = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		T = Integer.parseInt(br.readLine());
		if(1>T || T> 100)
			return ;
//		char ary[] = new char[10];
		while(T != 0)
		{
			T--;
			x++;
			int len, count = 0;
			String str;
			str = br.readLine();
			len = str.length();
			char strc[] = str.toCharArray();			// new char[len];
			
//			System.out.println(str);
			
			for(int i = len-1; i >= 0; i--)
			{
				if(strc[i] == '-' && i == 0)
				{	
					count += 1;
					break;
				}
				if(strc[i] == '-' && strc[i-1] == '+')
				{	
					count += 2;
				}
			
			}
			
						
			String prnt = count + "";
			System.out.println("Case #" + x + ": " + prnt);
		}
	}
}
