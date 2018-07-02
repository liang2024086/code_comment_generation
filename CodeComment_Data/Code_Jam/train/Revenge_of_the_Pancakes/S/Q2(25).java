package methodEmbedding.Revenge_of_the_Pancakes.S.LYD28;

import java.util.Scanner;


public class Class6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int T;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		int ans[]=new int[T];
		for(int i=0;i<T;i++){
			String a=sc.next();
			//char[] seq=a.toCharArray();
			StringBuilder c=new StringBuilder(a.substring(0,a.lastIndexOf('-')+1));
			while(true){
				//System.out.println(a.lastIndexOf("-"));
				if(c.lastIndexOf("-")==-1)break;
				c=new StringBuilder(c.substring(0,c.lastIndexOf("-")+1));
				if(c.charAt(0)=='-'){
					c=c.reverse();
					for(int j=0;j<c.length();j++){
						if(c.charAt(j)=='+')
						c=c.replace(j, j+1, "-");
						else
							c=c.replace(j,j+1, "+");
					}
					ans[i]=ans[i]+1;
				}
				else if(c.charAt(0)=='+'){
					int p=0;
					while(c.charAt(p)!='-'){
						c=c.replace(p,p+1, "-");
						p++;
					}
					ans[i]=ans[i]+1;
				}
			}
				
			
			
		}sc.close();
		for(int i=0;i<T;i++){
			System.out.println("Case #"+(i+1)+": "+ans[i]);
		}
	}

}

