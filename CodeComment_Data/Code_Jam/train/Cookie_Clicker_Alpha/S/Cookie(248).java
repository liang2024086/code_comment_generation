package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1583;


import java.io.*;
import java.util.*;

public class Cookie {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TODO Auto-generated method stubScanner 
	Scanner sc=new Scanner(new BufferedReader(new InputStreamReader (new FileInputStream("CodeJam2014/cookie/B-small-attempt0.in"))));
		//Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter ou=new PrintWriter(new FileWriter("CodeJam2014/cookie/testout.out"));
		int res,rep,i,j;
		double c,x,f,ans,pr,co;
		String out="";
		
		res=sc.nextInt();
		for(rep=1;rep<=res;rep++){
			
			c=sc.nextDouble();
			f=sc.nextDouble();
			x=sc.nextDouble();
			ans=0; pr=2; co=0;
			while(true){
				if (c*(pr+f)>=f*x) break;
				ans+=c/pr;
				pr+=f;
			}
			ans+=x/pr;
			out+=out.format("Case #%d: %.7f",rep,ans);
			if (rep!=res) out+="\n";
		}
		System.out.println(out);
		ou.print(out);
		ou.close();
	}

}
