package methodEmbedding.Magic_Trick.S.LYD1861;

import java.util.*;
import java.io.*;
class Q1
    {
        public static void main()throws IOException
            {
                 FileReader a = new FileReader("Q1IN.txt");
                 BufferedReader b = new BufferedReader(a);
                 FileWriter c = new FileWriter("Q1OU.txt");
                 BufferedWriter d = new BufferedWriter(c);
                 PrintWriter e = new PrintWriter(d);
                 int limit=Integer.parseInt(b.readLine());
                 int start=1;
                 while(start<=limit)
                    {
                        e.print("Case #"+start+": ");
                        int p1=Integer.parseInt(b.readLine())-1;
                        int n1[][] = new int[4][4];
                        for(int i=0;i<4;i++)
                            {
                                StringTokenizer t = new StringTokenizer(b.readLine());
                                for(int j=0;j<4;j++)
                                    {
                                        n1[i][j] = Integer.parseInt(t.nextToken());
                                    }
                            }
                        int p2=Integer.parseInt(b.readLine())-1;
                        int n2[][] = new int[4][4];
                        for(int i=0;i<4;i++)
                            {
                                StringTokenizer t = new StringTokenizer(b.readLine());
                                for(int j=0;j<4;j++)
                                    {
                                        n2[i][j] = Integer.parseInt(t.nextToken());
                                    }
                            }
                        int count=0;
                        int g1=0,g2=0;
                        for(int i=0;i<4;i++)
                            {
                                for(int j=0;j<4;j++)
                                    {
                                        if(n1[p1][i]==n2[p2][j]&&count==0)
                                            {
                                                count+=1;
                                                g1=p1;
                                                g2=i;
                                            }
                                        else if(n1[p1][i]==n2[p2][j])
                                            {
                                                count+=1;
                                            }
                                    }
                            }
                        if(count==1)
                            e.println(n1[g1][g2]);
                        else if(count>0)
                            e.println("Bad magician!");
                        else
                            e.println("Volunteer cheated!");
                        start++;
                    }
                 e.close();
                 d.close();
                 c.close();
                 b.close();
                 a.close();
            }
    }
