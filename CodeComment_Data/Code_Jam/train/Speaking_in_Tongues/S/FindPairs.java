package methodEmbedding.Speaking_in_Tongues.S.LYD1433;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
		char [] arr1 = str1.toCharArray();

		String str2 = "our language is impossible to understand";
		char [] arr2 = str2.toCharArray();
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		int i=0;
		for(i=0;i<arr1.length;i++){
			if(!map.containsKey(arr1[i])){
				map.put(arr1[i], arr2[i]);
			}
		}
		
		str1 = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
		arr1 = str1.toCharArray();

		str2 = "there are twenty six factorial possibilities";
		arr2 = str2.toCharArray();
		
		for(i=0;i<arr1.length;i++){
			if(!map.containsKey(arr1[i])){
				map.put(arr1[i], arr2[i]);
			}
		}
		
		str1 = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
		arr1 = str1.toCharArray();

		str2 = "so it is okay if you want to just give up";
		arr2 = str2.toCharArray();
		
		for(i=0;i<arr1.length;i++){
			if(!map.containsKey(arr1[i])){
				map.put(arr1[i], arr2[i]);
			}
		}
		
		/*for(Character ch: map.keySet()){
			System.out.println(ch + " : " + map.get(ch));
		}*/
		
		map.put('q', 'z');
		map.put('z', 'q');
		
		//System.out.println("size of map: " + map.size());
		try{
			
			FileInputStream fstream = new FileInputStream("/Users/mkay/Documents/input_2.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			
			StringBuilder output;
			char[] input;
			int count = 0;
			  while ((strLine = br.readLine()) != null)
			  {
				  output = new StringBuilder();
				  //System.out.println (strLine);
				  input = strLine.toCharArray();
				  if(count != 0 )
				  {
					  for(i=0;i<strLine.length();i++)
					  {
						  output = output.append(map.get(input[i]));
					  }
					  System.out.println("Case #"+ count + ": " + output);
				  }
				  count++;
				  
			  }			  
			  in.close();
			}catch (IOException e)
		    {
				System.err.println("Error: " + e.getMessage());
		    }		
	}

}
