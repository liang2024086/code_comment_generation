package methodEmbedding.Standing_Ovation.S.LYD1702;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static String input =
            "100\n" +
                    "4 00001\n" +
                    "0 6\n" +
                    "0 1\n" +
                    "6 0221212\n" +
                    "6 8901001\n" +
                    "5 222122\n" +
                    "2 121\n" +
                    "1 01\n" +
                    "1 42\n" +
                    "2 164\n" +
                    "1 21\n" +
                    "6 1101021\n" +
                    "1 01\n" +
                    "3 8748\n" +
                    "4 00801\n" +
                    "6 4147911\n" +
                    "6 0060001\n" +
                    "6 7799634\n" +
                    "1 11\n" +
                    "6 3009001\n" +
                    "5 201002\n" +
                    "6 0000001\n" +
                    "2 901\n" +
                    "6 3001741\n" +
                    "0 1\n" +
                    "6 0080081\n" +
                    "1 43\n" +
                    "4 11111\n" +
                    "6 4000001\n" +
                    "6 9920001\n" +
                    "3 6099\n" +
                    "6 8870473\n" +
                    "5 020097\n" +
                    "5 726001\n" +
                    "6 3000091\n" +
                    "2 111\n" +
                    "6 1102201\n" +
                    "6 0000001\n" +
                    "4 00861\n" +
                    "6 0005001\n" +
                    "2 506\n" +
                    "6 9600305\n" +
                    "6 6570461\n" +
                    "6 1111111\n" +
                    "6 0000981\n" +
                    "4 01821\n" +
                    "6 2110111\n" +
                    "6 1222221\n" +
                    "6 5074001\n" +
                    "6 0008055\n" +
                    "6 2220222\n" +
                    "6 4752158\n" +
                    "6 0000001\n" +
                    "4 11111\n" +
                    "1 91\n" +
                    "6 2040001\n" +
                    "6 5059562\n" +
                    "6 2900781\n" +
                    "6 0400001\n" +
                    "6 4000601\n" +
                    "6 0002001\n" +
                    "2 211\n" +
                    "5 000001\n" +
                    "1 09\n" +
                    "6 0000001\n" +
                    "6 1500001\n" +
                    "0 1\n" +
                    "6 7558614\n" +
                    "2 701\n" +
                    "6 1206001\n" +
                    "5 110011\n" +
                    "6 1022201\n" +
                    "1 04\n" +
                    "5 000001\n" +
                    "6 0000001\n" +
                    "6 0705051\n" +
                    "2 008\n" +
                    "6 6810001\n" +
                    "1 61\n" +
                    "1 12\n" +
                    "2 301\n" +
                    "6 0000001\n" +
                    "6 0220202\n" +
                    "1 03\n" +
                    "6 0000052\n" +
                    "6 0000029\n" +
                    "0 1\n" +
                    "6 2111121\n" +
                    "6 2084001\n" +
                    "6 2120112\n" +
                    "0 7\n" +
                    "4 30201\n" +
                    "6 0000001\n" +
                    "6 7396057\n" +
                    "0 1\n" +
                    "6 0800001\n" +
                    "6 9999999\n" +
                    "6 0070008\n" +
                    "0 1\n" +
                    "6 6512425\n";

    public static void main(String[] args)
    {
        String[] lines = input.split("\n");

        for (int x=1; x < lines.length; x++)
        {
            String line = lines[x];

            Map audienceRow = new HashMap();

            int friendsNeeded = 0;
            int totalClapping = 0;
            char caseNumber = line.charAt(0);

            for (int i = 2; i < line.length(); i++)
            {
                char numberInRow = line.charAt(i);
                audienceRow.put(i-2, Integer.parseInt(String.valueOf(numberInRow)));
            }

            for (int i=0; i < audienceRow.size(); i++)
            {
                Integer numberInRow = (Integer) audienceRow.get(i);

                if (numberInRow > 0)
                {
                    if (i >= totalClapping)
                    {
                        friendsNeeded += i - totalClapping;
                        totalClapping += friendsNeeded + numberInRow;
                    } else
                    {
                        totalClapping += numberInRow;
                    }
                }
            }

            System.out.println("Case #"+x+": "+friendsNeeded);
        }
    }
}
