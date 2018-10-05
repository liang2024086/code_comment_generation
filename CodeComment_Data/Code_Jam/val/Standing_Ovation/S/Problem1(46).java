package methodEmbedding.Standing_Ovation.S.LYD172;

/* I use stdlib.jar and algs4.jar.  Downloadable
 * at http://algs4.cs.princeton.edu/code/
 */
public class Problem1 {
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        
        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            int num = 0;
            String s = in.readLine();
            int m = s.charAt(0) - 48;
            int standing = 0;
            for (int j = 2; j < m + 3; j++) {
                
                if (standing < j - 2) {
                    num += j - 2 - standing;
                    standing += j - 2 - standing; 
                }
                standing += s.charAt(j) - 48;
            }
            StdOut.printf("Case #%d: %d\n" , i + 1, num);
        }
        
        
        
    }
}
