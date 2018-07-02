package methodEmbedding.Standing_Ovation.S.LYD1183;


public final class Runner {

  public static final void main( final String[] args ) throws Exception {
    Class.forName( "com.google.codejam.sa4zet." + args[0] ).getConstructor( String.class ).newInstance( args[1] );
  }

}
