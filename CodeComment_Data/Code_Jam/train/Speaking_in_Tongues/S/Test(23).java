package methodEmbedding.Speaking_in_Tongues.S.LYD694;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String trans = "yhesocvxduiglbkrztnwjpfmaq";
        Scanner sin = new Scanner(System.in);
        int lines;
        String temp;
        String[] ans;

        lines = sin.nextInt();
        sin.nextLine();
        ans = new String[lines];
        for (int i=0; i<lines; i++) {
        	temp = sin.nextLine();
        	ans[i] = "Case #" + (i + 1) + ": ";
        	for (int j=0; j<temp.length(); j++) {
        		if (temp.charAt(j) == ' ')
        			ans[i] += ' ';
        		else
        		    ans[i] += trans.charAt((int)(temp.charAt(j)) - 97);
        	}
        }
        for (int i=0; i<lines; i++) {
        	System.out.println(ans[i]);
        }
    }
}
