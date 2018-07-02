package methodEmbedding.Speaking_in_Tongues.S.LYD845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;



public class SpeakInTongues {

	/**
	 * @param args
	 */
	
	private static TreeMap<Character,Character> map = new TreeMap<Character,Character>();
	private static String source = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
	private static String target = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
	private static FileReader freader;
	private static BufferedReader buffreader;
	private static FileWriter fwriter;
	private static BufferedWriter buffwriter;
	
	
	
	public static void main(String[] args) throws IOException {
		char[] sourcechar = source.toCharArray();
		char[] targetchar = target.toCharArray();
		for(int i=0; i<source.length(); i++){
			char s = sourcechar[i];
			char t = targetchar[i];
			if(!map.containsKey(s)){
				map.put(s, t);
				//System.out.println(s+"\t"+t);
			}
			else{
				char t2 = map.get(s);
				if(t2!=t)
					System.out.println("Conflict!\t"+t2+"\t"+t);
			}
		}
		map.put('z', 'q');
		map.put('q', 'z');
		map.remove(' ');
		/*System.out.println(map.size());
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			char key = (Character) it.next();
			char value = map.get(key);
			System.out.println(key+"\t"+value);
		}*/
		freader = new FileReader("A-small-attempt1.in");
		buffreader = new BufferedReader(freader);
		fwriter = new FileWriter("output.txt");
		buffwriter= new BufferedWriter(fwriter);
		String str;
		int num = 0;
		int i=1;
		while((str=buffreader.readLine())!=null){
			if(i==1)
				num=Integer.parseInt(str);
			else{
				char[] arr = str.toCharArray();
				char[] finalArr = new char[arr.length];
				for(int j=0; j<arr.length; j++){
					if(arr[j]==' ')
						finalArr[j]=' ';
					else{
						if(!map.containsKey(arr[j]))
							System.out.println("Miss: "+arr[j]);
						else
							finalArr[j]=map.get(arr[j]);
					}
				}
				String finalStr = "Case #"+Integer.toString(i-1)+": "+new String(finalArr)+"\n";
				buffwriter.write(finalStr);
			}
			i++;
		}
		buffreader.close();
		freader.close();
		buffwriter.close();
		fwriter.close();
		//System.out.println(num);

		
		
		

	}

}
