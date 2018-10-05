package methodEmbedding.Standing_Ovation.S.LYD67;

/* **********************************************************************
 * Copyright 2015 VMware, Inc.  All rights reserved. VMware Confidential
 * *********************************************************************/


import java.util.Scanner;

/**
 * <code>StandingOvation</code> is ... <br>
 */
public class StandingOvation {

   /**
    *
    *
    * @param args
    */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for(int i=0;i<t;++i){
         int x= in.nextInt();
         String s=in.next();
         int curCount = s.charAt(0)-'0';
         int peopleNeeded = 0;
         for(int j=1;j<s.length();j++){
            int curStep = s.charAt(j)-'0';
            int curDiff = (peopleNeeded + curCount-j);
            int moreNeeded = (curStep == 0)? 0 : ((curDiff>=0)?0: -1*curDiff);
            curCount += curStep;
            peopleNeeded += moreNeeded;
         }
         System.out.println("Case #" + (i+1) + ": " + peopleNeeded);
      }
      in.close();
   }

}
