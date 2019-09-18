



import java.util.Scanner;
public class classwork5
{
  public static void main(String[]args)
   {
    // exersice 2
       /*    for(int i = 0; i < 50; i += 1)
     {
    double randNum = (int)(Math.random()*6)+1;
     double randNum2 = (int)(Math.random()*6)+1;
     int outRoll = (int)(randNum + randNum2);
     System.out.println("you rolled a "+ outRoll);
     if(outRoll == 7 ||outRoll == 11){
         System.out.println("You win"); 
     }else if(outRoll == 2 || outRoll == 3 || outRoll == 12){
         System.out.println("You lose");
     }else{
         System.out.println("Keep playing");
     }
     // exercise 3
     for(int i = 0; i < 50; i += 1)
    {
    System.out.println("Magic 8 ball");
    System.out.println("Ask me a question");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
     double randNum = (int)(Math.random()*7)+1;
      if(randNum == 1){
          System.out.println("you may never know");
        }else if(randNum == 2){
             System.out.println("Yes");
        }else if(randNum == 3){
             System.out.println("No");
        }else if(randNum == 4){
             System.out.println("What? ask again");
        }else if(randNum == 5){
             System.out.println("ask again later I'm on break");
        }else if(randNum == 6){
             System.out.println("Screw off and figure it out on your own");
        }else if(randNum == 7){
             System.out.println("ask google");
     }
    }*/
    // exersice 4
    System.out.println("Dice generator");
    System.out.println("Enter the number of sides:");
    Scanner scan = new Scanner(System.in);
    int side = scan.nextInt();
    if(side <= 0)
    System.out.println("invalid entry");
    double roll = (int)(Math.random()* side)+1;
    
    
  }
}
