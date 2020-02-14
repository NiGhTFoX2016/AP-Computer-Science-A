import java.util.*;
/**
 * Write a description of class deck here.
 *
 * @author Jason Schoenmann
 * @version 1.0
 */
public class Deck
{
    private ArrayList<Cards> deck;
    
    public Deck()
    {
      deck = new ArrayList<Cards>();
      for(int i = 1; i < 14; i++)
       {
           Cards spades = new Cards("Spade", i);
           deck.add(spades);
           Cards hearts = new Cards("Heart", i);
           deck.add(hearts);
           Cards clubs = new Cards("Club", i);
           deck.add(clubs);
           Cards dia = new Cards("diamond", i);
           deck.add(dia);
       }
    }
    
    //public String toString()
    {
        
    }   
}