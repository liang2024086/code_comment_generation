package methodEmbedding.Standing_Ovation.S.LYD599;

import java.util.*;
import java.io.*;
class StandingOvation
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int test_case = 1;
        while(T-->0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxShy = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int len = s.length();
            int number_of_people_currently_standing = 0;
            int add = 0;
            for(int i=0;i<len;i++)
            {
                int number_of_people_with_shyness_i = s.charAt(i)-48;
                if(number_of_people_currently_standing>=i)
                    number_of_people_currently_standing+=number_of_people_with_shyness_i;
                else
                {
                    add+=(i-number_of_people_currently_standing);
                    number_of_people_currently_standing+=(i-number_of_people_currently_standing)+number_of_people_with_shyness_i;
                }
            }
            System.out.println("Case #"+test_case+++": "+add);
        }
    }
}
