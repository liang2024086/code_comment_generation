package methodEmbedding.Magic_Trick.S.LYD369;


import com.google.codjam.problems.MagicTrick;


public class MainRun {

    public static void main(String[] args) 
    {
        String prefixPath = "C:\\Users\\JP\\Documents\\NetBeansProjects\\OldCodeJam\\src\\";
        FileDataAndSettings fS  = new FileDataAndSettings();
        FileLoader.processFile( fS ,prefixPath+ "input.in", 10  ,new MagicTrick() );

    }
    

}
