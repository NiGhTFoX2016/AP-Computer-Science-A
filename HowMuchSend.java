/**
 * @author Jason Schoenmann
 */
public class HowMuchSend
{
   private int stoke;
   private int bikeTravel;
   private int whipRate;
   
   public HowMuchSend()
   {
       stoke = 5;
   }
   
   public HowMuchSend(int st, int bt, int wr)
   {
       stoke = st;
       bikeTravel = bt;
       whipRate = wr;
   }
   
   public void setStoke(int st)
   {
       stoke = st;
   }
   
   public void setSTravel(int tr)
   {
       bikeTravel = tr;
   }
   
   public void setWhip(int wr)
   {
       whipRate = wr;
   }
   
   public int getStoke()
   {
       return stoke;
   }
   
   public int getBike()
   {
       return bikeTravel;
   }
   
   public int getWhip()
   {
       return whipRate;
   }
   
   public String toString()
   {
    return "stoke level: " + stoke + " - bike travel: " + bikeTravel + "mm - whip rate: " + whipRate;    
   }
   
   public boolean equals(HowMuchSend s)
   {
     if(stoke == s.getStoke() && bikeTravel == s.getBike() && whipRate == s.getWhip()){
         return true;
        }else{
            return false;
        }  
   }
}
