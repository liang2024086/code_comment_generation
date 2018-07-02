package methodEmbedding.Speaking_in_Tongues.S.LYD893;


public class Solver
{
    private static String enc =  "---------------------------";
    private static String orig = "abcdefghijklmnopqrstuvwxyz ";
    
    
    private static String case1Enc = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
    private static String case1Dec = "our language is impossible to understand";
    private static String case2Enc = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
    private static String case2Dec = "there are twenty six factorial possibilities";
    private static String case3Enc = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
    private static String case3Dec = "so it is okay if you want to just give up";
    
    public Solver()
    {
        
    }

    /*
     * Outputs
     * ynficwlbkuomxsev-pdrjgtha- 
     * abcdefghijklmnopqrstuvwxyz 
     * 
     * From the problem we know z maps to q, so the logical conclusion is the mapping string is
     * ynficwlbkuomxsevzpdrjgthaq 
     * abcdefghijklmnopqrstuvwxyz 
     */
    public static void main(String[] args)
    {
        int i = 0;
        for(i = 0; i < case1Enc.length() ;i++)
        {
            int index = orig.indexOf(case1Dec.charAt(i));
            enc = enc.substring(0, index) + case1Enc.charAt(i) + enc.substring(index+1);
            System.out.println(enc);
        }
        for(i = 0; i < case2Enc.length() ;i++)
        {
            int index = orig.indexOf(case2Dec.charAt(i));
            enc = enc.substring(0, index) + case2Enc.charAt(i) + enc.substring(index+1);
            System.out.println(enc);
        }
        for(i = 0; i < case3Enc.length() ;i++)
        {
            int index = orig.indexOf(case3Dec.charAt(i));
            enc = enc.substring(0, index) + case3Enc.charAt(i) + enc.substring(index+1);
            System.out.println(enc);
        }
        System.out.println(orig);
    }
    
}
