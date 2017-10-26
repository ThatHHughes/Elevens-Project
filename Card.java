
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
      private String cardRank; 
      private String cardSuit; 
      private int cardPoints; 
      
    
      public Card(String suit, String rank, int points){
           this.cardSuit = suit; 
           this.cardRank = rank; 
           this.cardPoints = points; 
      }
        
      public String seeRank () {
           return this.cardRank; 
      }
      
      public String seeSuit () {
          return this.cardSuit;
        }
      
      public int points () {
          return this.cardPoints; 
        }
        
      public Boolean matches (Card card2) {
          if (this.cardRank.equals(card2.cardRank) && this.cardSuit.equals(card2.cardSuit) && this.cardPoints == card2.cardPoints) {
              return true; 
            }
          else {
              return false; 
            }
        }
        
      public String toString () {
          return this.cardRank + " of " + this.cardSuit + "s (point value = " + this.cardPoints + ")";
        }
        
      
}
