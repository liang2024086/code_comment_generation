package methodEmbedding.Counting_Sheep.S.LYD316;



/**
 *
 * @author pawan
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
        long long1;
        long long2=1;
        long long3;
        int test=sc.nextInt();
        int j,N;
        char c;
        String str="";
        for(int k=1;k<=test;k++)
        {
            long2=1;
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
                
                
                
            long1=sc.nextLong();
            long3=long1;
            
            if(long1==0)
            {
              System.out.println("Case #"+k+": INSOMNIA");
                continue;
            }
            str=""+long3;
            while(!treeset.isEmpty())
            {
                for(j=0;j<str.length();j++)
                {
                    str=""+long3;
                    if(treeset.contains(str.charAt(j)))
                        treeset.remove(str.charAt(j));
                }
               long2++; 
               long3=long1*long2;
            }
                System.out.println("Case #" +k+": "+ str);
            }
        }
    
    }
    
