package methodEmbedding.Counting_Sheep.S.LYD1425;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class CodeJam2016AS {

	public static void main(String[] args)throws Exception  {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
		StringBuilder sb = new StringBuilder();
		for(String ln;(ln=in.readLine())!=null;){
			int casos = Integer.parseInt(ln);
			int ca = 1;
			while(casos-->0){
				int N = Integer.parseInt(in.readLine());
				Set<Integer> s = new TreeSet<Integer>();
				Set<Long> nums = new TreeSet<Long>();
				int cont = 1;
				long x = 0;
				while(s.size()<10){
					x = N*cont;
					if(nums.contains(x))
						break;
					else
						nums.add(x);
					String num = (x)+"";
					for(int i=0;i<num.length();++i)
						s.add(num.charAt(i)-'0');
					cont++;
				}
				if(s.size()<10){
					sb.append("Case #"+ca+": INSOMNIA\n");
				}else{
					sb.append("Case #"+ca+": "+x+"\n");
				}
				ca++;
			}
		}
		System.out.print(new String(sb));
	}

}
