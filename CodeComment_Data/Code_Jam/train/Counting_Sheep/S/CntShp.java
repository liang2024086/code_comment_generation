package methodEmbedding.Counting_Sheep.S.LYD134;

import java.io.*;


public class CntShp
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\praveen\\Downloads\\A-small-attempt0.in"));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new FileWriter("C:\\Users\\praveen\\Downloads\\A-small-out.in"));
        int tt = Integer.parseInt(br.readLine()) , i , j ;
        long zero = 0 , lng = 0 , N;
        boolean verify[] , ans , b;
        long tmp;
        String st;
        for ( i = 0 ;i  < tt; i++)
        {
            verify = new boolean[10];
            ans = false;
            tmp = 1;
            N = Long.parseLong(br.readLine());
            if ( N == 0)
            {
                System.out.println("INSOMINA");
                w.write("Case #" + (i + 1) + ": " + "INSOMNIA");
                w.newLine();
            }
            else
            {
                while (!ans)
                {

                    lng = N * tmp;
                    tmp++;
                    //System.out.println(big);
                    st = Long.toString(lng);
                    for ( j = 0 ;j < st.length() ; j++)
                    {
                        verify[st.charAt(j) - '0'] = true;
                    }
                    b = true;
                    for ( j = 0 ; j < 10 ; j++)
                    {
                        if ( !verify[j] )
                        {
                            b = false;
                        }

                    }
                    ans = b;
                }
                w.write("Case #"+(i+1)+": " + lng);
                w.newLine();
                System.out.println(lng);
            }

        }
        w.close();
    }
}
