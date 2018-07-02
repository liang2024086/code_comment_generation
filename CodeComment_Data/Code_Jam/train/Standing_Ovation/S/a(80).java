package methodEmbedding.Standing_Ovation.S.LYD2150;

 // clear; javac a.java && cat a.in | java a && echo "--" && cat a.out

    import java.lang.Object;
    import java.lang.String;
    import java.lang.Integer;
    import java.util.Scanner;

    public class a

        {
     // Public
     
        public static void main (String [] data)

            {
            Scanner scanner = new Scanner (System.in);
            
            int tests = scanner.nextInt (); // 1 ... 100
            
            for (int test = 1; test <= tests; test ++)
            
                {
                scanner.nextInt ();
                
                String [] digits = scanner.nextLine ().trim ().split ("");
                int quantity = 0;
                int answer = 0;
               
                for (int d = 0; d < digits.length; d ++)
                
                    {
                    quantity += Integer.parseInt (digits [d]);
                    
                    if (quantity <= d)

                        {
                        int difference = (d + 1) - quantity;
                        quantity += difference;
                        answer += difference;
                        }
                    }
               
                System.out.println ("Case #" + test + ": " + answer);
                }
            }
        }
