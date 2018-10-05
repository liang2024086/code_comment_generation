package methodEmbedding.Speaking_in_Tongues.S.LYD1337;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();
        String s = sc.nextLine();
        int l=1;
        for (int i = 0; i < pocet; i++) {
            s = sc.nextLine();
            System.out.print("Case #"+ l + ": ");
            l++;
            for (int j = 0; j < s.length(); j++) {
                char pismeno = s.charAt(j);
                if(pismeno=='a') System.out.print("y");
                if(pismeno=='b') System.out.print("h");
                if(pismeno=='c') System.out.print("e");
                if(pismeno=='d') System.out.print("s");
                if(pismeno=='e') System.out.print("o");
                if(pismeno=='f') System.out.print("c");
                if(pismeno=='g') System.out.print("v");
                if(pismeno=='h') System.out.print("x");
                if(pismeno=='i') System.out.print("d");
                if(pismeno=='j') System.out.print("u");    
                if(pismeno=='k') System.out.print("i"); 
                if(pismeno=='l') System.out.print("g");
                if(pismeno=='m') System.out.print("l");
                if(pismeno== 'n')System.out.print("b");          
                if(pismeno=='o') System.out.print("k");
                if(pismeno=='p') System.out.print("r");       
                if(pismeno=='q') System.out.print("z");
                if(pismeno=='r') System.out.print("t");
                if(pismeno=='s') System.out.print("n");
                if(pismeno=='t') System.out.print("w");
                if(pismeno=='u') System.out.print("j");     
                if(pismeno=='v') System.out.print("p");
                if(pismeno=='w') System.out.print("f");    
                if(pismeno=='x') System.out.print("m");
                if(pismeno=='y') System.out.print("a");
                if(pismeno=='z') System.out.print("q");
                if(pismeno==' ') System.out.print(" ");
                
            }
            System.out.println("");
        }
    }
}
