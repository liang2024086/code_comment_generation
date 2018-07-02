package methodEmbedding.Speaking_in_Tongues.S.LYD1188;

import java.util.Scanner;

public class Decode
{
    public static void main(String[] args)
    {
        final String alphabet="ynficwlbkuomxsevzpdrjgthaq";

        Scanner jin=new Scanner(System.in);
        int numtries=jin.nextInt();

        jin.nextLine();
        for(int line=0; line<numtries; line++)
        {
            String input=jin.nextLine();

            System.out.print("Case #"+(line+1)+": ");
            for(int charac=0; charac<input.length(); charac++)
                if(input.charAt(charac)>='a' && input.charAt(charac)<='z')
                    System.out.print((char)('a'+(char)alphabet.indexOf(input.charAt(charac))));
                else
                    System.out.print(input.charAt(charac));

            System.out.println();
        }
    }
}
