package methodEmbedding.Speaking_in_Tongues.S.LYD500;

   import java.util.*;
   import java.io.*;

    class googlerese
   {
       public static void main(String[] args) throws Exception
      {
         BufferedReader in = new BufferedReader(new FileReader("googlerese.in"));
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("googlerese.out")));
      
         int n = Integer.parseInt(in.readLine());
      
         Map<Character, Character> map = new HashMap<Character, Character>();
      	//fill map
			map.put('a', 'y');
   		map.put('b', 'h');
			map.put('c', 'e');
			map.put('d', 's');
			map.put('e', 'o');
			map.put('f', 'c');
			map.put('g', 'v');
			map.put('h', 'x');
			map.put('i', 'd');
			map.put('j', 'u');
			map.put('k', 'i');
			map.put('l', 'g');
			map.put('m', 'l');
			map.put('n', 'b');
			map.put('o', 'k');
			map.put('p', 'r');
			map.put('q', 'z');
			map.put('r', 't');
			map.put('s', 'n');
			map.put('t', 'w');
			map.put('u', 'j');
			map.put('v', 'p');
			map.put('w', 'f');
			map.put('x', 'm');
			map.put('y', 'a');
			map.put('z', 'q');
			map.put(' ', ' ');
			
			
			
			   	
			for(int x = 0; x<n; x++)
         {
            out.print("Case #" + (x+1) + ": ");
				String curr = in.readLine();
				int len = curr.length();
				for(int y = 0; y<len; y++)
				{
					out.print(map.get(curr.charAt(y)));
				}
				out.println();
         }
			out.close();
      }
   }
