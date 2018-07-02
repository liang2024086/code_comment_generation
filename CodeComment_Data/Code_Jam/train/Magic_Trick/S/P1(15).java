package methodEmbedding.Magic_Trick.S.LYD1572;


import java.util.*;

public class P1{

   private static int numCases;
   private static int firstRow;
   private static int secondRow;
   private static int[][] firstSet = new int[4][4];
   private static int[][] secondSet = new int[4][4];
   private static int matches;
   private static int possmatch;
   private static String result;

	public static void main(String [] args){

      Scanner sc = new Scanner(System.in);

      numCases = sc.nextInt();

      for(int i = 0; i < numCases; i++){

         matches = 0;
         possmatch = 0;

         firstRow = sc.nextInt() - 1;

         for(int j = 0; j < 4; j++){
            for(int k = 0; k < 4; k++){
               firstSet[j][k] = sc.nextInt();

//               System.out.println("firstSet["+j+"]["+k+"] = " + firstSet[j][k]);
            }
         }

         secondRow = sc.nextInt() - 1;

         for(int j = 0; j < 4; j++){
            for(int k = 0; k < 4; k++){
               secondSet[j][k] = sc.nextInt();
 //              System.out.println("secondSet["+j+"]["+k+"] = " + secondSet[j][k]);
            }
         }

         for(int j = 0; j < 4; j ++){
            for (int k = 0; k < 4; k++){

 //              System.out.println("nums compared = " + firstSet[firstRow][j] + " " + secondSet[secondRow][k]);
               if(firstSet[firstRow][j] == secondSet[secondRow][k]){
                  matches++;
                  possmatch = firstSet[firstRow][j];

               }
            }
         }

  //       System.out.println("matches = " +matches);
   //      System.out.println("poss matchs = " + possmatch);

         switch(matches){

            case 0: result = "Volunteer cheated!";
                    break;
            case 1: result = "" + possmatch;
                    break;
            default: result = "Bad magician!";
                    break;


         }

         System.out.println("Case #" + (i+1) + ": " + result);
      }
	}
}



