package methodEmbedding.Speaking_in_Tongues.S.LYD604;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
class A {
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s; int count = 1;
		
		String one = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		String two = "our language is impossible to understand";
		HashMap<String, String> hm = new HashMap<String, String>();
		for(int i = 0; i < one.length(); i++ ){
			hm.put(one.charAt(i)+"", two.charAt(i)+"");
		}
		String three = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		String four = "there are twenty six factorial possibilities";
		
		for(int i = 0; i < three.length(); i++ ){
			hm.put(three.charAt(i)+"", four.charAt(i)+"");
		}
		String five = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		String six = "so it is okay if you want to just give up";
		
		for(int i = 0; i < five.length(); i++ ){
			hm.put(five.charAt(i)+"", six.charAt(i)+"");
		}
		
		hm.put("q", "z");
		hm.put("z", "q");
		int num = Integer.parseInt(in.readLine());
		while(num-- != 0){
			s = in.readLine();
			String temp = "";
			for(int i = 0; i < s.length(); i++){
				temp += hm.get(s.charAt(i)+"");
			}
			
			System.out.println("Case #"+ count++ +": " +temp.trim());
			
		}
		
	
	
	}

}
