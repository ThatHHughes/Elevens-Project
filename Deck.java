
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
            
            for (String suitString : suits) {
				cards.add(new Card(ranks[i], suitString, values[i]));
	    }
        }
        
        this.size = this.cards.size();
        
        shuffle(); 
        
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
        return this.size; 
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
    
    public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
    
    public void shuffle () {
        for( int k = size - 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k);
            Card tmp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, tmp);
            }
    }
}
