package methodEmbedding.Speaking_in_Tongues.S.LYD967;

import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] cypher = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};

	HashMap<Character,Character> map = new HashMap<Character,Character>();
	for(int i=0; i<alpha.length; i++)
	    map.put(cypher[i],alpha[i]);

	int n = sc.nextInt();
	sc.nextLine();
	int caseNum = 0;

	while(n!=0){

	    String line = sc.nextLine();
	    String[] each = line.split(" ");
	    for(int i=0; i<each.length; i++){
		char[] c = each[i].toCharArray();
		for(int j=0; j<c.length; j++){
		    c[j] = map.get(c[j]);
		}
		each[i] = new String(c);
	    }

	    caseNum++;
	    System.out.print("Case #"+caseNum+":");
	    for(int i=0; i<each.length; i++){
		System.out.print(" "+each[i]);
	    }
	    System.out.println();
	    n--;
	}
    }
}
