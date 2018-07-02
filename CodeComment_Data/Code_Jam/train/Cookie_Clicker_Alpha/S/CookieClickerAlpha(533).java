package methodEmbedding.Cookie_Clicker_Alpha.S.LYD154;

public class CookieClickerAlpha
{
      public static void main(String args[])
      {
            In in = new In(args[0]);
            int N = in.readInt();
            
            for (int i = 0; i < N; i++)
            {
                  double R = 2.0;
                  double C = in.readDouble();
                  double F = in.readDouble();
                  double X = in.readDouble();
                  
                  double minTime = 0;
                  boolean flag = true;
                  
                  while (flag)
                  {
                        double time1 = X / R;
                        double time2 = (C / R) + (X/ (R + F));
                        
                        if (time1 < time2)
                        {
                              minTime += time1;
                              flag = false;
                        }
                        
                        else
                        {
                              double timeSpent = C / R;
                              minTime += timeSpent;
                        }
                        
                        R = R + F;
                  }
                  
                  System.out.println("Case #" + (i+1) + ": " + minTime);
            }
      }
}
