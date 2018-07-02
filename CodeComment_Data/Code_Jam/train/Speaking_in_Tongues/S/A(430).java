package methodEmbedding.Speaking_in_Tongues.S.LYD1000;


import java.util.Scanner;

public class A {
    public static void main(String args[]) {
        String abc = "yhesocvxduiglbkrztnwjpfmaq";
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i=0;i<t;i++) {
            String s = in.nextLine();
            System.out.print("Case #"+(i+1)+": ");
            for (int j=0;j<s.length();j++) {
                if (s.charAt(j)>='a' && s.charAt(j)<='z') {
                    System.out.print(abc.charAt(s.charAt(j)-'a'));
                } else 
                    if (s.charAt(j)>='A' && s.charAt(j)<='Z') {
                        System.out.print((char)(abc.charAt(s.charAt(j)-'A')-32));
                    } else System.out.print(s.charAt(j));
              
            }
              System.out.println();
        }
    }
} 
