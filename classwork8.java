public class classwork8{
    public static void main(String[] args){
        System.out.println(raceToday(30, true));
        System.out.println(raceToday(450, false));
        System.out.println(raceToday(700, true));
        System.out.println(raceToday(850, true));
        
        System.out.println(numVal(10));
        System.out.println(numVal(9));
        System.out.println(numVal(15));
    }
    public static boolean raceToday(int size, boolean isFriday){
        if(isFriday == false)
            return false;
        else if(isFriday == true && (size > 150 && size < 800))
            return true;
        else 
        return false;
    }
    public static int numVal(int num){
        if(num % 2 == 0)
           return num * 5;
        else if(num % 5 == 0)
            return num / 5;
        else
            return num * 3;
    }
}