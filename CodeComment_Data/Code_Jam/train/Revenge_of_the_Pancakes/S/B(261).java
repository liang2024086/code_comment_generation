package methodEmbedding.Revenge_of_the_Pancakes.S.LYD77;

public class B {
	public static void main(String args[]){
		for(int a=1;a<args.length;a++){
			String input = args[a]+"+";
			int count = 0;
			char current = input.charAt(0);
			for(int i=1;i<input.length();i++){
				char c = input.charAt(i);
				if(c != current){
					count++;
					current = c;
				}
			}
			System.out.println("Case #"+a+": "+count);
		}
	}
}
