package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1427;

import java.util.*;
import java.io.*;
class Q2
    {
        public static void main()throws IOException
            {
                 FileReader a = new FileReader("Q2IN.txt");
                 BufferedReader b = new BufferedReader(a);
                 FileWriter c = new FileWriter("Q2OU.txt");
                 BufferedWriter d = new BufferedWriter(c);
                 PrintWriter e = new PrintWriter(d);
                 int limit=Integer.parseInt(b.readLine());
                 int start=1;
                 while(start<=limit)
                    {
                        e.print("Case #"+start+": ");
                        StringTokenizer t = new StringTokenizer(b.readLine());
                        double C = Double.parseDouble(t.nextToken());
                        double F = Double.parseDouble(t.nextToken());
                        double X = Double.parseDouble(t.nextToken());
                        double D=2;
                        if(C>X)
                            e.println(X/D);
                        else
                            {
                                double t1,t2;
                                t1 = X/D;
                                D+=F;
                                t2 = C/2+X/D;
                                while(t2<t1)
                                    {
                                        t1=t2;
                                        t2-=X/D;
                                        double y = C/D;
                                        D+=F;
                                        t2+=y;
                                        t2+=X/D;
                                    }
                                e.println(t1);
                            }
                        start++;
                    }
                 e.close();
                 d.close();
                 c.close();
                 b.close();
                 a.close();
            }
    }
