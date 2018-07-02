package methodEmbedding.Speaking_in_Tongues.S.LYD1427;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class mapping {
    public static void main(String[] args) throws FileNotFoundException {
        
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("input2.in"));
        char A[]=new char[26];
        for(int i=0;i<3;i++) {
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            
            for(int j=0;j<s1.length();j++) {
                //System.out.println(s1.charAt(j)+" "+s2.charAt(j));
                if((int)s1.charAt(j)>96) 
                    A[(int)(s1.charAt(j))-97]=s2.charAt(j);
            }
        }
        A[(int)('z')-97]='q';
        A[(int)('q')-97]='z';
        for(int i=0;i<26;i++) {
           // System.out.println((char)(i+97)+" "+A[i]);
        }
        
         Scanner sc2 = new Scanner(new File("input.in"));
         int T = sc2.nextInt();
         sc2.nextLine();
        for(int i=0;i<T;i++) {
            String s1=sc2.nextLine();
            String s2="";
            for(int j=0;j<s1.length();j++) {
                if((int)s1.charAt(j)>96) 
                    s2+= A[(int)(s1.charAt(j))-97];
                else
                    s2+=s1.charAt(j);
            }
            System.out.println("Case #"+(i+1)+": "+s2);
        }
        
    }
}
