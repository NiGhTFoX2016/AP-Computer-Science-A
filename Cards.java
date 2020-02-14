
public class Cards
{
   private String suit;
   private int num;
   public Cards(String s, int n)
    {
      suit = s;
      num = n;
    }
   public void setSuit(String s)
    {
      suit = s;  
    }
   public void setNum(int n)
   {
       num = n;
   }
   public String getSuit()
   {
     return suit;  
    }
   public int getNum()
   {
      return num; 
   }
   
   public String toString()
   {
       if (num == 11)
           return "Jack of " + suit;
       else if (num == 12)
            return "Queen of " + suit;
       else if (num == 13)
            return "King of " + suit;
       else if (num == 1)
            return "Ace of " + suit;
       return num + "of " + suit;    
   }
   
   public boolean checkSameSuit(Cards c)
   {
       return this.suit.equals(c.getSuit());
    }
    
   public boolean checkSameNum(Cards n)
   {
       return getNum() == getNum();
   }
   
   
}
