import java.util.Scanner;
public class classwork4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name +". My name is Personl Computer. Or PC for short.");
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age < 16)
        {
            System.out.println("That sucks");
        } else{
            System.out.println("You can consume beer and wine in most european countries.");
            System.out.println("You can also get your driver license");
        }
        
        
   
     
    
    
    
    
    }
    
}