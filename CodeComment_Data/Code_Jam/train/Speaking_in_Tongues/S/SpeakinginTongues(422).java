package methodEmbedding.Speaking_in_Tongues.S.LYD505;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import code.jam.taipei2011.qualification.Magicka;

/******************************************************************************
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2011</p>
 * <p>Company: auer.com.tw</p>
 *
 * @author JasonHsu
 * @version 1.0
 *****************************************************************************/
public class SpeakinginTongues
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    File input = new File("/Users/jason/Downloads/A-small-attempt1.in");
    
    if (!input.exists())
    {
      System.out.println("Input file is not exist!!");
      System.exit(0);
    }
    
    BufferedReader br = null;
    FileWriter fw = null;
    
    try
    {
      br = new BufferedReader(new FileReader(input));
      
      //???????????????, ??????????????? case...
      int case_count = 0;
      
      try
      {
        case_count = Integer.parseInt(br.readLine());
      }
      catch (Exception e)
      {
        System.out.println("case count parsing error !!");
        System.exit(0);
      }
      
      //??????????????? map...
      HashMap<Character,Character> hm = new HashMap<Character,Character>(32);
      String q = "qaoz ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
      String a = "zyeq our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
      
      for (int i = 0; i < q.length(); ++i)
        hm.put(q.charAt(i), a.charAt(i));
      
      System.out.println("hm size = "+hm.size());
      
      //????????? Debug Code ...
//      Set<Character> ss = hm.keySet();
//      StringBuffer ques = new StringBuffer();
//      StringBuffer answ = new StringBuffer();
//      for (char c : ss)
//      {
//        ques.append(c);
//        answ.append(hm.get(c));
//      }
//      
//      System.out.println(ques);
//      System.out.println(answ);
      
      //????????????????????????...
      StringBuffer answer_str = new StringBuffer();
      
      //Loop, ??????Test Case...
      for (int i = 1; i <= case_count; i++)
      {
        //???????????? Test Case...
        String test_case = br.readLine().trim();
        
        //????????????...
        answer_str.append("Case #").append(i).append(": ");
        
        //??????????????????...
        for (int j = 0; j < test_case.length(); ++j)
          answer_str.append(hm.get(test_case.charAt(j)));
    
        //??????????????????...
        answer_str.append("\n");
      }//for (int i = 1; i <= case_count; i++)
      
      //????????????...
      System.out.println("out answer : ");
      System.out.println(answer_str.toString());
      
      //???????????????...
      fw = new FileWriter("/Users/jason/Downloads/A-small-attempt1.out");//???????????????...
      fw.write(answer_str.toString().trim());
      fw.flush();
      
      //????????????...
      System.exit(0);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        br.close();
      }
      catch (IOException e){};
      
      try
      {
        fw.close();
      }
      catch (IOException e){};
    }

  }

}
