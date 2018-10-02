package methodEmbedding.Speaking_in_Tongues.S.LYD474;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author USER-1
 */
import java.io.*;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
    try
    {
     BufferedReader br=new BufferedReader(new FileReader("a1.in.txt"));
     PrintWriter out=new PrintWriter(new FileWriter("out.txt"));
    java.util.Hashtable<String,String> mn=new Hashtable<String,String>();
    mn.put("e","o");
    mn.put("j","u");
    mn.put("p","r");
    mn.put("m","l");
    mn.put("y","a");
    mn.put("s","n");
    mn.put("l","g");
    mn.put("c","e");
    mn.put("k","i");
    mn.put("d","s");
    mn.put("x","m");
    mn.put("v","p");
    mn.put("d","s");
    mn.put("n","b");
    mn.put("m","l");
    mn.put("r","t");
    mn.put("i","d");
    mn.put("a","y");
    mn.put("b","h");
    mn.put("f","c");
    mn.put("g","v");
    mn.put("h","x");
    mn.put("g","v");
    mn.put("h","x");
    mn.put("q","z");
    mn.put("t","w");
    mn.put("u","j");
    mn.put("w","f");
    mn.put("o","k");
    mn.put("z","q");
    mn.put(" ", " ");
    System.out.println(mn.keySet().toArray().length);
    int u=0,u1=Integer.parseInt(br.readLine());
    while(u<u1)
    {
    String y=br.readLine();
    String temp="";
    int c1=0;
    while(c1<y.length())
    {
    temp=temp+mn.get(String.valueOf(y.charAt(c1)));
    c1++;
    }
    out.println("Case #"+(u+1)+":"+" "+temp);
    System.out.println("Case #"+(u+1)+":"+" "+temp);
    u++;
    }
    out.flush();

    }catch(Exception e1)
    {
     System.out.print(e1);
    }
    finally
    {
    
    }
    }

}
