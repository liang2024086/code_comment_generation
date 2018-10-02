package methodEmbedding.Counting_Sheep.S.LYD99;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author piyu
 */
import java.util.Scanner;
import java.util.TreeSet;
 class CodeJam_sleeping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        long l1,l2=1,l3;
        int t=sc.nextInt();
        int i,N,flag=0;
        char c;
        String s="";
        for(int x=1;x<=t;x++)
        {
            l2=1;
            TreeSet<Character> ts=new TreeSet<>();
            
                ts.add('0');
                ts.add('1');
                ts.add('2');
                ts.add('3');
                ts.add('4');
                ts.add('5');
                ts.add('6');
                ts.add('7');
                ts.add('8');
                ts.add('9');
                
                
                
            l1=sc.nextLong();
            l3=l1;
            
            if(l1==0)
            {
              System.out.println("Case #"+x+": INSOMNIA");
                continue;
            }
            s=""+l3;
            while(!ts.isEmpty())
            {
                for(i=0;i<s.length();i++)
                {
                    s=""+l3;
                    if(ts.contains(s.charAt(i)))
                        ts.remove(s.charAt(i));
                }
               l2++; 
               l3=l1*l2;
            }
                System.out.println("Case #" +x+": "+ s);
            }
        }
    
    }
    
