package methodEmbedding.Revenge_of_the_Pancakes.S.LYD734;

import java.util.Scanner;
public class Revenge_Pancakes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String cases[] = new String[T];
		int ans[] = new int[T];
		for(int i=0; i<T; i++){
			cases[i] = in.next();
			String str = cases[i];
			int count = 0;
			if(str.length()<2){
				if(str.contains("-")){
					ans[i] = 1;
				}else{
					ans[i] = 0;
				}
			}else{
				while(str.length()>0){
					int start = str.length();
					String substr = str.substring(0, 1);
					for(int j=0; j<str.length(); j++){
						if(!str.substring(j,j+1).equals(substr)){
							start = j;
							break;
						}
					}
					if(start == str.length()){
						if(str.contains("-")){
							count++;
						}
					}else{
						count++;
					}
					str = str.substring(start);
				}
				ans[i] = count;
			}
		}
		for(int i=0; i<T; i++){
			System.out.println("Case #"+(i+1)+": "+ans[i]);
		}
		in.close();
	}
}
