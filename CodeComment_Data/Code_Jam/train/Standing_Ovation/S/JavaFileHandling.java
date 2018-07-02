package methodEmbedding.Standing_Ovation.S.LYD1002;



public class JavaFileHandling 
{

    public static void main(String[] args) 
    {
        readFromFile read=new readFromFile();
        read.openFile();
        read.readFile();
        read.closeFile();
    }
    
}
