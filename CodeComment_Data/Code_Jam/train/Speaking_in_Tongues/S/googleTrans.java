package methodEmbedding.Speaking_in_Tongues.S.LYD1229;

import java.util.*;
public class googleTrans 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char eng[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char google[] = {'y','n','f','i','c','w','l','b','k','u','o','m','x','s','e','v','z','p','d','r','j','g','t','h','a','q'};
        HashMap<Character, Character> map = new HashMap<Character, Character> ();
        for(int i=0 ; i<eng.length ; i++)
        	map.put(google[i], eng[i]);
        int n = scan.nextInt();
        scan.nextLine();
        for(int c=1 ; c<=n ; c++)
        {
        	StringBuilder str = new StringBuilder(scan.nextLine());
        	for(int i=0 ; i<str.length() ; i++)
        		if(map.containsKey(str.charAt(i)))
        			str = str.replace(i, i+1, map.get(str.charAt(i))+"");
        	System.out.println("Case #"+c+": "+str);
        }
	}

}
