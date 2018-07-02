package methodEmbedding.Speaking_in_Tongues.S.LYD157;


/**
 * 
 */

/**
 * Class to translate Googlerese to some form of valid or invalid English
 * 
 * @author bluea
 *
 */
public class GooglereseTranslator
{
    public static void main(String [] args)
    {
        //If the number of arguments is not 1 print and error and exit
        if (args.length != 1)
        {
            System.out.println("Ops, this program expects exactly 1 input - The full file path for the input file");
            return;
        } //if
        
        ProcessInput process = new ProcessInput();
        process.run(args[0]);
    } //main
} //Class
