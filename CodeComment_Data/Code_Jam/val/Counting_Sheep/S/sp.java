package methodEmbedding.Counting_Sheep.S.LYD360;

import java.util.Scanner;
import java.util.TreeSet;
 public class Sleeping {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long lo1;
        long lo2=1;
        long lo3;
        int test=sc.nextInt();
        int j,N;
        char c;
        String str="";
        for(int k=1;k<=test;k++)
        {
            lo2=1;
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
                
                
                
            lo1=sc.nextLong();
            lo3=lo1;
            
            if(lo1==0)
            {
              System.out.println("Case #"+k+": INSOMNIA");
                continue;
            }
            str=""+lo3;
            while(!treeset.isEmpty())
            {
                for(j=0;j<str.length();j++)
                {
                    str=""+lo3;
                    if(treeset.contains(str.charAt(j)))
                        treeset.remove(str.charAt(j));
                }
               lo2++; 
               lo3=lo1*lo2;
            }
                System.out.println("Case #" +k+": "+ str);
            }
        }
    
    }
