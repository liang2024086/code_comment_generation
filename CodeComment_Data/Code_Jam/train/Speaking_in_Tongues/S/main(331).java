package methodEmbedding.Speaking_in_Tongues.S.LYD232;

import java.io.*;

class main{
    public static void main(String[] args) throws IOException {
	int loop_num;

	char a = 'a';
	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
	char[] table = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q',' '}; 
	
	BufferedReader r = 
	    new BufferedReader(new InputStreamReader(System.in));
	String s = r.readLine();
	// char b = ' ';
	// System.out.println((int)b);
	int loopnum= Integer.parseInt(s);

	for(int i=0;i<loopnum;i++){
	    String lines = r.readLine();
	    String abc="";
	    for(int j=0;j<lines.length();j++){
		//		System.out.println(lines.charAt(j));
		if(lines.charAt(j)==' ') abc +=' ';
		else{
		    abc += table[(int)lines.charAt(j)-(int)a];
		}
		//		abc += lines.cha
		//		    lines = lines.replaceAll(String.valueOf(table[j]),String.valueOf(alpha[j]));

	    }
	    System.out.print("Case #" + (i+1) + ": ");
	    System.out.println(abc);
	    
	}
	// char a = 'a';
	// System.out.println((int)a);
    }
    
}

