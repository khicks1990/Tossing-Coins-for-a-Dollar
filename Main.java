/**
   This program demonstrates a solution to the
   Tossing Coins for a Dollar programming challenge.
*/

public class Main
{
   public static void main(String args[])
   {
      // Constants
      final double ONE_DOLLAR          = 1.00;  // The value of a dollar.
      final double TWENTY_FIVE_CENTS   = 0.25;  // The value of a quarter.
      final double TEN_CENTS           = 0.10;  // The value of a dime.
      final double FIVE_CENTS          = 0.05;  // The value of a nickle.
      
      // Reference variables
      Coin quarter = new Coin();    // A Coin object representing a quarter
      Coin dime = new Coin();       // A Coin object representing a dime.
      Coin nickle = new Coin();     // A Coin object representing a nickle.
      
      // Variables
      double balance = 0.00;        // The balance, starting at $0.00.
      
      // Play the game while the balance is less than $1.00.
      while (balance < ONE_DOLLAR)
      {
         quarter.toss();   // Toss the quarter.
         dime.toss();      // Toss the dime.
         nickle.toss();    // Toss the nickle.
         
         // Did the quarter land heads-up?
         if(isHeadsUp(quarter))
            // If so, add $0.25 to the user's balance.
            balance += TWENTY_FIVE_CENTS;
         // Did the dime land heads-up?   
         if(isHeadsUp(dime))
            // If so, add $0.10 to the user's balance.
            balance += TEN_CENTS;
         // Did the nickle land heads-up? 
         if(isHeadsUp(nickle))
            // If so, add $0.05 to the user's balance.   
            balance += FIVE_CENTS;
      }
      
      // Display the ending balance.
      System.out.printf("Balance: $%,1.2f\n", balance);
      
      // Was the balance equal to exactly $1.00?
      if(balance == ONE_DOLLAR)
         // If so, display the winning message.
         System.out.println("You win!");
      // Otherwise, the balance has exceeded $1.00.
      else
         // Display the losing message.
         System.out.println("You did not win.");
   }
   
   /**
      The isHeadsUp method
      @param coin A reference to a Coin object.
      @return true if the coin is facing 
              heads-up, otherwise returns false.
   */
   
   public static boolean isHeadsUp(Coin coin)
   {
      boolean status = false;
      
      switch(coin.getSideUp())
      {
         case "heads":
            status = true;
            break;
      }
      
      return status;
   }
}