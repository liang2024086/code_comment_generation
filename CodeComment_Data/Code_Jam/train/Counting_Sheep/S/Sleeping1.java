package methodEmbedding.Counting_Sheep.S.LYD822;


/**
 *
 * @author Dell
 */

import java.util.Scanner;
import java.util.TreeSet;
 public class Sleeping {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long long11;
        long long12=1;
        long long13;
        int test=sc.nextInt();
        int j,N;
        char c;
        String str="";
        for(int k=1;k<=test;k++)
        {
            long12=1;
            TreeSet<Character> treeset=new TreeSet<>();
            
                treeset.add('0');
                treeset.add('1');
                treeset.add('2');
                treeset.add('3');
                treeset.add('4');
                treeset.add('5');
                treeset.add('6');
                treeset.add('7');
                treeset.add('8');
                treeset.add('9');
                
                
                
            long11=sc.nextLong();
            long13=long11;
            
            if(long11==0)
            {
              System.out.println("Case #"+k+": INSOMNIA");
                continue;
            }
            str=""+long13;
            while(!treeset.isEmpty())
            {
                for(j=0;j<str.length();j++)
                {
                    str=""+long13;
                    if(treeset.contains(str.charAt(j)))
                        treeset.remove(str.charAt(j));
                }
               long12++; 
               long13=long11*long12;
            }
                System.out.println("Case #" +k+": "+ str);
            }
        }
    
    }
    
