package methodEmbedding.Standing_Ovation.S.LYD498;

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for (int i = 0; i < tc; i++)
        {
            String maxShy = s.next();
            String aud = s.next();
            int inv = 0, ca = 0;
            for (int j = 0; j < aud.length(); j++)
            {
                int current = Character.getNumericValue(aud.charAt(j));
                if (current != 0 && ca < j)
                {
                    int diff = j - ca;
                    ca += diff;
                    inv += diff;
                }
                ca += current;
            }
            System.out.println("Case #"+(i+1)+": "+inv);
        }
    }
}
