package methodEmbedding.Counting_Sheep.S.LYD1565;

import java.util.ArrayList;
import java.util.Scanner;

public class Jam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			ArrayList<Character> digits=new ArrayList<Character>();
			ArrayList<Long> list=new ArrayList<Long>();
			Long n=scan.nextLong();
			Long tempe=n;
			boolean iso=false;
			int k=2;
			while(true){
				if(list.contains(n)){
					iso=true;
					break;
				}else{
					list.add(n);
				}
				if(digits.size()==10)
					break;
				
				String s=n.toString();
				for(int j=0;j<s.length();j++){
					if(!digits.contains(s.charAt(j)))
						digits.add(s.charAt(j));
				}
				//System.out.println(n);
				if(digits.size()==10)
					break;
				n=(long) (k*tempe);
				k++;
			}
			if(iso==true)
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			else
				System.out.println("Case #"+(i+1)+": "+n);
		}
	}

}
