package methodEmbedding.Speaking_in_Tongues.S.LYD198;



import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Test1 {

	static String[] orig = {"ejp mysljylc kd kxveddknmc re jsicpdrysi", "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd","de kr kd eoya kw aej tysr re ujdr lkgc jv"};
	static String[] target = {"our language is impossible to understand","there are twenty six factorial possibilities","so it is okay if you want to just give up"};
	static int[] map = new int[26];
	static int[] hash = new int[26];
	public static void main(String[] args) {

	for (int i=0; i<26; i++) {
		map[i]=-1; hash[i]=0;
	}
	for (int i=0; i<3; i++) {
		for(int j=0; j<orig[i].length(); j++){
			if (orig[i].charAt(j) == ' ') continue;
			if (map[orig[i].charAt(j)-'a'] == -1) {
				map[orig[i].charAt(j)-'a'] = target[i].charAt(j)-'a';
				hash[target[i].charAt(j)-'a'] = 1;
			}
		}
	}
	int missing = -1;
	
	map[16]=25;
	map[25]=16;
	for (int i=0; i<26; i++) {
		if (map[i] == -1) map[i]= missing;
		//System.out.println(i+":"+(char)(map[i]+'a'));
	}
	
    int n;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
    try {
    	
    	String str = in.readLine();
    	String inputString;
    	n = Integer.parseInt(str.trim());
    	for (int i = 1; i <= n; i++) {
    		inputString = in.readLine();
    		System.out.print("Case #"+i+": ");
    		for (int j=0; j<inputString.length();j++){
    			if (inputString.charAt(j)==' ') System.out.print(" ");
    			else System.out.print(""+(char)(map[inputString.charAt(j)-'a']+'a'));
    		}
    		System.out.println("");
    	}
    } catch (Exception e) {
    	
    }
	}
}

