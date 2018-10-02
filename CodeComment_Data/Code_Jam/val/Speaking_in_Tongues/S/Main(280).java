package methodEmbedding.Speaking_in_Tongues.S.LYD532;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = Integer.parseInt(in.nextLine());
        String s = "";
        String res = "";
        for(int i = 0; i < n; i++){
            s = in.nextLine();
            res = "";
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'a')res+='y';
                else if(s.charAt(j) == 'b')res+='h';
                else if(s.charAt(j) == 'c')res+='e';
                else if(s.charAt(j) == 'd')res+='s';
                else if(s.charAt(j) == 'e')res+='o';
                else if(s.charAt(j) == 'f')res+='c';
                else if(s.charAt(j) == 'g')res+='v';
                else if(s.charAt(j) == 'h')res+='x';
                else if(s.charAt(j) == 'i')res+='d';
                else if(s.charAt(j) == 'j')res+='u';
                else if(s.charAt(j) == 'k')res+='i';
                else if(s.charAt(j) == 'l')res+='g';
                else if(s.charAt(j) == 'm')res+='l';
                else if(s.charAt(j) == 'n')res+='b';
                else if(s.charAt(j) == 'o')res+='k';
                else if(s.charAt(j) == 'p')res+='r';
                else if(s.charAt(j) == 'q')res+='z';
                else if(s.charAt(j) == 'r')res+='t';
                else if(s.charAt(j) == 's')res+='n';
                else if(s.charAt(j) == 't')res+='w';
                else if(s.charAt(j) == 'u')res+='j';
                else if(s.charAt(j) == 'v')res+='p';
                else if(s.charAt(j) == 'w')res+='f';
                else if(s.charAt(j) == 'x')res+='m';
                else if(s.charAt(j) == 'y')res+='a';
                else if(s.charAt(j) == 'z')res+='q';
                else if(s.charAt(j) == ' ')res+=" ";
            }
            System.out.println("Case #" + (i + 1) + ": " + res);
        }
    }
}
