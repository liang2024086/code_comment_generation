package methodEmbedding.Speaking_in_Tongues.S.LYD1561;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author DEV
 */
import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{

            HashMap<Character,String> hm = new HashMap();
            hm.put('a',"y");
            hm.put('b',"h");
            hm.put('c',"e");
            hm.put('d',"s");
            hm.put('e',"o");
            hm.put('f',"c");
            hm.put('g',"v");
            hm.put('h',"x");
            hm.put('i',"d");
            hm.put('j',"u");
            hm.put('k',"i");
            hm.put('l',"g");
            hm.put('m',"l");
            hm.put('n',"b");
            hm.put('o',"k");
            hm.put('p',"r");
            hm.put('q',"z");
            hm.put('r',"t");
            hm.put('s',"n");
            hm.put('t',"w");
            hm.put('u',"j");
            hm.put('v',"p");
            hm.put('w',"f");
            hm.put('x',"m");
            hm.put('y',"a");
            hm.put('z',"q");
           BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            // BufferedReader bf = new BufferedReader(new FileReader("input.in"));
            int t = Integer.parseInt(bf.readLine());
            for(int i=0;i<t;i++){

                String s = bf.readLine();
               System.out.print("Case #"+(i+1)+": ");
                StringBuilder m=new StringBuilder();
                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)!=' ')
                        m.append(hm.get(s.charAt(j)));
                    else
                        m.append(" ");

                }
                System.out.println(m.toString());
            }





        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        }

    }


