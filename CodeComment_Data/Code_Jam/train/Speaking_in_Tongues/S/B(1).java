package methodEmbedding.Speaking_in_Tongues.S.LYD221;

public class B {
   static java.util.HashMap<Character,Character> cmap = new java.util.HashMap<Character,Character>();
   static {
      cmap.put('a' , 'y');
cmap.put('b' , 'h');
cmap.put('c' , 'e');
cmap.put('d' , 's');
cmap.put('e' , 'o');
cmap.put('f' , 'c');
cmap.put('g' , 'v');
cmap.put('h' , 'x');
cmap.put('i' , 'd');
cmap.put('j' , 'u');
cmap.put('k' , 'i');
cmap.put('l' , 'g');
cmap.put('m' , 'l');
cmap.put('n' , 'b');
cmap.put('o' , 'k');
cmap.put('p' , 'r');
cmap.put('q' , 'z');
cmap.put('r' , 't');
cmap.put('s' , 'n');
cmap.put('t' , 'w');
cmap.put('u' , 'j');
cmap.put('v' , 'p');
cmap.put('w' , 'f');
cmap.put('x' , 'm');
cmap.put('y' , 'a');
cmap.put('z' , 'q');
   }

   public static void main(String[] arg) {
      java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

      java.util.TreeMap<Character, Character> map = new java.util.TreeMap<Character, Character>();

      try {
         String line;
         java.util.ArrayList<String> lines = new java.util.ArrayList<String>();
         while((line = in.readLine())!=null) {
              lines.add(line);
         }

         for(int i=1;i<lines.size();i++) {
              line = lines.get(i);
              StringBuffer b = new StringBuffer();
              
              for(int j=0;j<line.length();j++) {
                  char c=line.charAt(j);
                  if(cmap.get(c)!=null) {
                      b.append(cmap.get(c));
                  } else {
                      b.append(c);
                  }
              } 

              System.out.println(b); 
         }
        
      } catch(Exception e) {
      }
   }
}
