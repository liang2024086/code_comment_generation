package methodEmbedding.Counting_Sheep.S.LYD259;

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		int n=lee.nextInt();
		for (int i = 1; i <= n; i++) {
			int r=lee.nextInt();
			boolean []v=new boolean[10];
			Arrays.fill(v, false);
			String cad="";
			int pd=1;
			if(r==0)
				System.out.println("Case #"+i+": INSOMNIA");
			else{
				int cd=0;
				int t=r;
				while(cd==0){
					char x;
					cad=Integer.toString(t);
					for (int j = 0; j < cad.length(); j++) {
						x=cad.charAt(j);
						int k=Integer.parseInt(x+"");
						v[k]=true;
					}
					int kk=0;
					for (int j = 0; j < v.length; j++) {
						if(v[j]!=true){
							kk=1;
							break;
						}
					}
					if(kk==0)
						break;
					else
						t=r*pd;
					pd++;
				}
				System.out.println("Case #"+i+": "+t);
			}
		}
	}
}
