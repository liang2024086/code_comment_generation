package methodEmbedding.Cookie_Clicker_Alpha.S.LYD207;

import java.util.*;
import java.math.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner cin=new Scanner(System.in);
    BigDecimal c,f,x,ans,t1,t2;
    BigDecimal now;
    int T,o;
    T=cin.nextInt();
    for (o=1;o<=T;o++)
    {
      c=cin.nextBigDecimal();
      f=cin.nextBigDecimal();
      x=cin.nextBigDecimal();
      now=new BigDecimal("2.0");
      ans=x.divide(now,20,BigDecimal.ROUND_HALF_UP);
      System.out.print("Case #"+o+": ");
      if (c.compareTo(x)!=-1)
      {
	System.out.println(ans.setScale(7,BigDecimal.ROUND_HALF_UP).toPlainString());
	continue;
      }
      t1=new BigDecimal("0.0");
      while (true)
      {
	t1=t1.add(c.divide(now,20,BigDecimal.ROUND_HALF_UP));
        //System.out.println(t1.setScale(7,BigDecimal.ROUND_HALF_UP).toPlainString());
	if (t1.compareTo(ans)!=-1)
	  break;
	now=now.add(f);
	t2=x.divide(now,20,BigDecimal.ROUND_HALF_UP);
	t2=t2.add(t1);
        //System.out.println(t2.setScale(7,BigDecimal.ROUND_HALF_UP).toPlainString());
	if (t2.compareTo(ans)==-1)
	  ans=t2;
      }
      System.out.println(ans.setScale(7,BigDecimal.ROUND_HALF_UP).toPlainString());
    }
  }
};
