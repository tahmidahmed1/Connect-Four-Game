import java.util.Scanner;

// Test class/ Driver code to demonstrate our Connect Four Model
public class Main {
    public static void main( String[] args ) {
        int column = 0;
        Scanner kbInput = new Scanner( System.in );
        
        ConnectFourGame game = new ConnectFourGame();
        
        do {
            System.out.println( game );
            System.out.println( "What Column?" );
            column = kbInput.nextInt();
            if ( game.drop( column ) == -1 ) {
                System.out.println( "\nCan't drop in column " + column );
                System.out.println( "Please Try Again..\n" );
            } 
        } while ( !game.hasWon() );
        
        System.out.println( game );
        System.out.println( "*** GAME OVER ***" );
    }   
}