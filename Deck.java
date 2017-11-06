
import java.util.List; 
import java.util.ArrayList; 

/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    
    private List<Card> cards;
    private int size; 
    
    public Deck (String[] ranks,String[] suits, int[] values) {
        this.cards = new ArrayList<Card>(); 
        
        for (int i = 0; i < values.length; i++) {
            Card aCard = new Card(ranks[i], suits[i], values[i]); 
            this.cards.add(aCard); 
        }
        
        this.size = this.cards.size();
    }
    
    public boolean isEmpty () {
        if (this.cards.size() == 0) {
            return true;
        }
        else {
            return false; 
        }
    }
    
    public int size () {
        return this.cards.size(); 
    }
    
    public Card deal () {
        this.size = this.size - 1;
        if (size > 1) {
            return this.cards.get(this.size); 
        }
        else {
            return null; 
        }
    }
}
