package methodEmbedding.Counting_Sheep.S.LYD1224;


import java.util.*;
public class Poorsheep{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); 
		for (int i=0;i<t;i++){
			int N = sc.nextInt();
			int count =1;
			Set<Character> set = new HashSet<Character>();
			if(N==0){System.out.println("Case #" + (i+1) + ": INSOMNIA" );}
			else{
			while(count!=0){
			int val = count*N;		
			String val_str = Integer.toString(val);
			int val_length = val_str.length();
			for (int j =0;j< val_length;j++){					
				set.add(val_str.charAt(j));
			}
			if(set.size()==10){
				System.out.println("Case #" + (i+1) + ": " + val);
				break;
			}
			else{
			count +=1;
			}
			}
		}
		}
	}

}
