package methodEmbedding.Revenge_of_the_Pancakes.S.LYD33;


import java.util.Scanner;

public class ROTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		for(int i=1;i<=cases;i++){
			String problem = in.next();
			int l = problem.length()-1;
			while(problem.charAt(l)!='-'){
				l--;
				if(l<0)
					break;
			}
			//System.out.println(l);
			int count;
			if(l<0){
				count=0;
			}
			else{
				char current = problem.charAt(l);
				count = 1;
				for(int x=l-1;x>=0;x--){
					char now = problem.charAt(x);
					//System.out.println(current+" "+now);
					if(current!=now){
						count++;
						current = now;
					}
				}
			}
			System.out.println("Case #"+i+": "+count);
		}
	}

}
