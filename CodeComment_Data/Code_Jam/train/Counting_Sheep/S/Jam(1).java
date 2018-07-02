package methodEmbedding.Counting_Sheep.S.LYD1570;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Jam {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int t=read.nextInt();
		read.nextLine();
		for(int i=1;i<=t;i++){
			int c=0;
			int n=read.nextInt();
			if(n!=0){
				Set SetDigis= new HashSet<Character>();
				while(SetDigis.size()!=10){
					c++;
					String nro=Integer.toString(n*c);
					for(int j=0;j<nro.length();j++) SetDigis.add(nro.charAt(j));
				}
				System.out.println("Case #"+i +": "+ n*c);
			}
			else System.out.println("Case #"+i +": INSOMNIA");
		}
	}
}
