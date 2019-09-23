public class Classwork7
{
   public static void main(String[]args)
   {
       
      
   } 
   
   public static double findSum(int a , int b)
   {
       return a + b;
   }
   
   public static String canIVote(int age)
   {
      if (age > 18)
       return "you can vote";
      else
        return "you can't vote";
   }    
   
   public static String europeDrinking(int age2)
   {
     if(age2 < 16){
         return "You can't drink";
      }else if(age2 >= 16 && age2 < 21){
         return "You can drink wine and beer only";
      }else{
      return "you can drink any alcohol";
    }
   }    
}