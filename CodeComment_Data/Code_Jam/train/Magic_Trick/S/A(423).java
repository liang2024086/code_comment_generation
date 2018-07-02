package methodEmbedding.Magic_Trick.S.LYD1244;

import java.io.*;
import java.util.*;
public class A
{
   public static void main (String [] args) throws IOException
   {
      BufferedReader f = new BufferedReader (new InputStreamReader(System.in));
      PrintWriter out = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
      int cases = Integer.parseInt (f.readLine ());
      for(int cas = 0; cas < cases; cas++){
         int R1 = Integer.parseInt(f.readLine())-1;
         ArrayList<Integer> t1 = new ArrayList<Integer>(4);
         for(int i=0;i<R1; i++) f.readLine();
         StringTokenizer st = new StringTokenizer(f.readLine());
         for(int i=0; i<4; i++)
            t1.add(Integer.parseInt(st.nextToken()));
         for(int j=R1+1; j<4; j++) f.readLine();
         int R2 = Integer.parseInt(f.readLine())-1;
         for(int i=0;i<R2; i++) f.readLine();
         st = new StringTokenizer(f.readLine());
         ArrayList<Integer> t2 = new ArrayList<Integer>(4);
         for(int i=0; i<4; i++){
            t2.add(Integer.parseInt(st.nextToken()));
         }
         for(int j=R2+1; j<4; j++) f.readLine();
         //System.err.println(t1);
         //System.err.println(t2);
         t1.retainAll(t2);
         //System.err.println(t1);
         switch(t1.size()){
            case 0:
               out.printf("Case #%d: Volunteer cheated!\n",cas+1);
               break;
            case 1:
               out.printf("Case #%d: %d\n",cas+1, t1.get(0));
               break;
            default:
               out.printf("Case #%d: Bad magician!\n",cas+1);
         }
      }
      f.close();
      out.close ();
      System.exit(0);
   }
}
