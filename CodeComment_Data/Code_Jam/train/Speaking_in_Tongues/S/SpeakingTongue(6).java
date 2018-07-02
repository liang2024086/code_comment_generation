package methodEmbedding.Speaking_in_Tongues.S.LYD1297;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SpeakingTongue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Map<Character,Character> mapping = new HashMap<>();
			mapping.put('o', 'e');
			mapping.put('a', 'y');
			mapping.put('z', 'q');
			mapping.put('q', 'z');
			{
				Scanner scanner = new Scanner(new File("D://ans.txt"));
				int count = 6;

				for(int i=0;i<count;i++)
				{
					char[] ori = scanner.nextLine().trim().toCharArray();
					i++;
					char[] decoded = scanner.nextLine().trim().toCharArray();

					for(int j=0;j<ori.length;j++)
					{
//						System.out.println(ori[j]+" "+decoded[j]);
						
						mapping.put(ori[j], decoded[j]);
					}
				}
			}
			
			Map<Character,String> list = new HashMap<Character, String>();
			for(int i='a';i<='z';i++)
			{
				list.put((char)i,"");
			}
			
			for(char each:mapping.values())
			{
				list.remove(each);
			}
			
//			System.out.println(list);
//			
//			System.out.println(mapping);
			
			{
				Scanner scanner = new Scanner(new File("D://A-small-attempt1.in"));
				int count = Integer.parseInt(scanner.nextLine());
				//System.out.println(count);
				for(int i=0;i<count;i++)
				{
					String ori = scanner.nextLine();
					StringBuilder strB = new StringBuilder();
					for(char each:ori.toCharArray())
					{
						if(each==' ')
						{
							strB.append(' ');
						}
						else
						{
							boolean isUpper=false;
							if(Character.isUpperCase(each))
							{
								isUpper=true;
								each=Character.toLowerCase(each);
							}
							
							if(mapping.get(each)==null)
							{
								throw new NullPointerException("no mapping for:"+each);
							}
							if(isUpper)
								strB.append(Character.toUpperCase(mapping.get(each)));
							else
								strB.append(mapping.get(each));
						}
					
					}
					
					System.out.println("Case #"+(i+1)+": "+strB);
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
