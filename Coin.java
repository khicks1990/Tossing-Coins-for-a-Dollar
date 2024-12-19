import java.util.Random;

/**
   The Coin class stores data about a coin
   for the Tossing Coins for a Dollar  
   programming challenge.
*/

public class Coin
{
   private String sideUp; // The side facing up
   
   /**
      The constructor randomly sets the side of
      the coin that is facing up: heads or tails.
   */
   public Coin()
   {
      // Call the toss method to set the
      // initial state of sideUp.
      toss();
   }
   
   /**
      The toss method simulates the tossing of
      the coin. After the method executes, the
      sideUp field will be randomly set to either
      "heads" or "tails".
   */
   public void toss()
   {
      // Create a random object.
      Random rand = new Random();
      
      // Get a random value, 0 or 1.
      int value = rand.nextInt(2);
      
      // Set the value of sideUp.
      // 0 = "heads" or 1 = "tails"
      if (value == 0)
         sideUp = "heads";
      else
         sideUp = "tails";
   }
   
   /**
      The getSideup method
      @return The side of the coin facing up.
   */
   public String getSideUp()
   {
      return sideUp;
   }
}